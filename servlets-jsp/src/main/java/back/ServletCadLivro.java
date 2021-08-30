package back;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet( urlPatterns =  {"/ServletCadLivro"})
public class ServletCadLivro extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
	private DAOUsuarioRepository daoUsuarioRepository = new DAOUsuarioRepository();

    public ServletCadLivro() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	try {	
		
		 String acao  = request.getParameter("acao");
		 
		 if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("deletar")) {
			 
			 String idUser = request.getParameter("id");
			 
			 daoUsuarioRepository.deletarUser(idUser);
			 
			 List<ModelLogin> modelLogins = daoUsuarioRepository.consultaUsuarioList();
		     request.setAttribute("modelLogins", modelLogins);
		     
			 request.setAttribute("msg", "Excluido com sucesso!");
			 request.getRequestDispatcher("cadlivro.jsp").forward(request, response);
		 }
		 else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("deletarajax")) {
				 
				 String idUser = request.getParameter("id");
				 
				 daoUsuarioRepository.deletarUser(idUser);
				 
				 response.getWriter().write("Excluido com sucesso!");
				 
		 }
		 
		 else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("buscarUserAjax")) {
			 
			 String nomeBusca = request.getParameter("nomeBusca");
			 
			 List<ModelLogin> dadosJsonUser =  daoUsuarioRepository.consultaUsuarioList(nomeBusca);
			 
			 ObjectMapper mapper = new ObjectMapper();
			 
			 String json = mapper.writeValueAsString(dadosJsonUser);
			 
			 response.getWriter().write(json);
			 
		 }
		 
		 else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("buscarEditar")) {
			
			    String id = request.getParameter("id");
			 
			     ModelLogin modelLogin = daoUsuarioRepository.consultaUsuarioID(id);
			 
			     List<ModelLogin> modelLogins = daoUsuarioRepository.consultaUsuarioList();
			     request.setAttribute("modelLogins", modelLogins);
			     
			    request.setAttribute("msg", "Usuário em edição");
				request.setAttribute("modolLogin", modelLogin);
				request.getRequestDispatcher("cadlivro.jsp").forward(request, response);
		 }
		 
		 else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("listarUser")) {
			 
			 List<ModelLogin> modelLogins = daoUsuarioRepository.consultaUsuarioList();
			 
			 request.setAttribute("msg", "Usuários carregados");
		     request.setAttribute("modelLogins", modelLogins);
			 request.getRequestDispatcher("cadlivro.jsp").forward(request, response);
			 
		 }
		 
		 else {
			 List<ModelLogin> modelLogins = daoUsuarioRepository.consultaUsuarioList();
		     request.setAttribute("modelLogins", modelLogins);
			 request.getRequestDispatcher("cadlivro.jsp").forward(request, response);
		 }
		 
		
		 
		 
		}catch (Exception e) {
			e.printStackTrace();
			RequestDispatcher redirecionar = request.getRequestDispatcher("erro.jsp");
			request.setAttribute("msg", e.getMessage());
			redirecionar.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
		String msg = "Operação realizada com sucesso!";	
		
		String id = request.getParameter("id");
		String nome = request.getParameter("nome");
		String nomeaut = request.getParameter("nomeaut");
		String titulob = request.getParameter("titulob");
		String date = request.getParameter("date");
		
		ModelLogin modelLogin = new ModelLogin();
		
		modelLogin.setId(id != null && !id.isEmpty() ? Long.parseLong(id) : null);
		modelLogin.setNome(nome);
		modelLogin.setNomeaut(nomeaut);;
		modelLogin.setTitulob(titulob);
		modelLogin.setDate(date);
		
		
		if (daoUsuarioRepository.validarLogin(modelLogin.getLogin()) && modelLogin.getId() == null) {
			msg = "Já existe usuário com o mesmo login, informe outro login;";
		}else {
			if (modelLogin.isNovo()) {
				msg = "Gravado com sucesso!";
			}else {
				msg= "Atualizado com sucesso!";
			}
			
		    modelLogin = daoUsuarioRepository.gravarUsuario(modelLogin);
		}
		
		
		 List<ModelLogin> modelLogins = daoUsuarioRepository.consultaUsuarioList();
	     request.setAttribute("modelLogins", modelLogins);
		request.setAttribute("msg", msg);
		request.setAttribute("modolLogin", modelLogin);
		request.getRequestDispatcher("cadlivro.jsp").forward(request, response);
		
		} catch (Exception e) {
			e.printStackTrace();
			RequestDispatcher redirecionar = request.getRequestDispatcher("erro.jsp");
			request.setAttribute("msg", e.getMessage());
			redirecionar.forward(request, response);
		}
		
	}

}
