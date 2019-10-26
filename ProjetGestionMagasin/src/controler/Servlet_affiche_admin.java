package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import IMP_service.Imp_user;
import service.ServiceUser;

/**
 * Servlet implementation class Servlet_affiche_admin
 */
@WebServlet("/Servlet_affiche_admin")
public class Servlet_affiche_admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       ServiceUser Suser =new Imp_user();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_affiche_admin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setAttribute("liste_user", Suser.getall());
		request.getRequestDispatcher("/affichage_admin.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
