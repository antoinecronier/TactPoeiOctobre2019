package com.tactfactory.tactpoeioctobre2019.servlets;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tactfactory.tactpoeioctobre2019.entites.User;

/**
 * Servlet implementation class Tp1Servlet
 */
@WebServlet("/Tp1Servlet")
public class Tp1Servlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Tp1Servlet() {
        super();
    }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    List<User> users = new ArrayList<User>();

    Random rand = new Random();
    int loops = rand.nextInt(2000);

    for (int i = 0; i < loops; i++) {
      User user = new User();
      user.setFirstname("fName"+i);
      user.setLastname("lName"+i);
      user.setId(rand.nextLong());
      user.setMoney(rand.nextFloat());
      user.setIsValidate(rand.nextInt()%2==0);
      user.setdOb(LocalDateTime.now());
      users.add(user);
    }

    request.setAttribute("users", users);

    RequestDispatcher rd;
    rd = this.getServletContext().getNamedDispatcher("Tp1Jsp");
    rd.forward(request, response);
  }

}
