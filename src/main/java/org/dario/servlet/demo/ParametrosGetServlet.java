package org.dario.servlet.demo;
/*
Aplicativo Web para crear un formulario que contenga Nombre de tipo String,Apellido de tipo String,
edad de tipo int, Lenguajes de programacion con un select o desplegrable,Curso de tipo String,
el género debe de ser ocupado en un radiu-botton, debe de tener una descripcion tipo textarea
para llamar a los datos vamos a ocupar el método Dopost
 */

/*
 * *Nombre de los programadores: Dario Verdezoto
 * *Materia: Programacion 2
 * *Fecha: 20/05/2024
 * *Detalle: Aplicacion Web
 * *Version: 2.0
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletParametros")
public class ParametrosGetServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String Nombre = req.getParameter("Nombre");
        String Apellido = req.getParameter("Apellido");
        Integer Edad = Integer.parseInt(req.getParameter("Edad"));
        String Programas = req.getParameter("Programas");
        String Curso = req.getParameter("Curso");
        String Genero = req.getParameter("Genero");
        String Descripcion = req.getParameter("Descripcion");

        //vamos a enviar una respuesta al Cliente
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Formulario</title>");
        // Incluir Bootstrap CSS
        out.print("<link href='https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css' rel='stylesheet'>");
        // Incluir jQuery
        out.print("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js'></script>");
        out.println("</head>");
        out.println("<body>");
        // Añade un contenedor centrado con un margen superior.
        out.println("<div class='container mt-5'>");
        // Utiliza una tarjeta de Bootstrap para agrupar el contenido, proporcionando un borde y un fondo blanco que mejora la legibilidad.
        out.println("<div class='card'>");
        // Añade un encabezado para la tarjeta con un título.
        out.println("<div class='card-header'>");
        //Estilo para el título principal del formulario.
        out.println("<h1 class='card-title'>Formulario</h1>");
        out.println("</div>");
        // Contiene el cuerpo de la tarjeta con el contenido principal(card-body).
        out.println("<div class='card-body'>");
        //Estilo para los subtítulos (las etiquetas de los datos) (card-subtitle).
        //Añade un color gris claro para los valores, haciendo que se destaquen las etiquetas(text-muted).
        out.println("<h2 class='card-subtitle mb-3'>Nombre: <span class='text-muted'>" + Nombre + "</span></h2>");
        out.println("<h2 class='card-subtitle mb-3'>Apellido: <span class='text-muted'>" + Apellido + "</span></h2>");
        out.println("<h2 class='card-subtitle mb-3'>Edad: <span class='text-muted'>" + Edad + "</span></h2>");
        out.println("<h2 class='card-subtitle mb-3'>Lenguaje de Programación: <span class='text-muted'>" + Programas + "</span></h2>");
        out.println("<h2 class='card-subtitle mb-3'>Curso: <span class='text-muted'>" + Curso + "</span></h2>");
        out.println("<h2 class='card-subtitle mb-3'>Género: <span class='text-muted'>" + Genero + "</span></h2>");
        out.println("<h2 class='card-subtitle mb-3'>Descripción: <span class='text-muted'>" + Descripcion + "</span></h2>");
        out.println("</div>");
        out.println("</div>");

        out.println("</body>");
        out.print("</html>");
    }
}
