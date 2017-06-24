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

<input type="button"  value="Tạo mới" onclick="window.location.href='add_loa_form.action' "/>

<s:if test="personalLoaLetters.size > 0">
<display:table id="txt" name="pLoaList" sort="external" partialList="true" uid="row" requestURI="/ViewPersonalLoaLetter.action" cellpadding="2px;" pagesize="10" size="12" cellspacing="2px;" style="width:100%">
	   <display:column sortable="true"   title="STT">
	           <s:property value="#attr.row_rowNum" />
	   </display:column>
                    <s:property value="_rowNum" />
	<display:column property="IID" title="Mã đơn" sortable="true"></display:column>
	<display:column property="DSentday" title="Ngày tạo"></display:column>
	<display:column property="SFullName" title="Dự án"></display:column>
	<display:column title="Tình trạng">
		<s:property value="ConvertStatus(#attr.row.IStatus)"/>
	</display:column>
		
			 <display:column> 
			  <s:if test="%{#attr.row.IStatus<=1}">
			  <s:url id="urlValue" action="edit_loa_form">
				      <s:param name="loaID">
				       <s:property value="#attr.row.IID" escapeHtml="true" />
				      </s:param>
				     </s:url>
				     <s:a href="%{urlValue}">Sửa</s:a>
				</s:if>
				</display:column> 
				<display:column> 
				       <s:url id="urlValue" action="viewLoa">
				      <s:param name="loaID">
				       <s:property value="#attr.row.IID" escapeHtml="true" />
				      </s:param>
				     </s:url>
				     <s:a href="%{urlValue}">Xem</s:a>
			 </display:column>
	

	
	

</display:table>
</s:if>
<s:else>Bạn chưa gởi bất kỳ đơn xin nghỉ phép nào</s:else>
