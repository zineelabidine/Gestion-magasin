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
 * Servlet implementation class Servlet_Affichage_liste_client
 */
@WebServlet("/Servlet_Affichage_liste_client")
public class Servlet_Affichage_liste_client extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProduit Sproduit =new Imp_service_Produit();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_Affichage_liste_client() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("servlet liste_client");
		request.setAttribute("liste_achat", Sproduit.getall());
		request.getRequestDispatcher("/achat.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				doGet(request, response);
	}

}
