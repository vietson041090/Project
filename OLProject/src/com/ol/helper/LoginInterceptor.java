package com.ol.helper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

//import org.apache.commons.lang.xwork.StringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.StrutsStatics;

//import com.hellodoma.actions.UserAction;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor implements
		StrutsStatics {

	private static final long serialVersionUID = 1L;
	private static Logger log4j =  LogManager.getLogger(LoginInterceptor.class);
	private static final String USER_HANDLE = "loggedEmpID";
	private static final String LOGIN_ATTEMPT = "loginAttempt";

	public void init() {
		log4j.info("---------------Intializing LoginInterceptor");
	}

	public void destroy() {
		log4j.info("---------------detroy LoginInterceptor");
	}

	public String intercept(ActionInvocation invocation) throws Exception {

		final ActionContext context = invocation.getInvocationContext();
		HttpServletRequest request = (HttpServletRequest) context.get(HTTP_REQUEST);
		HttpSession session = request.getSession(true);

		// Is there a "user" object stored in the user's HttpSession?
		Object user = session.getAttribute(USER_HANDLE);
		if (user == null) {
			// The user has not logged in yet.
			log4j.error("---------------session user null");
			// Is the user attempting to log in right now?
			String loginAttempt = request.getParameter(LOGIN_ATTEMPT);

			/* The user is attempting to log in. */
			 if (!StringUtils.isBlank(loginAttempt)) {
				 return invocation.invoke();
			 }
			return "login";
		} else {
			log4j.error("---------------session user NOT null");
			return invocation.invoke();
		}
	}

}