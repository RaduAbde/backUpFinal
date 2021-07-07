package com.eoi.controlador;

import java.io.IOException;
import java.sql.SQLException;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eoi.modelo.Usuarios;
import com.eoi.modelo.Animales;
import com.eoi.modelo.DAO;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //String opcion = request.getParameter("opcion");
        String UduId = request.getParameter("UsuId");
        DAO usudao = new DAO();

        Usuarios usu = null;
        String destino = "index.jsp";

        /*switch (opcion) {
        case "e":
            destPage = "editardepartamento.jsp";
            try {
                dpto = ddao.getDepartamento(coddepto);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            request.setAttribute("dpto", dpto);

            break;
        case "b":
            try {
                ddao.borrarDpto(coddepto);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            break;
        }
*/
        RequestDispatcher dispatcher = request.getRequestDispatcher(destino);
        dispatcher.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String opcion = request.getParameter("opcion");
        String AnimalNombre = request.getParameter("AnimalNombre");
        String AnimalEdad = request.getParameter("AnimalEdad");
        String AnimalTipo = request.getParameter("AnimalTipo");
        int AnimalId = Integer.parseInt(request.getParameter("AnimalId"));
        String AnimalRaza = request.getParameter("AnimalRaza");
        String AnimalSexo = request.getParameter("AnimalSexo");
        int AnimalAlta = Integer.parseInt(request.getParameter("AnimalAlta"));
        String AnimalPath = request.getParameter("AnimalPath");
        String AnimalCiudad = request.getParameter("AnimalCiudad");
        String AnimalProvincia = request.getParameter("AnimalProvincia");
        String AnimalEstado = request.getParameter("AnimalEstado");

        Animales ani = new Animales(AnimalNombre, AnimalEdad, AnimalTipo, AnimalId, AnimalRaza, AnimalSexo, AnimalAlta, AnimalPath, AnimalCiudad, AnimalProvincia, AnimalEstado);
        DAO UsuDao = new DAO();

        String destino = "index.jsp";

        try {
            if (opcion.equals("e")) {
            }
                UsuDao.ModificarAnimal(ani);
            if (opcion.equals("a")) {
                UsuDao.AltaAnimal(ani);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(destino);
        dispatcher.forward(request, response);
    }

}