
	package com.eoi.modelo;
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
import java.sql.Statement;

import com.eoi.servicios.conexion;
	public class UsuarioDAO {
		
		Connection con;
		PreparedStatement pst;
		
		
		//seleccionamos todos los usuarios
		public void seleccionarUsuarios(Usuarios u) throws SQLException {
			Connection con = conexion.getInstance().getConnection();
			String sql="SELECT * FROM usuario";
			Statement st= con.createStatement();
			ResultSet rs= st.executeQuery(sql);
		}
		//borramos un usuario
		public void BorraUsuario(Usuarios u) throws SQLException {
			String sql = "DELETE * FROM Usuarios WHERE usuId=?";
			con= conexion.getInstance().getConnection();
			pst=con.prepareStatement(sql);
			pst.setInt(1, u.getUsuId());
			pst.executeUpdate();
			pst.close();
			con.close();
		}
		//vamos a modificar un usuario
		public void ModificaUsuario (Usuarios u) throws SQLException {
			String sql = "UPDATE Usuarios SET UsuNombre=?,UsuApellido=?,UsuNacimiento=?,UsuAlta=?,UsuMail=?,UsuPass=?,UsuRol=?,UsuCiudad=?,UsuDNI=? WHERE UsuId=?";
			con= conexion.getInstance().getConnection();
			pst=con.prepareStatement(sql);
			pst.setString(1,u.getUsuNombre());
			pst.setString(2,u.getUsuApellido());
			pst.setInt(3,u.getUsuNacimiento());
			pst.setInt(4,u.getUsuAlta());
			pst.setString(5,u.getUsuMail());
			pst.setString(6,u.getUsuPass());
			pst.setString(7,u.getUsuRol());
			pst.setString(8,u.getUsuCiudad());
			pst.setString(9,u.getUsuDNI());
			
			pst.executeUpdate();
			pst.close();
			con.close();
		}
		
		}

