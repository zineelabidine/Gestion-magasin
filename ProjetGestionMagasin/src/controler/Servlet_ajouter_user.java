package controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import IMP_service.Imp_service_Produit;
import IMP_service.Imp_user;
import model.Produit;
import model.User;
import service.ServiceProduit;
import service.ServiceUser;

/**
 * Servlet implementation class Servlet_ajouter_user
 */
@WebServlet("/Servlet_ajouter_user")
public class Servlet_ajouter_user extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_ajouter_user() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	ServiceUser Suser = new Imp_user();
		User us=new User();
		PrintWriter out = response.getWriter();
	

		String nom = request.getParameter("nom");
		String pass = request.getParameter("pass");
		String type = request.getParameter("type");
		String etat=request.getParameter("etat");
	
		us.setNom(nom);
		us.setPass(pass);
		us.setType(type);
		us.setEtat(etat);
		Suser.ajouter(us);
		request.getServletContext().getRequestDispatcher("/Servlet_affiche_admin").forward(request, response);
	}

}
