package controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import IMP_service.Imp_user;
import model.User;
import service.ServiceUser;

/**
 * Servlet implementation class Servlet_login
 */
@WebServlet("/Servlet_login")
public class Servlet_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_login() {
        super();
        // TODO Auto-generated constructor stub
    }
    ServiceUser Suser = new Imp_user();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User u =new User();
		User u_verification=new User();
		String nom = request.getParameter("nom");
		String pass = request.getParameter("pass");
		u.setNom(nom);
		u.setPass(pass);
		System.out.println(u);
		
	u_verification=Suser.login(u);
	if(u_verification.getPass().equals(u.getPass()) && u_verification.getNom().equals(u.getNom()) && u_verification.getEtat().equals("valide")) {
		if(u_verification.getType().equals("vendeur")) {
		
		request.setAttribute("id_user", u_verification.getId());
		request.getServletContext().getRequestDispatcher("/Servlet_affichage").forward(request, response);
		}
		else if(u_verification.getType().equals("client")) {
	
		request.setAttribute("id_user", u_verification.getId());
		request.setAttribute("nom_user", u_verification.getNom());
		request.getServletContext().getRequestDispatcher("/Servlet_Affichage_liste_client").forward(request, response);
		}
		else if(u_verification.getType().equals("admin")) {
			
			request.setAttribute("id_user", u_verification.getId());
			request.getServletContext().getRequestDispatcher("/Servlet_affiche_admin").forward(request, response);
			}
	}
	else {
		response.setContentType("text/html");
		String message="Votre login/mots de pass sont incorectes ou votre compte n'est pas encore valide par admin";

		request.setAttribute("message", message);
		request.getRequestDispatcher("/log.jsp").forward(request, response);
	}

}}
