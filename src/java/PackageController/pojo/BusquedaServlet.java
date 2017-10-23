/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageController.pojo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ThinkPad X240
 */
 @WebServlet("/busqueda.jsp")
    public class BusquedaServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        //realizas la búsqueda aquí...
        List<visualizacion> resultados = new ArrayList<>();
                
                request.setAttribute("resultados", resultados);
        //realizamos un forward a la página JSP donde mostraremos los resultados
        request.getRequestDispatcher("/busqueda.jsp").forward(request, response);
    }
    
}
