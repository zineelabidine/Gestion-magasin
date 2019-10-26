package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import IMP_service.Imp_service_Produit;
import IMP_service.Imp_user;
import service.ServiceProduit;
import service.ServiceUser;

/**
 * Servlet implementation class Servlet_suprimer_user
 */
@WebServlet("/Servlet_suprimer_user")
public class Servlet_suprimer_user extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_suprimer_user() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServiceUser Suser = new Imp_user();
		System.out.println("serlet suprimer");
		int id = Integer.parseInt(request.getParameter("id"));
		Suser.suprimer(id);
		request.getServletContext().getRequestDispatcher("/Servlet_affiche_admin").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
