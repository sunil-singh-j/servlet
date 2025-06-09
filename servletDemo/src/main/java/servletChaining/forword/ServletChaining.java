package servletChaining.forword;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet chaining refers to the process where multiple servlets are linked together to process a single 
//request sequentially, where each servlet passes the request/response to the next in the chain.

// 1. forward() — Forwarding the request
//Control is transferred to another resource.
//
//The original servlet's output is discarded.
//
//The client sees the output only from the forwarded resource.
//
//Browser URL does NOT change.


@WebServlet("/a")
public class ServletChaining extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		out.print("<h1>this is from servlet A");
		
		request.setAttribute("message", "data from servlet A");
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("B");
		dispatcher.forward(request, response);
	}

}
