package teste.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import teste.entity.Livro;

public class CadastroServlet extends HttpServlet {
	 
	public CadastroServlet() {
		System.out.println("CadastroServlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String autor = req.getParameter("autor");
		String tipo = req.getParameter("tipo");
		String nome = req.getParameter("livro");
		Livro livro = new Livro();
		livro.setAutor(autor);
		livro.setTipo(tipo);
		livro.setNome(nome);
	}

}
