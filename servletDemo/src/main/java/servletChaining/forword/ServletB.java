package servletChaining.forword;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/B")
public class ServletB extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		PrintWriter out=resp.getWriter();
		String msg=(String)req.getAttribute("message");
		resp.setContentType("text/html");
		out.println("<h2> this servlet B");
		
		out.println("<h2>Servlet B received  : "+msg +" <h2>");
		
		
		
	}

}
