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

<s:form action="edituser?sID=%{sID}" method="post" name="/">
<s:if test="hasActionMessages()">
   <div class="message success">
       <h5>Success!</h5>
       <p><s:actionmessage/></p>
   </div>
   
</s:if>
<s:if test="fieldErrors.size > 0">
	<div class="message error" style="margin: 10px">
		<h4>Error!</h4>
		<p>Thông tin dữ liệu không hợp lệ.</p>
		<p><s:actionerror/></p>
	</div>	
</s:if>

<s:select    id="form-control" label="Loại tài khoản" name="employee.iType" list="groups"  value="%{employee.iType}"  cssClass="mini"/>
<s:textfield id="form-control" label="Mã nhân viên" cssClass="mini" maxlength="50" disabled="true" name="employee.sID" value="%{employee.sID}"/>
<s:textfield id="form-control" label="Emai" cssClass="mini" maxlength="250" name="employee.sEmail" value="%{employee.sEmail}" />
<s:textfield id="form-control" label="Tên nhân viên" cssClass="mini" maxlength="50" name="employee.sFullname" value="%{employee.sFullname}"/>
<s:date name="dStartday" format = "yyyy/MM/dd" var="startDate"/>
<s:textfield id="form-control"  label="Ngày vào làm" readonly="true" name="dStartday" value="%{dStartday}" />
<s:submit align="center"  id="form-control" cssClass="mini" value="Lưu"/>
</s:form>

