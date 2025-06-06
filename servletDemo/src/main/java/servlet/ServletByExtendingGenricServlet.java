package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletByExtendingGenricServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String name = request.getParameter("name");
		String age = request.getParameter("age");

		PrintWriter out=response.getWriter();
		out.println("<h1> Hello from Genric Servlet </h1>");
		out.println("<p> your age is : "+age +"</p>");
		out.println("<P>your name is :"+name+"<p>");
		
		
		
		
		
	}

}
