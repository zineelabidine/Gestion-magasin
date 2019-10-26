package controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import IMP_service.Imp_service_Produit;
import model.Produit;
import service.ServiceProduit;

/**
 * Servlet implementation class Servlet_ajouter
 */
@WebServlet("/Servlet_ajouter")
public class Servlet_ajouter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_ajouter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServiceProduit Sproduit =new Imp_service_Produit();
		Produit p=new Produit();
		PrintWriter out = response.getWriter();
	

		String nom = request.getParameter("nom");
		float prix = Float.parseFloat(request.getParameter("prix"));
		p.setNom(nom);
		p.setPrix(prix);
		Sproduit.ajouter_produit(p);
		request.getServletContext().getRequestDispatcher("/Servlet_affichage").forward(request, response);
	}

}
