/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import javax.servlet.RequestDispatcher;
import com.example.model.*;
import static java.lang.System.out;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 *
 * @author PC
 */
public class BeerSelect extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BeerSelect</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BeerSelect at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BeerSelect</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BeerSelect at " + request.getParameter("background") + "</h1>");
             out.println("<p style=\"background-color:"+ request.getAttribute("background") +";\"> " + request.getAttribute("background") + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String c = request.getParameter("color");
        BeerExpert be = new BeerExpert();
        List result = be.getBrands(c);
        String background = request.getParameter("background");
        
        out.println(getServletConfig().getInitParameter("email"));
        
        HttpSession session = request.getSession();
        Cookie visitascookie;
        if(!session.isNew()){
            Cookie[] cookies = request.getCookies();
            List alcookies = Arrays.asList(cookies);
            visitascookie = new Cookie("visitas", "10");
            for(Cookie cook : cookies){
                if(cook.getName().equals("visitas")){
                    visitascookie = cook;
                }
            }
            Integer visitascount = Integer.parseInt( visitascookie.getValue()) + 1;
            visitascookie.setValue(visitascount.toString());
        }else{
            visitascookie = new Cookie("visitas", "10");
        }
        
        response.addCookie(visitascookie);
        
        request.setAttribute("styles", result);
        request.setAttribute("background", background);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
