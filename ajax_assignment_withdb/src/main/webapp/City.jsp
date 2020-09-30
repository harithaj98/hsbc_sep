<%@page import="java.util.*, com.ajax.service.ServiceInterface,com.ajax.utility.ServiceFactory" %>

<%
List<String> i=new ArrayList<String>();

String n= request.getParameter("statename");

ServiceInterface cs=ServiceFactory.createObject("admin");
i= cs.getCity(n);
String ss="<select id=cc name=city  >";
for(String ll:i){
	ss=ss+"<option value='"+ll+"'>"+ll+"</option>";
}
ss=ss+"</select>";
out.println(ss);
%>

