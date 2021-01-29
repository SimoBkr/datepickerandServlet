package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/registerPage.jsp").forward(request, response);

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String name = request.getParameter("name");
		String date = request.getParameter("birthdaydate");
		
		User user = new User(name, email, date);
		
		request.setAttribute("user", user);
		
		request.getRequestDispatcher("/WEB-INF/welcome.jsp").forward(request, response);

	}

}
