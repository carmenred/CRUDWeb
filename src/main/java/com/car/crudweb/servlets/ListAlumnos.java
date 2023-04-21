package com.car.crudweb.servlets;

import java.io.*;
import java.util.List;

import com.car.crudweb.beans.AlumnosBean;
import com.car.crudweb.entities.Alumnos;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "ListAlumnos", value = "/ListAlumnos")
public class ListAlumnos extends HttpServlet {
    private String message;
    @EJB
    private AlumnosBean alumnosBean;

    public void init() {
        message = "Hello World!";
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Alumnos> alumnos = alumnosBean.getAlumnos();
        request.setAttribute("alumnos", alumnos);
        request.getRequestDispatcher("/alumnos.jsp").forward(request, response);
    }

    public void destroy() {
    }
}