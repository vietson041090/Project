<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>


<s:if test="ret > 0">
	<s:actionerror />
</s:if>
<s:else>
	<style>
	#loaList td {
		padding: 10px
	}
	
	table#loaList {
		border-collapse: collapse;
	}
	
	table#loaList,#loaList th,#loaList td {
		border: 1px solid #B3CBD6;
	}
	</style>
	
		<script>
	function addDatePopup(id, fillnow, what){
		if(what == 1){
			$("input[name='"+id+"']").datepicker({ showOn: "both",	buttonImage: "<%=request.getContextPath()%>/IMG/calendar.gif", dateFormat: 'yy/mm/dd' });
			if(fillnow==1) $("input[name='"+id+"']").val($.datepicker.formatDate('yy/mm/dd', new Date()));
		} else {
			$(id).each(function() {
				$(this).datepicker({ showOn: "both",	buttonImage: "<%=request.getContextPath()%>/IMG/calendar.gif", dateFormat: 'yy/mm/dd' });
				if(fillnow==1) $(this).val($.datepicker.formatDate('yy/mm/dd', new Date()));
			});
		}
	}
	function delRow(id){
		$('#'+id).remove();
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
	        
	        cell = row.insertCell(1);
	        tmp = document.createElement("input");
	        tmp.type = "text";
	        tmp.name = "loaDtl[" + counts + "].dFromday";
	        tmp.id = "add_loa_loaDtl_"+counts+"__dFromday";
	        cell.appendChild(tmp);
	        addDatePopup(tmp.name, 0,1);
	
	        cell = row.insertCell(2);
	        tmp = document.createElement("input");
	        tmp.type = "text";
	        tmp.name = "loaDtl[" + counts + "].dToday";
	        tmp.id = "add_loa_loaDtl_"+counts+"__dToday";
	        cell.appendChild(tmp);
	        addDatePopup(tmp.name, 0,1);
	
	        cell = row.insertCell(3);
	        tmp = document.createElement("input");
	        tmp.type = "text";
	        tmp.style="width:50px";
	        tmp.name = "loaDtl[" + counts + "].iDayno";
	        tmp.id = "add_loa_loaDtl_"+counts+"__iDayno";
	        cell.appendChild(tmp);
	
	        cell = row.insertCell(4);
	        tmp = document.createElement("select");
	        tmp.name = "loaDtl[" + counts + "].iType";
	        tmp.id = "add_loa_loaDtl_"+counts+"__iType";
			//fill option
			<s:iterator value="types" status="pListStatus">
			var opt = document.createElement("option");
			opt.value= <s:property value="key"/>;
			opt.innerHTML = '<s:property value="value"/>';
			tmp.appendChild(opt);
			</s:iterator>
	        cell.appendChild(tmp);
	
	        cell = row.insertCell(5);
	        tmp = document.createElement("input");
	        tmp.type = "text";
	        tmp.style="width:99%";
	        tmp.name = "loaDtl[" + counts + "].sReason";
	        tmp.id = "add_loa_loaDtl_"+counts+"__sReason";
	        cell.appendChild(tmp);
	
	        cell = row.insertCell(6);
	        tmp = document.createElement("div");
	        tmp.innerHTML = "<a href='javascript:delRow(\""+row.id+"\")'>Xóa</a>";
	        cell.appendChild(tmp);
	}
	$(function() {
		<s:if test="loaDtl.size() < 1">
		addRow('loaList');
		</s:if>
		addDatePopup('loa.dSentday', 1, 1);
		addDatePopup('.isDatepicker',0,0);
	});
	</script>

	<s:form action="add_loa" method="post">
		<s:actionerror />

		<div class="floatleft grid_2 txtname">Mã nhân viên:</div>
		<div class="floatleft grid_10"><%=session.getAttribute("loggedEmpID")%></div>
		<div class="clear"></div>

		<div class="floatleft grid_2 txtname">Họ tên:</div>
		<div class="floatleft grid_10"><%=session.getAttribute("loggedFullname")%></div>
		<div class="clear"></div>

		<div class="floatleft grid_2 txtname">Ngày viết:</div>
		<div class="floatleft grid_10">
			<input name="loa.dSentday" style="width: 150px" />
		</div>
		<div class="clear"></div>

		<div class="floatleft grid_2 txtname">Dự án:</div>
		<div class="floatleft grid_10">
			<s:select name="loa.iPrjID" list="pList" listKey="iID"
				listValue="SFullname" theme="simple"></s:select>

		</div>
		<div class="clear"></div>
		
		Danh sách các ngày nghỉ phép:
		<TABLE id="loaList" class="display">
			<TR>
				<TH style="width: 30px">Stt</TH>
				<TH style="width: 230px">Từ ngày</TH>
				<TH style="width: 230px">Tới ngày</TH>
				<TH style="width: 50px">Số ngày</TH>
				<TH style="width: 150px">Loại phép</TH>
				<TH>Lý do</TH>
				<TH style="width: 30px"></TH>
			</TR>
			<s:iterator value="loaDtl" status="loaDtlStatus">
				<s:set var="i" value="#loaDtlStatus.index+1"></s:set>
				<s:set var="id" value="#loaDtlStatus.index"></s:set>
				<tr id="r<s:property value="#loaDtlStatus.index"/>">
					<td><div>
							<s:property value="#i" />
						</div></td>
					<td><input type="text"
						name="loaDtl[<s:property value="#loaDtlStatus.index"/>].dFromday"
						class="isDatepicker"
						value="<s:date name="dFromday" format="yyyy/MM/dd" />" /></td>
					<td><input type="text"
						name="loaDtl[<s:property value="#loaDtlStatus.index"/>].dToday"
						class="isDatepicker"
						value="<s:date name="dToday" format="yyyy/MM/dd" />" /></td>
					<td><input type="text" style="width: 50px;"
						name="loaDtl[<s:property value="#loaDtlStatus.index"/>].iDayno"
						value="<s:property value="iDayno"/>"></td>
					<td><s:select name="loaDtl[%{id}].iType" list="types" theme="simple"/></td>
					<td><input type="text" style="width: 99%;"
						name="loaDtl[<s:property value="#loaDtlStatus.index"/>].sReason" /></td>
					<td><div>
							<a
								href="javascript:delRow('r<s:property value="#loaDtlStatus.index"/>')">Xóa</a>
						</div></td>
				</tr>
			</s:iterator>
		</TABLE>
		<div style="text-align: right; margin-top: 10px">
			<INPUT type="button" value="Thêm dòng" onclick="addRow('loaList')"
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
</s:else>