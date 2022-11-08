package it.prova.gestionebigliettiweb.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.math.NumberUtils;

import it.prova.gestionebigliettiweb.model.utente.Utente;

@WebServlet("/ErrorUserServlet")
public class ErrorUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ErrorUserServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		Utente utenteInSession = (Utente)httpRequest.getSession().getAttribute("userInfo");
		//intanto verifico se utente in sessione
		if (utenteInSession == null) {
			httpResponse.sendRedirect(httpRequest.getContextPath());
			return;
		}
		
		if( !utenteInSession.isAdmin()) {
			httpRequest.setAttribute("errorMessage", "Non si è autorizzati alla navigazione richiesta");
			httpRequest.getRequestDispatcher("/index.jsp").forward(httpRequest, httpResponse);
			return;
		}else {
			request.getRequestDispatcher("/ListBigliettiServlet").forward(request, response);
		}
		
	}

	
}
