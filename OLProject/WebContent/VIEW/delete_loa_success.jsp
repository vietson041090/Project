<%@page import="java.sql.Date"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>

<s:if test="hasActionMessages()">
   <div class="message success">
       <h5>Success!</h5>
       <p><s:actionmessage/></p>
   </div>
   
</s:if>
<s:submit align="center" value="BACK" onclick="location.href='http://localhost:8080/OLProject/edit_loa_form.action?loaID=%{loaID}'"/>