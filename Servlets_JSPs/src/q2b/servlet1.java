package q2b;
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

@SuppressWarnings("serial")
@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body><h1><center>!---------POLICE STATION---------!</center></h1>");
		Connection con=null;
		Statement s;
		ResultSet rs;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/see","root","");
			out.print("<br></br><bold>Connection Successful</bold>");
			String query1="select area,phno from police_station";
			s=con.createStatement();
			rs=s.executeQuery(query1);
			String val=request.getParameter("value");
			int n=Integer.parseInt(request.getParameter("val"));
			//String query="select area,phno from police_station";
			//Statement stmt=con.createStatement();
			//ResultSet rs=stmt.executeQuery(query);
			out.print("<br></br><bold>Query executed</bold>");
			switch(n)
			{
			case 1:
				int c=0;
				while(rs.next())
				{
					if(rs.getString("area").equals(val))
					{
						out.println(rs.getString(1)+"\n"+rs.getString(2));
						c=1;
					}
				}
				if(c==0)
					out.println("NO ");
				break;
			case 2:
				int c1=0;
				while(rs.next())
				{
					if(rs.getString("phno").equals(val))
					{
						out.println(rs.getString(1)+"\n"+rs.getString(2));
						c1=1;
					}
				}
				if(c1==0)
					out.println("NO ");
				break;	
			}

		}
		catch(SQLException e) {
			out.println("error:"+e);
		}
		catch(Exception e)
		{
			out.println("error:"+e);
		}
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		}*/
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body><h1><center>!---------POLICE STATION---------!</center></h1>");
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/";
		String dbname="see";
		String username="root";
		String password="";
		Statement s1;
		ResultSet rs1;
		Connection con;
		String ap=request.getParameter("val");
		int n=Integer.parseInt(request.getParameter("n"));
		try{
			Class.forName(driver);
			con=DriverManager.getConnection(url+dbname,username,password);
			out.print("<br></br><bold>Connection Successful</bold>");
			String query1="select area,phno from police_station";
			s1=con.createStatement();
			rs1=s1.executeQuery(query1);
			switch(n)
			{
			case 1:
				int c=0;
				while(rs1.next())
				{
					if(rs1.getString("area").equals(ap))
					{
						out.println(rs1.getString(1)+rs1.getString(2));
						c=1;
					}
				}
				if(c==0)
					out.println("NO ");
				break;
			case 2:
				int c1=0;
				while(rs1.next())
				{
					if(rs1.getString("phno").equals(ap))
					{
						out.println(rs1.getString(1)+rs1.getString(2));
						c1=1;
					}
				}
				if(c1==0)
					out.println("NO ");
				break;	
			}
		}
		catch(SQLException e) {
			out.println("error:"+e);
		}
		catch(Exception e)
		{
			out.println("error:"+e);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}