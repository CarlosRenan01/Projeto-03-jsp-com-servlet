package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/processar")
public class PessoaController extends HttpServlet {
	private static final long serialVersionUID = 1L; 
       
   
    public PessoaController() {
        super();}
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = (String) request.getParameter("nome"); 
		String idade = (String) request.getParameter("idade");
		String peso = (String) request.getParameter("peso"); 
		String genero = (String) request.getParameter("genero");
		
	System.out.println(nome);	
	System.out.println(idade);	
	System.out.println(peso);	
	System.out.println(genero);	
	
	RequestDispatcher rd = request.getRequestDispatcher("Final.html");
	rd.forward(request, response);
	}
	
}
