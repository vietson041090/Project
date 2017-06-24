<%@page import="java.sql.Date"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>

<style>
#loaList td{padding:10px}
table#loaList
{
border-collapse:collapse;
}
table#loaList,#loaList th,#loaList td
{
border:1px solid #B3CBD6;
}
</style>

<script>



var dates = {
	    convert:function(d) {
	        // Converts the date in d to a date-object. The input can be:
	        //   a date object: returned without modification
	        //  an array      : Interpreted as [year,month,day]. NOTE: month is 0-11.
	        //   a number     : Interpreted as number of milliseconds
	        //                  since 1 Jan 1970 (a timestamp) 
	        //   a string     : Any format supported by the javascript engine, like
	        //                  "YYYY/MM/DD", "MM/DD/YYYY", "Jan 31 2009" etc.
	        //  an object     : Interpreted as an object with year, month and date
	        //                  attributes.  **NOTE** month is 0-11.
	        return (
	            d.constructor === Date ? d :
	            d.constructor === Array ? new Date(d[0],d[1],d[2]) :
	            d.constructor === Number ? new Date(d) :
	            d.constructor === String ? new Date(d) :
	            typeof d === "object" ? new Date(d.year,d.month,d.date) :
	            NaN
	        );
	    },
	    compare:function(a,b) {
	        // Compare two dates (could be of any type supported by the convert
	        // function above) and returns:
	        //  -1 : if a < b
	        //   0 : if a = b
	        //   1 : if a > b
	        // NaN : if a or b is an illegal date
	        // NOTE: The code inside isFinite does an assignment (=).
	        return (
	            isFinite(a=this.convert(a).valueOf()) &&
	            isFinite(b=this.convert(b).valueOf()) ?
	            (a>b)-(a<b) :
	            NaN
	        );
	    },
	    inRange:function(d,start,end) {
	        // Checks if date in d is between dates in start and end.
	        // Returns a boolean or NaN:
	        //    true  : if d is between start and end (inclusive)
	        //    false : if d is before start or after end
	        //    NaN   : if one or more of the dates is illegal.
	        // NOTE: The code inside isFinite does an assignment (=).
	       return (
	            isFinite(d=this.convert(d).valueOf()) &&
	            isFinite(start=this.convert(start).valueOf()) &&
	            isFinite(end=this.convert(end).valueOf()) ?
	            start <= d && d <= end :
	            NaN
	        );
	    }
	}

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

function validateForm()
{
var fromDay = document.forms["addNewLoa"]["detail.dFromday"].value;
var toDay = document.forms["addNewLoa"]["detail.dToday"].value;
var iDayno = document.forms["addNewLoa"]["detail.iDayno"].value;
var sReason = document.forms["addNewLoa"]["detail.sReason"].value;
	if ( fromDay ==null || fromDay == "")
	  {
	  alert("Ngay bat dau k duoc de trong");
	  return false;
	  }
	if ( toDay == null || toDay == "")
	  {
	  alert("Ngày kết thút k duoc de trong");
	  return false;
	  }
	if ( iDayno == null || iDayno == "")
	  {
	  alert("Số ngày k duoc de trong");
	  return false;
	  }

	if ( sReason ==null || sReason == "")
	  {
	  alert("Lý do k duoc de trong");
	  return false;
	  }

	  if(dates.compare(toDay, fromDay) == -1){
		alert("Ngày kết thút bé hơn ngày bắt đầu");
		return false;
	}

	if(isNaN(iDayno)){
		alert("Số ngày nghĩ phải là số");
		return false;
	}

	var currentDate = document.getElementById("currentDate");
	//alert(currentDate.value);
	if(dates.compare(fromDay, currentDate.value) == -1){
		alert("Ngày bắt đầu phải lớn hơn hoặc bằng ngày hiện tại - Ngày hiện tại là : " + currentDate.value);
		return false;
	}
	
	
	return true;
}
	
	
function isEmpty(str){
	
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

	addDatePopup('loa.dSentday', 1, 1);
	addDatePopup('.isDatepicker',0,0);
});
</script>

<s:form action="edit_loa?loaID=%{loaID}" method="post">

		
		<s:property value="loa.size"/>
		
		<s:if test="loa  != null">
		
		<s:actionerror/>
		
		<div class="floatleft grid_2 txtname">Mã nhân viên:</div><div class="floatleft grid_10" ><s:property value="%{loa.sEmpID}"/></div>
		<div class="clear"></div>
		
		<div class="floatleft grid_2 txtname">Họ tên:</div><div class="floatleft grid_10"><s:property value="%{loaOwner.sFullname}"/></div>
		<div class="clear"></div>
				
		<div class="floatleft grid_2 txtname">Ngày viết:</div><div class="floatleft grid_10"><s:property value="%{loa.dSentday}"/></div>
		<div class="clear"></div>
		
		
		<div class="floatleft grid_2 txtname">Dự án:</div><div class="floatleft grid_10">
		
		<s:select name="loa.iPrjID" list="pList" listKey="iID" listValue="SFullname" theme="simple"></s:select>
		
		
		
		</div>
		<div class="clear"></div>
		
		<TABLE id="loaList" class="display">
		        <TR>
		                <TH style="width:30px">Stt</TH>
		                <TH style="width:210px">Từ ngày</TH>
		                <TH style="width:210px">Tới ngày</TH>
		                <TH style="width:50px">Số ngày</TH>
		                <TH style="width:200px">Loại phép</TH>
		                <TH>Lý do</TH>
		                <TH style="width:30px"></TH>
		        </TR>
		        <s:iterator value="loaDtl" status="loaDtlStatus">
		        	<s:set var="i" value="#loaDtlStatus.index+1"></s:set>
		        	<s:set var="index" value="#loaDtlStatus.index"></s:set>
		        	<s:set var="value" value="#loaDtlStatus.index"></s:set>
		        	<tr id="r<s:property value="#loaDtlStatus.index"/>">
			        	<td>
			        		<div><s:property value="#i"/></div>
			        	</td>
			        	<td>
			        		<input type="text" name="loaDtl[<s:property value="#loaDtlStatus.index"/>].dFromday" class="isDatepicker" value="<s:date name="dFromday" format="yyyy/MM/dd" />"/>
			        	</td>
			        	<td>
			        		<input type="text" name="loaDtl[<s:property value="#loaDtlStatus.index"/>].dToday" class="isDatepicker" value="<s:date name="dToday" format="yyyy/MM/dd" />"/>
			        	</td>
			        	<td>
			        		<input type="text" style="width: 50px;" name="loaDtl[<s:property value="#loaDtlStatus.index"/>].iDayno" value="<s:property value="iDayno"/>">
			        	</td>
			        	<td>
			        		<s:select name="loaDtl[%{index}].iType" list="types" value="%{iType}" theme="simple"/>
			   
			        	</td>
			        	<td>
			        		<input type="text" style="width: 99%;" maxlength="250" name="loaDtl[<s:property value="#loaDtlStatus.index"/>].sReason"  value="<s:property value="sReason"/>"/>
			        	</td>
			        	<td>
			        		
			        		<div><a href="<s:url value="http://localhost:8080/OLProject/delete_loa.action?loaID=%{iLoaID}&iID=%{iID}"/>">Xóa</a></div>
			        	</td>
		        	</tr>
		        	
		
		        </s:iterator>
		</TABLE>
		<div style="text-align: right; margin-top: 10px">
			<INPUT type="button" value="Thêm dòng" onclick="Add()"
				class="btn btn-blue" />
		</div>
		<div style="height:10px"></div>
		<div class="floatleft grid_2 txtname">&nbsp;</div><div class="floatleft grid_10"><input type="submit" value="Lưu" class="btn"/> <input type="button" value="Nhập lại" class="btn btn-navy"/></div>
		<div class="clear"></div>
		
		</s:if>
	<s:else>
		<b>Không có dữ liệu với loaID = <s:property value="loaID"/></b>
	</s:else>
		
</s:form>

<div id="AddNewDialog" title="Thêm đơn nghĩ phép mới" style="display: none;">
	<s:form action="addNewLoa" id="addNewLoa" name="addNewLoa?loaID={iLoaID}">
		<s:hidden value="%{loaID}" name="loaID" />
		
 		Từ ngày  <input type="text" readonly="readonly" name="detail.dFromday" class="isDatepicker" value="<s:date name="dFromday" format="yyyy/MM/dd" />"/>
		<br/>	    
		Tới ngày <input type="text" readonly="readonly" name="detail.dToday"   class="isDatepicker" value="<s:date name="dToday" format="yyyy/MM/dd" />"/>
		<br/>	        
		Số ngày  <input type="text" style="width: 50px;" name="detail.iDayno">
		<br/>
		Loại phép <s:select name="detail.iType" list="types" value="" theme="simple"/>
		<br/>
		Lý do     <input type="text" style="width: 99%;" maxlength="250" name="detail.sReason"  value=""/>
	</s:form>
</div>

<input type="hidden" id="currentDate" name="currentDate" value="<s:property value="currentDate"/>"/>
<script type="text/javascript">
	

	function Add() {
		$("#AddNewDialog").dialog({
			width : 700,
			height : 300,
			modal : true,
			buttons : {
				"Thêm mới" : function() {
					
					
					if(validateForm()){
						$('#addNewLoa').submit();
						
						}
					//$(this).dialog("close");
					
					
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