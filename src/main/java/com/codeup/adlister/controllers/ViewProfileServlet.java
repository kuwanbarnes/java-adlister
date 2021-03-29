package com.codeup.adlister.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "controllers.ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD:src/main/java/ViewProfileServlet.java
        HttpSession session = request.getSession();
        if(session.getAttribute("user")!= null){
            request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
        }else{
            response.sendRedirect("/login");
        }


=======
        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/login");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
>>>>>>> main:src/main/java/com/codeup/adlister/controllers/ViewProfileServlet.java
    }
}
