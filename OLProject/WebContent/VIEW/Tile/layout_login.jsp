<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <title>LOA Project</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/common.css" media="screen" />

    <sx:head />
</head>
<body>
	<tiles:insertAttribute name="body"></tiles:insertAttribute>
</body>
</html>