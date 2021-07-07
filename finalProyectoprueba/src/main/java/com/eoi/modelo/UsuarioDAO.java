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
        
        public boolean create(Usuarios u) throws SQLException {
            String insertQuery = "INSERT INTO Usuarios(UsuDNI, UsuNombre, UsuApellido, UsuNacimiento, UsuCiudad, UsuTelf, UsuPass, UsuMail) VALUES(?,?,?,?, ?,?)";
            con = conexion.getInstance().getConnection();
            Connection con = null;
            PreparedStatement pst = null;
            int rows = 0;

            // Creamos la conexion
            try {
                
                pst = con.prepareStatement(insertQuery);
                pst.setString(1, u.getUsuDNI());
                pst.setString(2, u.getUsuNombre());
                pst.setString(3, u.getUsuApellido());
                pst.setInt(4, u.getUsuNacimiento());
                pst.setString(5, u.getUsuCiudad());
                pst.setInt(6, u.getUsuTelf());
                pst.setString(6, u.getUsuMail());
                pst.setString(6, u.getUsuPass());
                
                

                System.out.println("ejecutando la query +" + insertQuery);
                rows = pst.executeUpdate();
                System.out.println("Registros insertados: " + rows);
                pst.close();
                con.close();
                return true;
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return false;
            }
        }
        }

