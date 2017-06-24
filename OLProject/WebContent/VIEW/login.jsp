<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<form method="post" action="dologin"
	id="form1">
	<div id="divLogin" class="panel panel-cascade">
	<s:actionerror/>
		<div class="panel-heading">
			<h3 class="panel-title">ĐĂNG NHẬP</h3>
			<h4>Hệ thống thông tin nghỉ phép nhân viên Delievery Việt Nam</h4>
		</div>
		<div class="panel-body"
			style="background: transparent url(<%=request.getContextPath()%>/IMG/logoDeliv.png) right bottom no-repeat">
			<div class="">
				<label class="control-label col-sm-2">Mã nhân viên</label>
				<div class="col-sm-10" align="center">
					<s:textfield name="emp.sID" cssClass="form-control form-cascade-control"></s:textfield>
				</div>
			</div>
			<div class="">
				<label class="control-label col-sm-2">Mật khẩu</label>
				<div class="col-sm-10">
					<s:password name="emp.sPassword" cssClass="form-control form-cascade-control"></s:password>
				</div>
			</div>
			<div class="clear-fix"></div>

			<div>
				<div class="col-sm-10">
					<s:submit cssClass="btn-default btn" value="Đăng nhập"></s:submit>
				</div>
			</div>
		</div>
	</div>
	<s:hidden name="loginAttempt" value="%{'1'}" />
</form>

<s:form method="POST" theme="simple">
	<div style="height: 20px"></div>
	<div align="center" class="search-data">
	<div class="panel-heading">
			<h4>Danh sách xin nghỉ phép ngày hôm nay</h4>
			<display:table name="listLetter" id="empList" requestURI="" uid="row" 
				 pagesize="5" cellpadding="2px" cellspacing="2px" size="100" style="width:50%">
				 <display:column title="STT"><s:property value="#attr.row_rowNum"/></display:column>
				 <display:column title="Mã nhân viên" property="SEmpID" sortable="true"></display:column>
				 <display:column title="Tên nhân viên" property="SFullname" sortable="true"></display:column>
				 <display:column title="Số ngày nghỉ" property="IDayNo" sortable="true"></display:column>
				 <display:column title="Lý do" property="SReason" sortable="true"></display:column>
				 <display:column title="Ngày nghỉ" sortable="true">
					<s:date name="%{#attr.row.DFromday}" format="yyyy/MM/dd"/>
				</display:column>			
			</display:table>
		</div>
	</div>
</s:form>
