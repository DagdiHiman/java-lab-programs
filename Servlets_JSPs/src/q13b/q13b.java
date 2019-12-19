package q13b;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Q13_b")
public class q13b extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<html><body>Q13B<hr><br></br>");
//		Cookie[] c=new Cookie[6];
//		for(int i=0;i<6;i++) {
//			c[i]=new Cookie("justsomething"+i,"Cookie_value");
//		}
//		c[3].setMaxAge(60*60);
//		c[4].setMaxAge(60*60);
//		c[5].setMaxAge(60*60);
//		for(int i=0;i<6;i++) {
//			response.addCookie(c[i]);
//		}
		out.print("Cookies Added");
		out.print("<br></br>");
		//GET cookies:
		Cookie[] ck = request.getCookies();
		for(int i=0; i<ck.length; i++) {
			out.print("COOKIE: "+ ck[i].getName()+" value: "+ ck[i].getValue()+"<br></br>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}