package servletChaining.include;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/main")
public class ServletA extends HttpServlet {
	
public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
	resp.setContentType("text/html");
	
	PrintWriter out= resp.getWriter();
	out.println("<h1> Main Servlet   A Start </h1> ");
	
	RequestDispatcher rd=req.getRequestDispatcher("sub");
	
	rd.include(req, resp);
	
	
	out.println("<h1> Main Servlet End</h1>");
	
	
}
}
