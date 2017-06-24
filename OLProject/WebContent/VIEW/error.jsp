<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<br/><br/><br/><br/>
<div style="padding:10px;text-align:center;background-color:#f1f1f1;width:350px;margin:auto;color:#ff0000"><b>Có lỗi hay ngoại lệ đã xảy ra !</b>
<br/><br/>
<s:url id="urlValue" action="login"></s:url>
<s:a href="%{urlValue}"><span>Vui lòng đăng nhập lại</span></s:a>
</div>