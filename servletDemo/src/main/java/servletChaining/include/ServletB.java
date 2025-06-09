package servletChaining.include;


//2. include() — Including output from another resource
//The output of the included resource is inserted into the response of the current servlet.
//
//Control returns back to the original servlet after inclusion.
//
//Useful for reusable components like headers, footers, menus.

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sub")
public class ServletB extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		
		PrintWriter out= resp.getWriter();
		
		out.println("this from the subServlet B");
	}

}
