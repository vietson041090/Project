<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="branding">
	<div class="floatleft">
		<div style="color:#fff;font-size:20px">T.T.S.V.N</div>
	</div>
	<div class="floatright">
		<div class="floatleft">
 
		</div>
		<div class="floatleft marginleft10">
			<ul class="inline-ul floatleft">
			
				<li>Xin chào <b><%= session.getAttribute("loggedFullname") %></b>
				<s:set value="#session.loggedType" var="usrtype"/>
				
				<s:if test="#usrtype==1">
					(Admin)
				</s:if>
				<s:elseif test="#usrtype==2">
					(BO)
				</s:elseif>
				<s:else>
					(User)
				</s:else>
				
				</li>
				<li><s:url id="urlLogout" action="logout"></s:url>
					<s:a href="%{urlLogout}">Thoát ra</s:a></li>
			</ul>
			<br /> <span class="small grey">Đăng nhập gần nhất: <%= session.getAttribute("loggedTime") %></span>
		</div>
	</div>
	<div class="clear"></div>
</div>