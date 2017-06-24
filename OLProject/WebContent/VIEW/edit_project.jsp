<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<style type="text/css">
.tdLabel {text-align:right;  vertical-align:middle;  } 
.wwFormTable{ width: 90%}
table.wwFormTable label {
font-weight: bold;
}
</style>

<script>
$(function() {
	$("input[name='projectStartDay']" ).datepicker({ 
		showOn: "both",	buttonImage: "<%=request.getContextPath()%>/IMG/calendar.gif"
			, dateFormat: 'yy/mm/dd' , changeYear: true});	
});
</script>

<s:form action="editProjectAction">
<s:hidden name="projectID" value="%{project.iID}"/>

<s:textfield id="form-control" label="Tên dự án" name="projectName" value="%{project.sFullname}"/>

<s:select id="form-control" label="Project Manager" 
	list="projectMember" listKey="sEmployeeId" listValue="sEmployeeName"
	value="%{project.sPmID}" name="pmID"/>

<s:date name="project.dStartday" format = "yyyy/MM/dd" var="startDate"/>
<s:textfield id="form-control" label="Ngày bắt đầu" name="projectStartDay" value="%{startDate}"/>

<s:submit id="form-control" cssClass="mini" value="Lưu"/>
</s:form>
