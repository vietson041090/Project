<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <title>LOA Project</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/reset.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/text.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/grid.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/layout.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/nav.css" media="screen" />
    <!--[if IE 6]><link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/ie6.css" media="screen" /><![endif]-->
    <!--[if IE 7]><link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/ie.css" media="screen" /><![endif]-->
    
    <!-- BEGIN: load jquery -->
	<link rel="stylesheet" href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css"/>
	<script type="text/javascript" src="<%=request.getContextPath()%>/JS/jquery-1.10.2.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/JS/jquery-ui-1.10.4.js"></script>
    <sx:head />
</head>
<body>
    <div class="container_12">
        <div class="grid_12 header-repeat">
            <tiles:insertAttribute name="header"></tiles:insertAttribute>
        </div>
        
        <div class="clear"></div>
        
        <div class="grid_12">
            <tiles:insertAttribute name="menu"></tiles:insertAttribute>
        </div>
        
        <div class="clear"></div>

        <div class="grid_12">
            <div class="box round first grid">
            	<h2>
				<tiles:insertAttribute name="title"></tiles:insertAttribute> 
				</h2>
             	<tiles:insertAttribute name="body" ignore="false"/>   
             </div>
        </div>
        
        <div class="clear"></div>
    </div>
    
    <div class="clear"></div>
    
    <div id="site_info">
        <p>
            <tiles:insertAttribute name="footer"></tiles:insertAttribute>  
        </p>
    </div>
</body>
</html>
