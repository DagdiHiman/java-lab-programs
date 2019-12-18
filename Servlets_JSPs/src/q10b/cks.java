package q10b;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cks")
public class cks extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user=request.getParameter("name");
		out.print("<html><body><h1>PAGE1</h1>");
		//Set cookies part
		
		Cookie ck=new Cookie("user",user);
		response.addCookie(ck);
		
		//GET cookies part

		int flag=0;
		Cookie[]  c=request.getCookies();
		out.print("<br></br>");
//		for(int i=0;i<c.length;i++){
//			out.print("<br></br>");
//			 out.print("Name: "+c[i].getName()+" & Value: "+c[i].getValue());
//			}
		out.print("<br></br>");
		for(int i=0;i<c.length;i++){
			if((c[i].getValue()).equals(user)) {
				out.println("Welcome BACK, "+c[i].getValue());
				flag=1;
			}
		}
		if (flag == 0)
			out.println("Welcome, "+ user);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}