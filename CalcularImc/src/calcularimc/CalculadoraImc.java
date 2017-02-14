package calcularimc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/** Servlet implementation class CalculadoraImc */
	@WebServlet("/CalculadoraImc")
public class CalculadoraImc extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    /** @see HttpServlet#HttpServlet() */
    public CalculadoraImc()
    {
        super();   
    }

	/** @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)*/
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String peso = req.getParameter("peso");
		String altura = req.getParameter("altura");
		
		System.out.println ("El peso es: " + peso);
		System.out.println ("La altura es: " + altura);
		
		Double.valueOf ("peso");
		Double.valueOf ("altura");
		
		
	
		//getWriter().append("Served at: ").append(request.getContextPath());
	}

	/** * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response) */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
	
		doGet(req, res);
	}
}
