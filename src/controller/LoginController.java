package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;
import service.LoginService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String loginViewPath = "/WEB-INF/view/login.jsp";
	private static String mainViewPath = "/index.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher(loginViewPath);
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoginService service = new LoginService();
		User user = service.getUser(request.getParameter("id"), request.getParameter("password"));
		
		String viewPath;
		if (user == null) {
			viewPath = loginViewPath;
			request.setAttribute("error", "사용자 정보가 없습니다.");
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			viewPath = request.getContextPath() + mainViewPath;
			response.sendRedirect(viewPath);
			return;
		}
		
		RequestDispatcher view = request.getRequestDispatcher(viewPath);
		view.forward(request, response);
	}

}










