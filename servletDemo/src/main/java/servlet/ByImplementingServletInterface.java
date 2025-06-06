package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ByImplementingServletInterface implements Servlet {
	
	private ServletConfig config;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Servlet destr");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "Basic Servlet Implementation example";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config=config;
		System.out.println("Servlet initialized");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		out.println("<h1> Hello from servlet Interface !</h1>");
		int a=100;
		out.println("<h2>the value of a is "+a+"</h2>");
		
		
		
		
		
		
	}

}
