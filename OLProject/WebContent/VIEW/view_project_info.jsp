<!--/*------------------------------------------------------------------------------
Create Date : 2014/05/09 Author : Ong Oai Viêm Copyright(c) 2014
DELIVERY. All rights reserved
------------------------------------------------------------------------------
Update History: Ver. TRB# Date Author Note
---------------------------------------------s---------------------------------*/
-->
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>

<table style="margin-left:35% ;margin-right35%; width:30%; margin-top:30px; font-size:18px;">
	<tr>
		<td>Tên dự án:</td>
		<td><s:property value="project.sFullname" /></td>
	</tr>
	<tr>
		<td>Mã dự án:</td>
		<td><s:property value="project.sCode" /></td>
	</tr>
	<tr>
		<td>PM:</td>
		<td><s:property value="project.sPMName" /></td>
	</tr>
	<tr>
		<td>Tổng số thành viên:</td>
		<td><s:property value="project.iMemberCount" /></td>
	</tr>

</table>
<input name="AddNew" type="button" onclick="Add()" value="Thêm mới" />

<s:actionerror />

<s:form action="DeleteWork" id="formlist">
	<s:submit value="Xóa" onclick="deletecheck()">
			<s:hidden id="abcdef" value="%{projectID}" name="projectID" />
	</s:submit>

Danh sách thành viên

<display:table id="txt" name="projectMember" sort="external"
		partialList="true" uid="row"
		requestURI="/ViewPersonalLoaLetter.action" cellpadding="2px;"
		pagesize="10" size="12" cellspacing="2px;" style="width:100%">
		<display:column title="Chọn">
			<s:checkbox theme="simple" value="false" name="WorkCheck"
				fieldValue="%{#attr.row.IWorkID}" />
		</display:column>

		<display:column sortable="true" title="STT">
			<s:property value="#attr.row_rowNum" />
		</display:column>
		<s:property value="_rowNum" />
		<display:column property="SEmployeeId" title="Mã nhân viên"
			sortable="true"></display:column>
		<display:column property="SEmployeeName" title="Tên nhân viên"
			sortable="true"></display:column>
		<display:column title="Vai trò" sortable="true">

			<s:property value="GetRoleByID(#attr.row.IRoleID)" />

		</display:column>
		<display:column property="SManagerId" title="Mã người quản lý"
			sortable="true"></display:column>
		<display:column>
			<input type="button" value="Sửa"
				onclick="setEditVal(<s:property value = "%{#attr.row.IWorkID}"/>,<s:property value = "%{#attr.row.IRoleID}"/>,'<s:property value = "%{#attr.row.SManagerId}"/>')"
				id="Edit<s:property value = "%{#attr.row.IWorkID}"/>" />
		</display:column>
	</display:table>
</s:form>
<div id="EditWorkDialog" title="Chỉnh sửa thông tin thành viên dự án"
	style="display: none;">
	<s:form action="EditWork">
		<s:hidden id="abcdef" value="%{projectID}" name="projectID" />
		<s:hidden id="EditWorkIDField" name="NewWork.iID" />
	Vai trò: <s:select name="NewWork.iRolID" list="WorkRole" listKey="iID"
			id="EditRoleID" listValue="SRoleTitle" theme="simple" />
Người quản lý: <s:select name="NewWork.sManID" list="projectMember"
			id="EditManID" listKey="sEmployeeId" listValue="SDisplay"
			headerKey="" headerValue="Không có quản lí" theme="simple" />
	</s:form>
</div>
<div id="AddNewDialog" title="Chỉnh sửa thông tin thành viên dự án"
	style="display: none;">
	<s:form action="AddNewWork">
		<s:hidden id="EditWorkIDField" value="%{projectID}" name="projectID" />
	Nhân viên: <s:select name="NewWork.sEmpID" list="Employees"
			listKey="SID" listValue="SDisplay" theme="simple" />
	Vai trò: <s:select name="NewWork.iRolID" list="WorkRole" listKey="iID"
			listValue="SRoleTitle" theme="simple" />
	Người quản lý: <s:select name="NewWork.sManID" list="projectMember"
			listKey="sEmployeeId" listValue="SDisplay" headerKey=""
			headerValue="Không có quản lý" theme="simple" />
	</s:form>
</div>



<script type="text/javascript">
	var WorkID;
	$(document)
			.ready(
					function() {

						$('#formlist')
								.submit(
										function() {

											if ($(document)
													.find(
															'input[name="WorkCheck"]:checked').length == 0) {
												alert('Vui lòng chọn ít nhất một nhân viên để xóa !');
												return false;
											} else {
												return confirm('Bạn chắc là xóa nhân viên này!');

											}

										});

					

					});

	function Add() {
		$("#AddNewDialog").dialog({
			width : 500,
			height : 140,
			modal : true,
			buttons : {
				"Thêm mới" : function() {

					$(this).dialog("close");
					$('#AddNewWork').submit();

				},
				Hủy : function() {
					$(this).dialog("close");
				}
			}
		});
	}
function setEditVal(workID,RoleID,ManID )
	{
		$('#EditRoleID').val(RoleID );
		$('#EditManID').val(ManID );
		$('#EditWorkIDField').val(workID );
		$("#EditWorkDialog").dialog({
			width : 500,
			height : 140,
			modal : true,
			buttons : {
				"Cập nhật" : function() {
					$(this).dialog("close");
					$('#EditWork').submit();
				},
				Hủy : function() {
					$(this).dialog("close");
				}
			}
	

	});
	};
</script>