<!--/*------------------------------------------------------------------------------
Create Date : 2014/05/09 Author : Ong Oai Viêm Copyright(c) 2014
DELIVERY. All rights reserved
------------------------------------------------------------------------------
Update History: Ver. TRB# Date Author Note
------------------------------------------------------------------------------*/
-->
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>

<s:form action="AddNewAuthorization" id="AddNew">
	<s:select name="ProjectID" list="Projects" listKey="iID"
		listValue="SFullname" 
		label="Dự án" />
	<s:select name="Au.sToEmpID" list="Employees" listKey="SID"
		listValue="SDisplay" 
		label="Người được ủy quyền" />
	<s:submit value="Thêm" ></s:submit>
	<s:if test="hasActionErrors()">
		<s:actionerror />       
	</s:if>
	<s:if test="hasActionMessages()">
		<div id="success"><s:actionmessage/></div>
	</s:if>
	
</s:form>
<h3>Lịch sử ủy quyền</h3>
<s:if test="Authorizations.size > 0">
<display:table id="txt" name="Authorizations"
	requestURI="/ShowAuthorizationForm.action" cellpadding="2px;" uid="row"
	cellspacing="2px;" style="width:100%">
	<display:column property="IID" title="Mã ủy quyền"></display:column>
	<display:column property="SFullName" title="Người được ủy quyền"></display:column>
	<display:column property="SPrjName" title="Dự án"></display:column>
	<display:column property="DFromday" title="Ngày bắt đầu"
		format="{0,date,dd/MM/yyyy}"></display:column>
	<display:column property="DToday" title="Ngày kết thúc"
		format="{0,date,dd/MM/yyyy}"></display:column>
	<s:if test="%{#attr.row.IStatus==1}">
		<display:column value="Có hiệu lực" title="Trạng thái"></display:column>
		<display:column>
			<s:url id="urlValue" action="DisableAuthorization">
				<s:param name="SToEmpID">
					<s:property value="#attr.row.sToEmpID" escapeHtml="true" />
				</s:param>
			</s:url>
			<s:a href="%{urlValue}">Vô hiệu hóa</s:a>
		</display:column>
	</s:if>
	<s:elseif test="%{#attr.row.IStatus==0}">
		<display:column value="Vô hiệu" title="Trạng thái"></display:column>
		<display:column>
			<s:url id="urlValue" action="AddNewAuthorization">
				<s:param name="SToEmpID">
					<s:property value="#attr.row.sToEmpID" escapeHtml="true" />
				</s:param>
				<s:param name="IPrjID">
					<s:property value="#attr.row.IPrjID" escapeHtml="true" />
				</s:param>
			</s:url>
			<s:a href="%{urlValue}">Tái kích hoạt</s:a>
		</display:column>
	</s:elseif>





</display:table>
</s:if>
<s:else>
			Lịch sử ủy quyền trống !
</s:else>