package com.eoi.servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conexion {

    private static conexion instancia;
    private Connection connection;
    private String url = "https://github.com/MiguelCanoGracia/keep-my-pet/blob/master/KeepMyPet.sql";
    private String username = "MiguelCanoGracia";
    private String password = "g61659195";

    private conexion() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Conexion a BD incorrecta : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static conexion getInstance() throws SQLException {
        if (instancia == null) {
            instancia = new conexion();
        } else if (instancia.getConnection().isClosed()) {
            instancia = new conexion();
        }

        return instancia;
    }
}	

