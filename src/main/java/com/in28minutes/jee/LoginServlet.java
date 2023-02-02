package com.in28minutes.jee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest httpServletRequest,
                         HttpServletResponse httpServletResponse) throws ServletException, IOException {

        httpServletRequest.setAttribute("name", httpServletRequest.getParameter("name"));
        httpServletRequest.setAttribute("password", httpServletRequest.getParameter("password"));

        httpServletRequest.getRequestDispatcher("/WEB_INF/views/login.jsp").forward(httpServletRequest,
                httpServletResponse);
    }

    protected void doPost(HttpServletRequest httpServletRequest,
                          HttpServletResponse httpServletResponse) throws ServletException, IOException {

        UserValidation service = new UserValidation();
        String name = httpServletRequest.getParameter("name");
        String password = httpServletRequest.getParameter("password");

        boolean isUserValid = service.isUserValid(name, password);
        if(isUserValid){
            httpServletRequest.setAttribute("name", name);
            httpServletRequest.setAttribute("password", password);

            httpServletRequest.getRequestDispatcher("/WEB_INF/views/welcome.jsp").forward(httpServletRequest,
                    httpServletResponse);
        }
        else{
            httpServletRequest.setAttribute("errorMessage", "Invalid credentials!!!");
            httpServletRequest.getRequestDispatcher("/WEB_INF/views/login.jsp").forward(httpServletRequest,
                    httpServletResponse);
        }

    }
}