package servlets;

import java.io.IOException;

import dao.DAOLoginRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ModelLogin;


@WebServlet(urlPatterns = {"/principal/ServletLogin", "/ServletLogin"})/*mapeamento da pagina*/
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DAOLoginRepository daoLoginRepository =  new DAOLoginRepository();

   
    public ServletLogin() {
    }

	/*recebe os dados pela url por parametos*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

	/*recebe os dados enviados p formulario*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String url = request.getParameter("url");
						try {
							
						
						
						if (login != null && !login.isEmpty() && senha != null && !senha.isEmpty()) {
				
						
						ModelLogin modelLogin = new ModelLogin();
						modelLogin.setLogin(login);
						modelLogin.setSenha(senha);
				
							if (daoLoginRepository.validarAutenticacao(modelLogin)) {
								
								request.getSession().setAttribute("usuario", modelLogin.getLogin());
								if (url == null || url.equals("null")) {
									url = "principal/principal.jsp";
									
								}
								
								RequestDispatcher redirecionar = request.getRequestDispatcher(url);
								request.setAttribute("msg", "Informe o Login e senha corretamente");
								redirecionar.forward(request, response);
							}
							  else {
								RequestDispatcher redirecionar = request.getRequestDispatcher("/index.jsp");
								request.setAttribute("msg", "Informe o Login e senha corretamente");
								redirecionar.forward(request, response);
							}	
				
					}
					else {
						RequestDispatcher redirecionar = request.getRequestDispatcher("index.jsp");
						request.setAttribute("msg", "Informe o Login e senha corretamente");
						redirecionar.forward(request, response);
					}
					} catch (Exception e) {
						e.printStackTrace();
	}
	}}