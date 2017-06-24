<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>

<style>
td{padding:10px}
table
{
border-collapse:collapse;
}
table, th, td
{
border:1px solid #B3CBD6;
}
th
{
background-color: #E6F0F3;
}
</style>

<script type="text/javascript">
function setAction(action)
{
	var targetForm = $("#loaForm");
	var actionType = $("#loaActionType");
	actionType.val(action);
	targetForm.submit();
}

function cancelRequest()
{
	var targetForm = $("#loaForm");
	var actionType = $("#loaActionType");
	var cancelReason = $("#cancelReason");
	actionType.val("cancel");
	var reason = prompt("Nhập lí do hủy: ");
	if(reason != null){
		if(reason != ""){
			cancelReason.val(reason);
			alert("reason " + reason);
			targetForm.submit();
		}else{
			alert("Lí do hủy không được trống");
		}
	}else{
		return false;
	}
}
</script>



<div class="floatleft grid_2 txtname">Mã đơn:</div><div class="floatleft grid_10" ><s:text name="loaLetter.iID"></s:text></div><br/>
<div class="floatleft grid_2 txtname">Tình trạng: </div><div class="floatleft grid_10" ><s:property value = "getLoaStatus()"></s:property></div>
<hr/>
<div class="floatleft grid_2 txtname">Họ tên: </div><div class="floatleft grid_10" ><s:text name="loaOwner.sFullname"></s:text></div><br/>
<div class="floatleft grid_2 txtname">MSNV: </div><div class="floatleft grid_10" ><s:text name="loaOwner.sID"></s:text></div><br/>
<s:date name="loaLetter.dSentday" var="writeDay" format="yyyy/MM/dd"/>
<div class="floatleft grid_2 txtname">Ngày viết:  </div><div class="floatleft grid_10" ><s:property value="%{writeDay}"/></div><br/>
<div class="floatleft grid_2 txtname">Dự án: </div><div class="floatleft grid_10" > <s:text name="project.sFullname"></s:text></div><br/>
<hr/>

<s:if test="isOwner == true">
<div style="display:none">
	<s:form id="loaForm" action = "loaFormAction" >
		<s:hidden name="loaID" value="%{loaLetter.iID}"></s:hidden>
		<s:hidden name="loaActionType" id="loaActionType"></s:hidden>
		<s:hidden name="cancelReason" id="cancelReason"></s:hidden>
	</s:form>
</div>
<div class="floatright grid_10">
	<s:if test="loaLetter.iStatus == 0">
		<button onclick="setAction('send')">Gửi đơn</button>
	</s:if>
	<s:if test="loaLetter.iStatus < 4 && loaLetter.iStatus > 1">
		<button onclick="cancelRequest()">Yêu cầu hủy</button>
	</s:if>
	<s:if test="loaLetter.iStatus < 2 && loaLetter.iStatus > -1">
		<button onclick="setAction('edit')">Sửa đơn</button>
	</s:if>
	<s:if test="loaLetter.iStatus < 2 && loaLetter.iStatus > -1">
		<button onclick="setAction('remove')">Xóa đơn</button>
	</s:if>
</div>
<hr/>
</s:if>

<h4>Danh sách ngày nghỉ</h4>
<display:table id="detailList" name="loaDetails" uid="row"
	cellpadding="2px;"
	cellspacing="2px;" style="width:100%">
	<display:setProperty name="basic.msg.empty_list" 
    	value="<tr>Không có dữ liệu</tr>" />
	<display:column title="STT">
		<s:property value = "#attr.row_rowNum"/>
	</display:column>
	<display:column property="DFromday" title="Từ ngày"
		format="{0,date,yyyy/MM/dd}"></display:column>
	<display:column property="DToday" title="Đến ngày"
		format="{0,date,yyyy/MM/dd}"></display:column>
	<display:column property="IDayno" title="Số ngày"></display:column>
	<display:column title="Loại phép">
		<s:property value="convertLoaDetailType(#attr.row.IType)"/>
	</display:column>
	<display:column property="SReason" title="Lý do"></display:column>
</display:table>
<hr/>

<h4>Lịch sử</h4>
<display:table id="historyList" name="loaHistory" uid="row"
	cellpadding="2px;"
	cellspacing="2px;" style="width:100%">
	<display:setProperty name="basic.msg.empty_list" 
    	value="<tr>Không có dữ liệu</tr>" />
	<display:column title="STT">
		<s:property value = "#attr.row_rowNum"/>
	</display:column>
	<display:column property="DChgDate" title="Ngày"
		format="{0,date,yyyy/MM/dd}"></display:column>
	<display:column property="SManID" title="Người duyệt"></display:column>
	<display:column title="Kết quả">
		<s:property value = "convertLetterAction(#attr.row.IStatus)"/>
	</display:column>
	<display:column property="SNote" title="Ghi chú"></display:column>
</display:table>