<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.tdLabel {text-align:right;  vertical-align:middle;  } 
.wwFormTable{ width: 90%}
table.wwFormTable label {
font-weight: bold;
}
</style>
</head>
<body>

<s:form action="changePassword.action" method="post" name="/">
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
	</div>	
</s:if>
<s:textfield id="form-control" label="Mật khẩu hiện tại" name="currentPassword" type="password" value="%{currentPassword }"  cssClass="mini"/>
<s:textfield id="form-control" label="Mật khẩu mới" cssClass="mini" maxlength="50"  name="newPassword" type="password" />
<s:textfield id="form-control" label="Nhập lại Mật khẩu"  cssClass="mini" maxlength="50"  name="reNewPassword" type="password" />
<s:submit id="form-control" cssClass="mini" value="Đổi mật khẩu"/>
</s:form>

</body>
</html>
