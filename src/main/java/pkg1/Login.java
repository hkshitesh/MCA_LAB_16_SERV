package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Login() {
        super();
     }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();		
		String n=request.getParameter("userName");
		String p=request.getParameter("userPass");
		if(n.equals("mca") && p.equals("servlet"))
		{
		RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");
	    rd.forward(request, response);
	}
	   else{
		out.print("Sorry UserName or Password Error!");
		RequestDispatcher rd=request.getRequestDispatcher("/index.html");
		rd.include(request, response);
	}
	}
}
