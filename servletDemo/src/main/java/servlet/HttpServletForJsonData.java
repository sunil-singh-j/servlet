package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsondata")
public class HttpServletForJsonData extends HttpServlet {
	
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
			String json=" {\"name \":\"sunil\",\"age\":22}";
			
			PrintWriter out=response.getWriter();
			out.println(json);
			
	}

}
