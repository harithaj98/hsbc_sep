package com.facebookweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.facebookweb.entity.FacebookUser;
import com.facebookweb.service.ServiceInterface;
import com.facebookweb.utility.ServiceFactory;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	
	private ServiceInterface fs=null;
	
	public RegistrationServlet(){
		fs= ServiceFactory.createObject("admin");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		String n1= request.getParameter("name");
		String n2= request.getParameter("password");
		String n3= request.getParameter("email");
		String n4= request.getParameter("address");
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		out.println("<html><body>");
			out.println("Your name is"+n1);
			out.println("<br>Your password is"+n2);
			out.println("<br>Your email is"+n3);
			out.println("<br>Your Address is"+n4);
		out.println("</html></body>");
		
		
			FacebookUser fu= new FacebookUser();
			fu.setName(n1);
			fu.setPassword(n2);
			fu.setEmail(n3);
			fu.setAddress(n4);
			
			int i=fs.createProfileService(fu);
			
			if(i>0)
			{
				out.println("<html><body>");
				out.println("Registration successful   <a href=login.html>Continue...</a>");
				out.println("</html></body>");
			
			}
			
			else {
				{
					out.println("<html><body>");
				out.println("Error");
				out.println("</html></body>");
				
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
			
			
	}

}
