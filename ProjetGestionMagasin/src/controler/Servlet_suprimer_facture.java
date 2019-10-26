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
 * Servlet implementation class Servlet_suprimer_facture
 */
@WebServlet("/Servlet_suprimer_facture")
public class Servlet_suprimer_facture extends HttpServlet {
	private static final long serialVersionUID = 1L;
       ServiceProduit Sproduit = new Imp_service_Produit();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_suprimer_facture() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id_produit = Integer.parseInt(request.getParameter("id"));
		int id_user = Integer.parseInt(request.getParameter("id_user"));
		Sproduit.suprimer_produit_facutre(id_produit,id_user);
		request.getServletContext().getRequestDispatcher("/Servlet_facture").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
