package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
<<<<<<< HEAD
import com.codeup.adlister.models.User;
=======

import org.mindrot.jbcrypt.BCrypt;
>>>>>>> main


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "controllers.LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = DaoFactory.getUsersDao().findByUsername(username);
<<<<<<< HEAD
=======
        System.out.println(password);
>>>>>>> main
        if (user == null) {
            response.sendRedirect("/login");
            return;
        }

<<<<<<< HEAD
        // TODO: find a record in your database that matches the submitted password
        // TODO: make sure we find a user with that username
        // TODO: check the submitted password against what you have in your database
        boolean validAttempt = password.equals(user.getPassword());

        if (validAttempt) {
            // TODO: store the logged in user object in the session, instead of just the username
=======
        String hashedPassedInDb =user.getPassword();
        System.out.println(hashedPassedInDb);
        boolean validAttempt = BCrypt.checkpw(password,hashedPassedInDb);
        System.out.println(validAttempt);

        if (validAttempt) {
>>>>>>> main
            request.getSession().setAttribute("user", user);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }
}
