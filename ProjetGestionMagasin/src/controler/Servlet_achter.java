package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import IMP_service.Imp_service_Produit;
import service.ServiceProduit;

/**
 * Servlet implementation class Servlet_achter
 */
@WebServlet("/Servlet_achter")
public class Servlet_achter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_achter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServiceProduit Sproduit =new Imp_service_Produit();
		int id_produit = Integer.parseInt(request.getParameter("id"));
		int id_user = Integer.parseInt(request.getParameter("id_user"));
		String nom_user=request.getParameter("nom_user");
		request.setAttribute("nom_user",nom_user);
		
		Sproduit.achter(id_produit, id_user);
		request.setAttribute("id_user", id_user);
		request.getServletContext().getRequestDispatcher("/Servlet_Affichage_liste_client").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
