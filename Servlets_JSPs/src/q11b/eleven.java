package q11b;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/eleven")
public class eleven extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Connection con = null;
		ResultSet rs ;
		String q;
		out.print("<html><body><h1><center>Q11b</center></h1>");
		out.print("<br></br>");
		int ch = Integer.parseInt(request.getParameter("choice"));
		out.print("Your choice = "+ ch +"<br></br>");
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/see","root","");
			out.print("Connection succesful to the database<br></br>");
			Statement st = con.createStatement();
			switch(ch)
			{	case 1:
						q = "select * from subject";
						rs = st.executeQuery(q);
						out.print("<table style='border: 1px solid black;'><tr><th>Sl_NO.</th><th>Subject_ID</th><th>Subject_Name</th><th>Faculty_ID</th></tr>");
						while(rs.next())
						{
							out.print("<tr><th>"+ rs.getRow() +"</th><th>"+ rs.getInt(1) +"</th><th>"+ rs.getString(2) +"</th><th>"+ rs.getInt(3) +"</th></tr>");
						}
						out.print("</table>");
						out.print("<br></br>");
						break;
				case 2: 
						q = "update subject set sub_name='DEVANAGRI' where faculty_id='"+ request.getParameter("faculty_id") +"'";
						int res = st.executeUpdate(q);
						out.print("<br></br>No. of Record updated are :"+ res);
						out.print("<br></br>");
			}
		}
		catch(SQLException e)
		{	out.print("<br></br>");
			out.print("sql error:"+e);
		}
		catch(Exception e)
		{	out.print("<br></br>");
			out.print("error:"+e);
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				out.print("<br></br>");
				out.print("sql error:"+e);
			}
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}