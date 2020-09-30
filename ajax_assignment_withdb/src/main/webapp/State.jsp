<%@page import="java.util.*, com.ajax.service.ServiceInterface,com.ajax.utility.ServiceFactory" %>

<%
List<String> i=new ArrayList<String>();

String n= request.getParameter("countryname");

ServiceInterface cs=ServiceFactory.createObject("admin");
i= cs.getState(n);
String ss="<select id=ss name=state  onchange=loadcity()>";
for(String ll:i){
	ss=ss+"<option value='"+ll+"'>"+ll+"</option>";
}
ss=ss+"</select>";
out.println(ss);

%>