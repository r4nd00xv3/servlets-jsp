package filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@WebFilter(urlPatterns= {"/principal/*"})
public class FilterAutenticacao implements Filter {

   
    public FilterAutenticacao() {
    }

	/*encerra o processo quando o servidor é parado*/
	public void destroy() {
	}

	/*intercepta as requisições e respostas do sistema*/

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		String usuarioLogado = (String) session.getAttribute("usuario");
		String urlParaAutenticar = req.getServletPath();/*url que esta sendo acessada*/
		
		
		/*validar se esta logado senao redirec p pag de login*/
		if (usuarioLogado == null || (usuarioLogado != null && usuarioLogado.isEmpty())&&
				!urlParaAutenticar.contains("/principal/ServletLogin")) { /*nao esta logado*/
			
			RequestDispatcher redireciona = request.getRequestDispatcher("/index.jsp?url=" + urlParaAutenticar);
			request.setAttribute("msg", "Por favor realize o login!");
			redireciona.forward(request, response);
			return;/*para a exec e red p login*/
		}else {
			chain.doFilter(request, response);

		}
		
	}

	/*inicia os processos no servidor*/

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
