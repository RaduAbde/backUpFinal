package com.eoi.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eoi.modelo.Usuarios;
import com.eoi.servicios.UsuarioServicio;


/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/htmlcharset=UTF-8");
        PrintWriter out = response.getWriter();
        
        boolean resultado = false;
        //Leer los parametros del formulario HTML
        int id = Integer.parseInt(request.getParameter("UsuId"));
        String Nombre = request.getParameter("UsuNombre");
        String Apellido = request.getParameter("UsuApellido");
        int FechaNac = Integer.parseInt(request.getParameter("UsuNacimiento"));
        int Alta = Integer.parseInt(request.getParameter("UsuAlta"));
        String Correo = request.getParameter("UsuMail");
        String Pass = request.getParameter("UsuPass");
        String Rol = request.getParameter("UsuRol");
        String Ciudad = request.getParameter("UsuCiudad");
        String Dni = request.getParameter("UsuDNI");
        int Telf = Integer.parseInt(request.getParameter("Usutelf"));
        
        
        
        //Creamos el objeto usuario con los datos recuperados del formulario
        Usuarios usu = new Usuarios(id, Nombre, Apellido, FechaNac, Alta, Correo, Pass, Rol, Ciudad, Dni, Telf);
        //Creamos un objeto alumnoService
        UsuarioServicio usus = new UsuarioServicio();
        //Invocamos al metodo create del objeto usus pasandole el usuario
        try {
            resultado = usus.create(usu);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(resultado == true) {
            out.print("El usuario se ha insertado correctamente en la base de datos");
        }else {
            out.print("El alta del usuario ha fallado");
        }
        
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellidos: " + Apellido);
        System.out.println("Fecha de Nacimiento: " + FechaNac);
        System.out.println("Alta: " + Alta);
        System.out.println("Correo: " + Correo);
        System.out.println("Contraseña: " + Pass);
        System.out.println("Rol: " + Rol);
        System.out.println("Ciudad: " + Ciudad);
        System.out.println("DNI: " + Dni);
        System.out.println("Telefono: " + Telf);
        
    }

}