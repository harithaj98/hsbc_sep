<%@page import="java.util.*, com.ajax.service.ServiceInterface,com.ajax.utility.ServiceFactory" %>


<%
List<String> i=new ArrayList<String>();

ServiceInterface cs=ServiceFactory.createObject("admin");
i= cs.getCountry();


String ss="<select id=cc name=country   onchange=loadstate()>";
for(String ll:i){
	ss=ss+"<option>"+ll+"</option>";
}
ss=ss+"</select>";
out.println(ss);
%>