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

</script>

<h1>Đơn xin nghỉ phép</h1>

<div class="floatleft grid_2 txtname">Mã đơn:</div><div class="floatleft grid_10" ><s:text name="loaLetter.iID"></s:text></div><br/>
<div class="floatleft grid_2 txtname">Tình trạng: </div><div class="floatleft grid_10" ><s:property value = "getLoaStatus()"></s:property></div>
<hr/>
<div class="floatleft grid_2 txtname">Họ tên: </div><div class="floatleft grid_10" ><s:text name="loaOwner.sFullname"></s:text></div><br/>
<div class="floatleft grid_2 txtname">MSNV: </div><div class="floatleft grid_10" ><s:text name="loaOwner.sID"></s:text></div><br/>
<s:date name="loaLetter.dSentday" var="writeDay" format="yyyy/MM/dd"/>
<div class="floatleft grid_2 txtname">Ngày viết:  </div><div class="floatleft grid_10" ><s:property value="%{writeDay}"/></div><br/>
<div class="floatleft grid_2 txtname">Dự án: </div><div class="floatleft grid_10" > <s:text name="project.sFullname"></s:text></div><br/>
<hr/>

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

<s:form id="loaForm" action = "approveLoaAction" >
	<s:hidden name="loaID" value="%{loaLetter.iID}"></s:hidden>
	<s:hidden name="loaActionType" id="loaActionType"></s:hidden>
	<s:textarea name="approveNote" rows="4" cols="80"></s:textarea>
</s:form>
<button onclick="setAction('approve')">Đồng ý</button>
<button onclick="setAction('deny')">Từ chối</button>