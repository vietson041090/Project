<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<style type="text/css">
.tdLabel {text-align:right;  vertical-align:middle;  } 
.wwFormTable{ width: 90%}
table.wwFormTable label {
font-weight: bold;
}
</style>
<script>

function delRow(id){
	$('#'+id).remove();
}
function getBeforeID(){
	var all_before_id = new Array();
	$("select[name*=iPrjID]").each(function( index ) {
		var tmp = $( this ).val()*1;
		if ( $.inArray( tmp, all_before_id ) < 0 ) all_before_id.push(tmp);
		
		
	});	



	return all_before_id;
}
function addRow(tableID) 
{
        var table = document.getElementById(tableID);

        var rowCount = table.rows.length;
        var row = table.insertRow(rowCount);
        var counts = rowCount - 1;
        row.id = "r" + counts;

        var cell = row.insertCell(0);
        var tmp = document.createElement("div");
        tmp.appendChild(document.createTextNode(counts+1));
        cell.appendChild(tmp);

        var all_before_id = getBeforeID();
        
        cell = row.insertCell(1);
        tmp = document.createElement("select");
        tmp.name = "works[" + counts + "].iPrjID";
        tmp.id = "add_loa_loaDtl_"+counts+"__iPrjID";
		//fill option
		var xxx = 0;
		<s:iterator value="map" status="pListStatus">
		if ( $.inArray( <s:property value="key"/>, all_before_id ) < 0 ){
			var opt = document.createElement("option");
			opt.value= <s:property value="key"/>;
			opt.innerHTML = '<s:property value="value"/>';
			tmp.appendChild(opt);
			xxx++;
		}
		</s:iterator>
        if(xxx>0) cell.appendChild(tmp);
        else{ table.deleteRow(rowCount); return; }

        
        
        cell = row.insertCell(2);
        tmp = document.createElement("select");
        tmp.name = "works[" + counts + "].sManID";
        tmp.id = "add_loa_loaDtl_"+counts+"__sManID";
		//fill option
		<s:iterator value="mapPM" status="pListStatus">
		var opt = document.createElement("option");
		
		opt.value= '<s:property value="key"/>';
		opt.innerHTML = '<s:property value="value"/>';
		tmp.appendChild(opt);
		</s:iterator>
        cell.appendChild(tmp);

        cell = row.insertCell(3);
        tmp = document.createElement("select");
        tmp.name = "works[" + counts + "].iRolID";
        tmp.id = "add_loa_loaDtl_"+counts+"__iRolID";
		//fill option
		<s:iterator value="roles" status="pListStatus">
		var opt = document.createElement("option");
		opt.value= <s:property value="key"/>;
		opt.innerHTML = '<s:property value="value"/>';
		tmp.appendChild(opt);
		</s:iterator>
        cell.appendChild(tmp);

        cell = row.insertCell(4);
        tmp = document.createElement("div");
        tmp.innerHTML = "<a href='javascript:delRow(\""+row.id+"\")'>Xóa</a>";
        cell.appendChild(tmp);
       
}
$(function() {
	<s:if test="works.size() < 1">
	addRow('works');
	</s:if>

});


$(function() {
 $("input[name='dBirthday']" ).datepicker({ 
  showOn: "both", buttonImage: "<%=request.getContextPath()%>/IMG/calendar.gif"
   , dateFormat: 'yy/mm/dd' , changeYear: true}); 
});

$(function() {
	 $("input[name='dStartday']" ).datepicker({ 
	  showOn: "both", buttonImage: "<%=request.getContextPath()%>/IMG/calendar.gif"
	   , dateFormat: 'yy/mm/dd' , changeYear: true}); 
	});
</script>


<s:form action="newemployee.action" method="post" name="/">
<s:actionerror />
<s:if test="hasActionMessages()">
   <div class="message success">
       <h5>Success!</h5>
       <p><s:actionmessage/></p>
   </div>
   
</s:if>
<s:if test="fieldErrors.size > 0">
	<div class="message error" style="margin: 10px">
		<h4>Error!</h4>
		<p>Thông tin dữ liệu không hợp lệ.</p>
	</div>	
</s:if>
<s:select    id="form-control" label="Loại tài khoản" name="iType" list="groups"  value="%{iType}"  cssClass="mini"/>
<s:textfield id="form-control" label="Mã nhân viên" cssClass="mini" maxlength="50"  name="sID" value="%{sID}"/>
<s:textfield id="form-control" label="Emai" cssClass="mini" maxlength="250"  name="sEmail"  />
<s:textfield id="form-control" label="Tên nhân viên" maxlength="50" cssClass="mini"  name="sFullname" value="%{sFullname}"/>
<s:textfield label="Ngày sinh" name="dBirthday" value="%{dBirthday}" />
<s:textfield label="Ngày vào làm" name="dStartday" value="%{dStartday}" />


	<TABLE id="works" class="display">
			<TR>
				<TH style="width: 30px">Stt</TH>
				<TH style="width: 230px">Dự án</TH>
				<TH style="width: 230px">Người quản lý</TH>
				<TH style="width: 230px">Quyền</TH>
				<TH style="width: 30px">Xóa</TH>
			</TR>
			<s:iterator value="works" status="loaDtlStatus">
				<s:set var="i" value="#loaDtlStatus.index+1"></s:set>
				<s:set var="id" value="#loaDtlStatus.index"></s:set>
				<tr id="r<s:property value="#loaDtlStatus.index"/>">
					<td><div>
							<s:property value="#i" />
						</div></td>
					<td>
					
						
						<s:select name="works[%{id}].iPrjID" list="map"  theme="simple"></s:select>
					</td>
					<td>
						<s:select name="works[%{id}].sManID" list="mapPM" theme="simple"></s:select>
					</td>
					
					<td>
						<s:select name="works[%{id}].iRolID" list="roles" theme="simple"></s:select>
					</td>
					
					<td><div>
							<a
								href="javascript:delRow('r<s:property value="#loaDtlStatus.index"/>')">Xóa</a>
						</div></td>
				</tr>
			</s:iterator>
		</TABLE>
		<div style="text-align: right; margin-top: 10px">
			<INPUT type="button" value="Thêm dòng" onclick="addRow('works')"
				class="btn btn-blue" />
		</div>
		<div style="height: 10px"></div>
		<div class="floatleft grid_2 txtname">&nbsp;</div>
		<div class="floatleft grid_10">
			<input type="submit" value="Lưu" class="btn" /> <input type="button"
				value="Nhập lại" class="btn btn-navy" />
		</div>
		<div class="clear"></div>	

</s:form>

