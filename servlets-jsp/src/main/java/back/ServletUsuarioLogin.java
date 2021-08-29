package back;

import java.io.IOException;

import com.sun.org.apache.bcel.internal.generic.NEW;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/ServletUsuarioLogin")
public class ServletUsuarioLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
    public ServletUsuarioLogin() {
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String nome = request.getParameter("nome");

		
		ModelLogin modelLogin = new ModelLogin();
		modelLogin.setLogin(login);
		modelLogin.setSenha(senha);
		modelLogin.setNome(nome);

		RequestDispatcher redirecionar = request.getRequestDispatcher("/novocadastro.jsp");
		redirecionar.forward(request, response);
		
		
		
	}

}
