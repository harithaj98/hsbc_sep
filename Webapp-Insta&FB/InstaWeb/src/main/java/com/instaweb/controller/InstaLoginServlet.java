package com.instaweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.instaweb.entity.InstaUser;
import com.instaweb.service.ServiceInterface;
import com.instaweb.utility.ServiceFactory;



public class InstaLoginServlet extends HttpServlet {
	
private ServiceInterface is=null;
	
	public InstaLoginServlet(){
		is= ServiceFactory.createObject("admin");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		
		InstaUser iu=new InstaUser();
		iu.setName(name);
		iu.setPassword(password);
		
		boolean i=false;
		
		i=is.loginprofile(iu);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		if(i) {
			
			HttpSession ss= request.getSession(true);
			ss.setAttribute("userid", name);
			ss.setAttribute("pass", password);
			
			out.println("welcome "+name+"   <a href=TimeLine>timeline</a>   <a href=FollowersList>Followers</a>");
		}
		
		else {
			out.println("Invalid id and password");
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/InstaLogin.html");
			rd.include(request, response);
		}
		out.println("</body></html>");
		
	}

}
