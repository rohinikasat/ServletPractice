package apex.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserFormServlet
 */
@WebServlet("/UserFormServlet")
public class UserFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fullName = request.getParameter("fullName");
		String phoneNumber = request.getParameter("phoneNumber");
		String gender = request.getParameter("gender");
		String[] languages = request.getParameterValues("languages");
		
		response.getWriter().print("<h1> My Details from Get </h1>");
		response.getWriter().print("<h2 style=\"color: blue ; font-family: serif; font-style: italic\">" + fullName + "===" + phoneNumber + "===" + gender + "===" + languages[0] + "===" + languages[1] );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fullName = request.getParameter("fullName");
		String phoneNumber = request.getParameter("phoneNumber");
		String gender = request.getParameter("gender");
		String[] languages = request.getParameterValues("languages");
		
		response.getWriter().print("<h1> My Details from Get </h1>");
		response.getWriter().print("<h2 style=\"color: blue ; font-family: serif; font-style: italic\">" + fullName + "===" + phoneNumber + "===" + gender + "===" + languages[0] + "===" + languages[1] );

	}

}
