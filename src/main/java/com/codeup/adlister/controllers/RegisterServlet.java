package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        System.out.println(username);
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = DaoFactory.getUsersDao().findByUsername(username);



        boolean inputHasErrors = username.isEmpty()
                ||user != null
                || email.isEmpty()
                || password.isEmpty();

        if (inputHasErrors) {
            response.sendRedirect("/register");
            return;


        }

      //creates new user
        User userNew = new User(username, email, password);
        DaoFactory.getUsersDao().insert(userNew);
        response.sendRedirect("/login");
    }
}