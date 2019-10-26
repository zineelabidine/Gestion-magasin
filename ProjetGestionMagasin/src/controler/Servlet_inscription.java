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
 * Servlet implementation class Servlet_inscription
 */
@WebServlet("/Servlet_inscription")
public class Servlet_inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_inscription() {
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
		String pass = request.getParameter("password");
		String pass_confirmed = request.getParameter("password_confirm");
		String type = request.getParameter("type");
		String etat="en_cours";
		if(pass.equals(pass_confirmed) && pass.length()>5) {
		us.setNom(nom);
		us.setPass(pass);
		us.setType(type);
		us.setEtat(etat);
		Suser.ajouter(us);
		request.getServletContext().getRequestDispatcher("/Servlet_first").forward(request, response);
		}
		else {
			
			String message ="Erreur dans votre inscription, merci de respecter les instructions";
			request.setAttribute("message", message);
			request.getRequestDispatcher("/inscription.jsp").forward(request, response);
			
		}
	}

}
