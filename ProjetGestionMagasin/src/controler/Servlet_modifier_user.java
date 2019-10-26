package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import IMP_service.Imp_user;
import model.Produit;
import model.User;
import service.ServiceUser;

/**
 * Servlet implementation class Servlet_modifier_user
 */
@WebServlet("/Servlet_modifier_user")
public class Servlet_modifier_user extends HttpServlet {
	private static final long serialVersionUID = 1L;
      ServiceUser Suser = new Imp_user(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_modifier_user() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User us= new User();
		int id = Integer.parseInt(request.getParameter("id"));
		String nom = request.getParameter("nom");
		String pass=request.getParameter("pass");
		String type=request.getParameter("type");
		String etat=request.getParameter("etat");
		us.setNom(nom);
		us.setPass(pass);
		us.setType(type);
		us.setEtat(etat);
		Suser.modifier(us, id);
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
