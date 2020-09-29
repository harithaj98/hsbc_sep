<%@page import="java.util.*" %>


<%
List<String> i=new ArrayList<String>();
i.add("India");
i.add("US");
String ss="<select>";
for(String ll:i){
	ss=ss+"<option>"+ll+"</option>";
}
ss=ss+"</select>";
out.println(ss);
%>