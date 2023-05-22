package com.hito.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hito.model.Cliente;


public class ClienteDAO {
	
	private String endpoint="jdbc:mysql://localhost:3306/hito?useSSL=false";
	private String user="root";
	private String pass="";
	
	public Connection conectar() {
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(endpoint, user, pass);
			System.out.println("conectando a la base de datos");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Conexion establecida");
		return connection;	
	}//cierra método conectar
	//insertar
	public void insertCliente(Cliente u) {
        // try-with-resource statement will auto close the connection.
      
        	Connection connection = conectar();
        	PreparedStatement ps;
			try {
				ps = connection.prepareStatement("INSERT INTO clienteh (nombre, plan, peso, categoria, horas, competicion, precio) VALUES (?, ?, ?, ?, ?, ?, ?);");
	            ps.setString(1, u.getNombre());
	            ps.setString(2, u.getPlan());
	            ps.setString(3, u.getPeso());
	            ps.setString(4, u.getCategoria());
	            ps.setInt(5, u.getHoras());
	            ps.setInt(6, u.getCompeticion());
	            ps.setFloat(7, u.getPrecio());
	            ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
            
    }//cierra insertar
	//resto de métodos crud
}//cierra DAO



