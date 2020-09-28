package com.instaweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.instaweb.entity.InstaUser;
import com.instaweb.service.ServiceInterface;
import com.instaweb.utility.ServiceFactory;


public class InstaRegistrationServlet extends HttpServlet {		
		
		private ServiceInterface is=null;
		
		public InstaRegistrationServlet(){
			is= ServiceFactory.createObject("admin");
		}
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			try {
			String n1= request.getParameter("name");
			String n2= request.getParameter("password");
			String n3= request.getParameter("email");
			String n4= request.getParameter("address");
			
			response.setContentType("text/html");
			PrintWriter out= response.getWriter();
			
			
				InstaUser iu= new InstaUser();
				iu.setName(n1);
				iu.setPassword(n2);
				iu.setEmail(n3);
				iu.setAddress(n4);
				
				int i=is.createProfileService(iu);
				
				if(i>0)
				{
					out.println("<html><body>");
					out.println("Your name is "+n1);
					out.println("<br>Your password is "+n2);
					out.println("<br>Your email is "+n3);
					out.println("<br>Your Address is "+n4);
					out.println("Registration successful   <a href=InstaLogin.html>Continue...</a>");
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
