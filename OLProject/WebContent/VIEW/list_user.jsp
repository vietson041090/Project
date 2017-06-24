<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script type="text/javascript">
	function goDel(){
	 var checked = [];
	 $("input[name='empCheck']:checked").each(function ()
	 {
	     if($(this).val().length > 0) checked.push("'"+$(this).val()+"'");
	 });
	 if(checked.length > 0) {
	  if(confirm('Are you sure to delete selected user?')){
	   document.getElementById("formDelete").submit();
	   return true;
	  }
	 } else alert('Please select one to delete');
	
	 return false;
	}
</script>
<s:form action="searchEmpPrj" method="POST">
	<select name="searchField">
	    <option value="sID">Mã nhân viên</option>
	    <option value="sFullname">Tên nhân viên</option>
	</select><input type="text" name="searchValue"/><input type="submit" value="Tìm kiếm"/>
</s:form>
<s:form action="newemployeeform">
	<input type="submit" value="Thêm"  style="width: 50px"/>
	<input type="button" value="Xóa" style="width: 50px" onclick="goDel();"/>
</s:form>
<s:form action="delete" id="formDelete" name="formDelete">
	<display:table name="listEmpPrj" id="empList" requestURI="" uid="row"
				 pagesize="10" cellpadding="2px" cellspacing="2px" style="width:100%" size="12">
			 <display:column title="STT"><s:property value="#attr.row_rowNum"/></display:column>
			 <display:column title="Mã nhân viên" sortable="true">
				<s:url id="urlValue" action="view_profile.action">
					<s:param name="empID">
						<s:property value="%{#attr.row.SID}" escapeHtml="true"/>
					</s:param>
				</s:url>
				<s:a href="%{urlValue}"><s:property value="%{#attr.row.SID}"/></s:a>
			 </display:column>
			 <display:column title="Tên nhân viên" property="SFullname" sortable="true"></display:column>
			 <display:column title="Loại"  property="SType" sortable="true"></display:column>
			 <display:column>
		 		<s:url id="urlValue" action="edituserform.action">
					<s:param name="sID">
						<s:property value="%{#attr.row.SID}" escapeHtml="true"/>
					</s:param>
				</s:url>
				<s:a href="%{urlValue}">Sửa</s:a>
			 </display:column>
			 <display:column>
			 	<s:checkbox theme="simple" name="empCheck" id="empCheck" value="false"
						fieldValue="%{#attr.row.SID}" />
			 </display:column>			
	</display:table>
</s:form>
