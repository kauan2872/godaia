import classes.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//oi
@WebServlet(urlPatterns = ("/oi"))
public class Index extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Pessoa pessoa = new Pessoa();
		String nome = req.getParameter("nome");
		
		pessoa.setNome(nome);
		
		
		req.setAttribute("nome", pessoa.getNome());
		RequestDispatcher rd = req.getRequestDispatcher("/empresa.jsp");
		rd.forward(req, resp);
		
	
		
		
	
	}

}
