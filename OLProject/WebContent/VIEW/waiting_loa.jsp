<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>

<div class="dtbl">
			<display:table id="txt" requestURI="" uid="row" export="true" name="pgList" pagesize="10" size="100" cellpadding="2px;"
				cellspacing="2px;" partialList="true" sort="external">
				<display:column sortable="true" title="STT" style="width:50px"><s:property value="#attr.row_rowNum"/></display:column>
				<display:column sortable="true" property="SEmpID" title="Mã nhân viên"></display:column>
				<display:column sortable="true" property="SNextManID" title="Tên nhân viên"></display:column>
				<display:column sortable="true" property="DSentday" title="Ngày gửi"></display:column>
				<display:column style="width:50px">
					<s:url id="urlValue" action="approveLoa">
						<s:param name="loaID">
							<s:property value="%{#attr.row.IID}" escapeHtml="true" />
						</s:param>
					</s:url>
					<s:a href="%{urlValue}">Duyệt</s:a>
				</display:column>

			</display:table>
</div>

