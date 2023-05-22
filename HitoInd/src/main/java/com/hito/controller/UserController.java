package com.hito.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hito.dao.ClienteDAO;
import com.hito.model.Cliente;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getServletPath();
		switch (action) {
		case "/add":
			addCliente(request,response);
			break;

		default:
			listCliente(request,response);
			break;
		}//cierra switch
		
	
	}private void listCliente(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	//cierra get
	private void addCliente(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		try {
		String nombre=request.getParameter("nombre");
		String plan=request.getParameter("plan");
		float precio= Float.parseFloat(request.getParameter("precio"));
		String peso=request.getParameter("peso");
		String categoria=request.getParameter("categoria");
		int competicion=Integer.parseInt(request.getParameter("competicion"));
		int horas=Integer.parseInt(request.getParameter("horas"));
		
		if (plan.equals("Beginner") && competicion!=0) {
			response.getWriter().append("Su plan no permite competiciones. Vuelva atrás y seleccione 0 en competiciones");
		}else {
			 precio = 0;
	          switch (plan) {
	              case "Beginner":
	                  precio = 25f;
	                  break;
	              case "Intermediate":
	                  precio = 30f;
	                  break;
	              case "Elite":
	                  precio= 35f;
	                  break;
	              default:
	                  precio = 0f;
	                  break;
	          }// cierra switch case
	          
	          categoria = null;
	          switch (peso) {
	          case "50-55":
	              categoria = "Peso pluma";
	              break;
	            case "60-65":
	              categoria = "Peso ligero";
	              break;
	            case "70-75":
	              categoria = "Peso medio-ligero";
	              break;
	            case "80-85":
	              categoria = "Peso medio";
	              break;
	            case "90-95":
	              categoria = "Peso medio-pesado";
	              break;
	            case "100-105":
	              categoria = "Peso pesado";
	              break;
	            default:
	              categoria = "";
	              break;
	          }// cierra switch case
	          
	         float total= (precio*4)+(competicion*22)+(horas*9.95f);
	                 
	         response.getWriter().append("<table style='border-collapse: collapse; margin: 0 auto; text-align: center; background-color: #f2f2f2; padding: 10px;'>");
	         response.getWriter().append("<tr><th style='background-color: #333; color: #fff; padding: 10px;'>Nombre</th><td style='background-color: #fff; color: #333; padding: 10px;'>" + nombre + "</td></tr>");
	         response.getWriter().append("<tr><th style='background-color: #333; color: #fff; padding: 10px;'>Eventos</th><td style='background-color: #fff; color: #333; padding: 10px;'>" + competicion + "</td></tr>");
	         response.getWriter().append("<tr><th style='background-color: #333; color: #fff; padding: 10px;'>Categoría</th><td style='background-color: #fff; color: #333; padding: 10px;'>" + categoria + "</td></tr>");
	         response.getWriter().append("<tr><th style='background-color: #333; color: #fff; padding: 10px;'>Precio</th><td style='background-color: #fff; color: #333; padding: 10px;'>" + total + "</td></tr>");
	         response.getWriter().append("<tr><th style='background-color: #333; color: #fff; padding: 10px;'>Peso</th><td style='background-color: #fff; color: #333; padding: 10px;'>" + peso + "</td></tr>");
	         response.getWriter().append("</table>");



			
		
						
			
			Cliente cliente=new Cliente(nombre,plan,peso,categoria,horas,competicion,total);
			
			ClienteDAO dao=new ClienteDAO();
			
		
			dao.insertCliente(cliente); 
			
			
		}
		
		 
		
		}
		catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}//cierra catch
	
	}//cierra add cliente

}
