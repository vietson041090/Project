<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>
<%@ taglib prefix="z" uri="/struts-dojo-tags" %>
<s:form>
	<display:table name="lsLoaHis" id="List" requestURI="" uid="row" export="true" 
				 pagesize="10" cellpadding="2px" cellspacing="2px" style="width:100%">
			 <display:column title="STT"><s:property value="#attr.row_rowNum"/></display:column>
			 <display:column title="Mã đơn" property="ILoaID" sortable="true">
			</display:column>
			 <display:column title="Tên nhân viên" sortable="true" property="SFullname">
			 </display:column>
			 <display:column title="Ngày xử lý" sortable="true">
			 	<s:date name="%{#attr.row.DChgDate}" format="yyyy/MM/dd"/>
			 </display:column>
			 <display:column title="Kết quả"  property="SKetQua" sortable="true"></display:column>
			 <display:column>
		 		<s:url id="urlValue" action="viewLoa.action">
					<s:param name="loaID">
						<s:property value="%{#attr.row.ILoaID}" escapeHtml="true"/>
					</s:param>
				</s:url>
				<s:a href="%{urlValue}">Xem</s:a>
			 </display:column>		
	</display:table>
</s:form>
