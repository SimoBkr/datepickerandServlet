package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Alldattesformat;

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/registerPage.jsp").forward(request, response);

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String datepickermonthdisabled = request.getParameter("datepickermonthdisabled");
		String simpledate = request.getParameter("simpledatepicker");
		String datepickerallchangeandtwomonth = request.getParameter("datepickerallchangeandtwomonth");
		String datepickermax = request.getParameter("datepickermax");
		
		Alldattesformat allformat = new Alldattesformat(simpledate,datepickermonthdisabled,datepickerallchangeandtwomonth
				,datepickermax);
		
		request.setAttribute("allformat", allformat);
		
		request.getRequestDispatcher("/WEB-INF/welcome.jsp").forward(request, response);

	}

}
