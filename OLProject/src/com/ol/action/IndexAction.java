package com.ol.action;

/**
 * Author: 			
 * Created date: 	
 * Description: 	Implementing 
 * Related:			Struts 2, Annotation, Log4j
 */

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
public class IndexAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Override
	@Action(value = "index", results = { @Result(name = "success", type="redirect", location = "/view_profile") })
	public String execute() {
		try {
			
			//all your code here
			//test svn
			//xxx
			//xxx

		} catch (Exception ex) {
			return "error";
		}

		return SUCCESS;
	}

}
