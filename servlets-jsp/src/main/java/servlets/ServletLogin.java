package servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ModelLogin;


@WebServlet("/ServletLogin")/*mapeamento da pagina*/
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public ServletLogin() {
    }

	/*recebe os dados pela url por parametos*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/*recebe os dados enviados p formulario*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		if (login != null && !login.isEmpty() && senha != null && !senha.isEmpty()) {

		ModelLogin modelLogin = new ModelLogin();
		modelLogin.setLogin(login);
		modelLogin.setLogin(senha);
		

	}
	else {
		RequestDispatcher redirecionar = request.getRequestDispatcher("index.jsp");
		request.setAttribute("msg", "Informe o Login e senha corretamente");
		redirecionar.forward(request, response);
	}
}
}