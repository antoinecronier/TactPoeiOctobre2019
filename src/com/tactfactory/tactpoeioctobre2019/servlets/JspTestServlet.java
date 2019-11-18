package com.tactfactory.tactpoeioctobre2019.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tactfactory.tactpoeioctobre2019.entites.User;

/**
 * Servlet implementation class JspTestServlet
 */
@WebServlet("/JspTestServlet")
public class JspTestServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    User user = new User();
    user.setFirstname("jean-michel");
    user.setLastname("el michou");
    user.setIsValidate(true);

    request.setAttribute("THE_USER", user);

    RequestDispatcher rd;
    rd = this.getServletContext().getNamedDispatcher("JspTest");
    rd.forward(request, response);
  }

}
