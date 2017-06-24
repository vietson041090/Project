<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<ul class="nav main">
	
	<li class="ic-notifications"><a href="<%=request.getContextPath()%>/"><span>Trang chủ</span></a></li>
	<s:set value="#session.loggedType" var="usrtype"/>
	<s:if test="#usrtype==1">
		<li class="ic-charts">
			<s:url id="urlValue" action="view_Emp">
			</s:url>
			<s:a href="%{urlValue}"><span>Nhân viên</span></s:a>
		
		</li>
		<li class="ic-charts">
			<s:url id="urlValue" action="view_Prj">
			</s:url>
			<s:a href="%{urlValue}"><span>Dự án</span></s:a>
		
		</li>
		<li class="ic-charts"><s:url id="urlValue" action="view_profile"></s:url>
			<s:a href="%{urlValue}"><span>Xem thông tin cá nhân</span></s:a>
		</li>
	</s:if>
	<s:elseif test="#usrtype==2">
		<li class="ic-charts">
			<s:url id="urlValue" action="time_report">
			</s:url>
			<s:a href="%{urlValue}"><span>Thống kê theo thời gian</span></s:a>
		
		</li>
		<li class="ic-charts">
			<s:url id="urlValue" action="day_report">
			</s:url>
			<s:a href="%{urlValue}"><span>Thống kê theo ngày nghỉ</span></s:a>
		
		</li>
		<li class="ic-charts"><s:url id="urlValue" action="view_profile"></s:url>
			<s:a href="%{urlValue}"><span>Xem thông tin cá nhân</span></s:a>
		</li>
	</s:elseif>
	<s:else>
		<li class="ic-charts"><s:url id="urlValue" action="add_loa_form"></s:url>
			<s:a href="%{urlValue}"><span>Tạo đơn</span></s:a>
		</li>
		<li class="ic-charts"><s:url id="urlValue" action="ViewPersonalLoaLetter"></s:url>
			<s:a href="%{urlValue}"><span>Danh sách đơn cá nhân</span></s:a>
		</li>
		<li class="ic-charts"><s:url id="urlValue" action="waiting_loa"></s:url>
			<s:a href="%{urlValue}"><span>Danh sách đơn chờ duyệt</span></s:a>
		</li>
		<li class="ic-charts"><s:url id="urlValue" action="view_loa_his"></s:url>
			<s:a href="%{urlValue}"><span>Lịch sử duyệt đơn</span></s:a>
		</li>
		<li class="ic-charts"><s:url id="urlValue" action="ShowAuthorizationForm"></s:url>
			<s:a href="%{urlValue}"><span>Ủy quyền</span></s:a>
		</li>
		<li class="ic-charts"><s:url id="urlValue" action="view_profile"></s:url>
			<s:a href="%{urlValue}"><span>Xem thông tin cá nhân</span></s:a>
		</li>
	</s:else>
</ul>