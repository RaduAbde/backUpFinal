package com.eoi.modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.eoi.servicios.conexion;
public class DAO {
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	//crear un animal nuevo en sql
	public void AltaAnimal(Animales a) throws SQLException {
		String sql = "INSERT INTO Animales (AnimalNombre,AnimalTipo,AnimalEdad,AnimalId,AnimalRaza,AnimalSexo) values (?,?,?,?,?,?)";
		con= conexion.getInstance().getConnection();
		pst=con.prepareStatement(sql);
		pst.setString(1,a.getAnimalNombre());
		pst.setString(2,a.getAnimalTipo());
		pst.setString(3,a.getAnimalEdad());
		pst.setInt(4,a.getAnimalId());
		pst.setString(3,a.getAnimalRaza());
		pst.setString(4,a.getAnimalSexo());
		
		pst.executeUpdate();
	}
	//borramos un anuncio
	public void BorraAnimal(Animales a) throws SQLException {
		String sql = "DELETE * FROM Animales WHERE AnimalId=?";
		con= conexion.getInstance().getConnection();
		pst=con.prepareStatement(sql);
		pst.setInt(1, a.getAnimalId());
		pst.executeUpdate();
	}
	//vamos a modificar
	public void ModificarAnimal (Animales a) throws SQLException {
		String sql = "UPDATE Animales SET AnimalNombre=?,AnimalTipo=?,AnimalEdad=?,AnimalRaza=?,AnimalSexo=? WHERE AnimalId=?";
		con= conexion.getInstance().getConnection();
		pst=con.prepareStatement(sql);
		pst.setString(1,a.getAnimalNombre());
		pst.setString(2,a.getAnimalTipo());
		pst.setString(3,a.getAnimalEdad());
		pst.setInt(4,a.getAnimalId());
		pst.setString(3,a.getAnimalRaza());
		pst.setString(4,a.getAnimalSexo());
		
		pst.executeUpdate();
	}
	
	}
