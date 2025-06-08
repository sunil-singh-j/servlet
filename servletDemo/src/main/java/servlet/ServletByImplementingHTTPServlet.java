package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hellohttp")
public class ServletByImplementingHTTPServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		out.println("<html><body>");
		out.println("<h1>Hello from HttpServlet ! </h1>");
		out.println("</body></html>");
	}

}
