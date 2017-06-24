<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>
<%@ taglib prefix="z" uri="/struts-dojo-tags" %>
<script type="text/javascript">
	function goDel(){
	 var checked = [];
	 $("input[name='empCheck']:checked").each(function ()
	 {
	     if($(this).val().length > 0) checked.push("'"+$(this).val()+"'");
	 });
	 if(checked.length > 0) {
	  if(confirm('Are you sure to delete selected project?')){
	   document.getElementById("formDelete").submit();
	   return true;
	  }
	 } else alert('Please select one to delete');
	
	 return false;
	}
</script>
<script>
$(function() {
	$("input[name='dStartday']" ).datepicker({ 
		showOn: "both",	buttonImage: "<%=request.getContextPath()%>/IMG/calendar.gif"
			, dateFormat: 'yy/mm/dd' , changeYear: true});	
});
</script>
<s:form>
<s:if test="hasActionMessages()">
   <div class="message success">
       <h5>Success!</h5>
       <p><s:actionmessage/></p>
   </div>
</s:if>
</s:form>
<s:form action="insert_Prj">
	<s:actionerror/>
	<div>
		<s:textfield name="prj.SFullname" key="Tên dự án"></s:textfield>
		<s:date name="prj.dStartday" format = "yyyy/MM/dd" var="Startday"/>
		<s:textfield label="Ngày bắt đầu" name="dStartday" value="%{dStartday}"/>
		<s:select name="prj.SPmID" list="Emps" listKey="SID"
			listValue="SDisplay" headerKey="" headerValue="--Chọn --"
			label="PM" />
		<s:submit name="btThem" value="Thêm"></s:submit>
	</div>
</s:form>
<s:form>
	<input type="button" value="Xóa" style="width: 50px" onclick="goDel();"/>
</s:form>
<s:form action="delete_Prj" id="formDelete" name="formDelete">
	<display:table name="lsPrjInfo" id="empList" requestURI="" uid="row" 
				 pagesize="10" cellpadding="2px" cellspacing="2px" style="width:100%" size="12">
			 <display:column title="STT"><s:property value="#attr.row_rowNum"/></display:column>
			 <display:column title="Tên dự án" sortable="true">
				 <s:url id="urlValue" action="ViewProjectInfo.action">
						<s:param name="ProjectID">
							<s:property value="%{#attr.row.IID}" escapeHtml="true"/>
						</s:param>
				 </s:url>
				 <s:a href="%{urlValue}"><s:property value="%{#attr.row.SFullname}"/></s:a>
			</display:column>
			 <display:column title="Ngày bắt đầu" sortable="true">
				<s:date name="%{#attr.row.DStartday}" format="yyyy/MM/dd"/>
			 </display:column>
			 <display:column title="Số thành viên" property="IMemberCount" sortable="true"></display:column>
			 <display:column title="PM"  property="SPMName" sortable="true"></display:column>
			 <display:column>
		 		<s:url id="urlValue" action="toEditProject.action">
					<s:param name="ProjectID">
						<s:property value="%{#attr.row.IID}" escapeHtml="true"/>
					</s:param>
				</s:url>
				<s:a href="%{urlValue}">Sửa</s:a>
			 </display:column>
			 <display:column>
			 	<s:checkbox theme="simple" name="empCheck" id="empCheck" value="false"
						fieldValue="%{#attr.row.IID}" />
			 </display:column>			
	</display:table>
</s:form>
