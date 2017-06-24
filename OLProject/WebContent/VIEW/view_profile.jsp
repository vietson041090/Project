<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>


<div class="floatleft grid_2 txtname">Mã nhân viên:</div><div class="floatleft grid_10"><s:property value="emp.sID"/></div>
<div class="clear"></div>

<div class="floatleft grid_2 txtname">Họ tên:</div><div class="floatleft grid_10"><s:property value="emp.sFullname"/></div>
<div class="clear"></div>

<div class="floatleft grid_2 txtname">Email:</div><div class="floatleft grid_10"><s:property value="emp.sEmail"/></div>
<div class="clear"></div>

<div class="floatleft grid_2 txtname">Mật khẩu:</div><div class="floatleft grid_10">*********
<s:set value="#session.loggedEmpID" var="usrid"/>
<s:if test="#usrid==emp.sID">
	<s:url id="urlLogout" action="changePasswordForm"></s:url>
	<s:a href="%{urlLogout}">( Đổi mật khẩu )</s:a>
</s:if>
</div>
<div class="clear"></div>

<div class="floatleft grid_2 txtname">Ngày bắt đầu làm việc:</div><div class="floatleft grid_10"><s:date name="emp.dStartday" format="yyyy/MM/dd" /></div>
<div class="clear" style="height:30px"></div>

<h3>Thông tin về ngày phép:</h3>

<div class="floatleft grid_2 txtname">Số ngày nghỉ trong tháng:</div><div class="floatleft grid_10"><s:property value="emp.IMonthLoa"/></div>
<div class="clear"></div>

<div class="floatleft grid_2 txtname">Phép:</div><div class="floatleft grid_10"><s:property value="emp.IOkLoa"/></div>
<div class="clear"></div>

<div class="floatleft grid_2 txtname">Không phép:</div><div class="floatleft grid_10">0.0</div>
<div class="clear" style="height:30px"></div>

<div class="floatleft grid_2 txtname">Số ngày đã nghỉ trong năm:</div><div class="floatleft grid_10"><s:property value="okAllDayNo"/></div>
<div class="clear"></div>

<div class="floatleft grid_2 txtname">Số ngày còn lại trong năm:</div><div class="floatleft grid_10"><s:property value="restDayNo"/></div>
<div class="clear"></div>


