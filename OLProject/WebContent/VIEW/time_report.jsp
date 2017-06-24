<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>
<script>
function addDatePopup(id, fillnow){
	$("input[name='"+id+"']" ).datepicker({ showOn: "both",	buttonImage: "<%=request.getContextPath()%>/IMG/calendar.gif", dateFormat: 'yy/mm/dd' });
	if(fillnow==1) $("input[name='"+id+"']" ).val($.datepicker.formatDate('yy/mm/dd', new Date()));
}
$(function() {
	addDatePopup('fromday', 0);
	addDatePopup('today', 0);
});
</script>
<s:form action="time_report" method="post">
	<s:date name="fromday" var="fday" format="yyyy/MM/dd" />
	<div class="floatleft grid_2 txtname">Từ ngày:</div><div class="floatleft grid_10"><input type="text" value="<s:property value="%{fday}"/>" name="fromday"/></div>
	<div class="clear"></div>
	<s:date name="today" var="tDate" format="yyyy/MM/dd" />
	<div class="floatleft grid_2 txtname">Đến ngày:</div><div class="floatleft grid_10"><input type="text" value="<s:property value="%{tDate}"/>" name="today"/></div>
	<div class="clear"></div>
	
	<div class="floatleft grid_2 txtname">Mã NV:</div><div class="floatleft grid_10"><input type="text" value="<s:property value="empID"/>" name="empID" maxlength="20"/></div>
	<div class="clear"></div>
	
	<div class="floatleft grid_2 txtname">Dự án:</div><div class="floatleft grid_10">
	<select name="prjID">
			<option value="0">Tất cả</option>
			<s:iterator value="pList" status="pListStatus">
				<option value="<s:property value="iID"/>"><s:property value="SFullname"/></option>
			</s:iterator>
	</select>
	</div>
	<div class="clear"></div>
	<div class="clear" style="height:10px"></div>

	<div class="floatleft grid_2 txtname">&nbsp;</div><div class="floatleft grid_10"><input type="submit" value="Tìm" class="btn"/> <input type="reset" value="Nhập lại" class="btn btn-navy"/></div>
	<div class="clear"></div>
</s:form>
<div class="clear" style="height:10px"></div>

<h3>Kết quả:</h3>

<div class="dtbl">
			<s:set value="#pgList.pageSize" var="sp"/><s:property value="sp" escapeHtml="true" />
			<display:table id="txt" requestURI="" uid="row" export="true" name="pgList" pagesize="10" size="100" cellpadding="2px;"
				cellspacing="2px;" partialList="true" sort="external">
				<display:column sortable="true" title="STT" style="width:50px"><s:property value="#attr.row_rowNum"/></display:column>
				<display:column sortable="true" property="sentDay" title="Ngày tạo"></display:column>
				<display:column sortable="true" property="empName" title="Tên nhân viên"></display:column>
				<display:column title="Ngày nghỉ">
					Từ ngày <s:date name="%{#attr.row.fromDay}" format="yyyy/MM/dd" /> đến <s:date name="%{#attr.row.toDay}" format="yyyy/MM/dd" />
				</display:column>
				<display:column style="width:50px">
					<s:url id="urlValue" action="viewLoa">
						<s:param name="loaID">
							<s:property value="%{#attr.row.loaID}" escapeHtml="true" />
						</s:param>
					</s:url>
					<s:a href="%{urlValue}">Xem</s:a>
				</display:column>

			</display:table>
</div>

