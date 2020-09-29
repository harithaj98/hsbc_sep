<%@page import="com.ajax.service.ServiceInterface,com.ajax.utility.ServiceFactory" %>
<%String n=request.getParameter("source");

	ServiceInterface cd= ServiceFactory.createObject("admin");
	StringBuilder i=cd.getCity(n);
	out.println(i.toString());
	
%>