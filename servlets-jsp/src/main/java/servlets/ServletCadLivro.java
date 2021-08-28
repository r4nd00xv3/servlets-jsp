package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ModelLogin;	


@WebServlet("/ServletCadLivro")
public class ServletCadLivro extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public ServletCadLivro() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeaut = request.getParameter("nomeaut");
		String titulob = request.getParameter("titulob");
		String id = request.getParameter("id");
		
		ModelLogin modelLogin = new ModelLogin();
		modelLogin.setNomeaut(nomeaut);
		modelLogin.setTitulob(titulob);
		modelLogin.setId(id != null && !id.isEmpty()? Long.parseLong(id):null);


		

		
	}

}
