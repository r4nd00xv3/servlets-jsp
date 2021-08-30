package back;

import java.io.IOException;
import org.apache.tomcat.util.descriptor.web.LoginConfig;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/ServletUsuarioLogin")
public class ServletUsuarioLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private DAORegistroRepository daoRegistroRepository = new DAORegistroRepository();

    public ServletUsuarioLogin() {
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
		    String login = request.getParameter("login");
		    String senha = request.getParameter("senha");
		    String nome = request.getParameter("nome");
			String nomeaut = request.getParameter("nomeaut");
			String titulob = request.getParameter("titulob");
			String id = request.getParameter("id");
			

			
			ModelLogin modelLogin = new ModelLogin();
			
			modelLogin.setLogin(login);
			modelLogin.setSenha(senha);
			modelLogin.setNome(nomeaut);
			modelLogin.setNomeaut(nomeaut);
			modelLogin.setTitulob(titulob);
			modelLogin.setId(id != null && !id.isEmpty()? Long.parseLong(id):null);
			
	       daoRegistroRepository.gravarNewUser(modelLogin);
			
			
			request.setAttribute("msg", "Operação realizada com sucesso!");
			request.setAttribute("modolLogin", modelLogin);
			request.getRequestDispatcher("/novocadastro.jsp").forward(request, response);
			
			} catch (Exception e) {
				e.printStackTrace();
				RequestDispatcher redirecionar = request.getRequestDispatcher("erro.jsp");
				request.setAttribute("msg", e.getMessage());
				redirecionar.forward(request, response);

			
		}
		}}