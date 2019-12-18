package q3b;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/abcd")
public class q3b extends HttpServlet {
	public String Initials(String s) {
		char x = s.charAt(0);
		String ini="";
		ini += x;
		for(int i=1;i<s.length()-1;i++)
		{
			char c=s.charAt(i);
			char d=s.charAt(i+1);
			if((c==' ')&&(d!=' ')&&((i+1)!=s.length()))
			{
				ini+= d;
			}
		}
		return ini;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String ini=Initials(name);
		out.println(ini);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}