package com.tactfactory.tactpoeioctobre2019.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestIllegalState
 */
//@WebServlet("/TestIllegalState")
public class TestIllegalState extends HttpServlet {
  private static final long serialVersionUID = 1L;
  private boolean didCrash;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public TestIllegalState() {
    super();
  }



  @Override
  public void init() throws ServletException {

    didCrash = Boolean.parseBoolean(this.getInitParameter("DID_CRASH"));
  }



  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    if (didCrash) {
      PrintWriter out = response.getWriter();
      out.println("Served at: ");
      out.println(request.getContextPath());

      for (int i = 0; i < 10; i++) {
        out.println("coucou" + i);
        out.flush();

      }

      response.sendRedirect("/TactPoeiOctobre2019/");

      for (int i = 0; i < 10; i++) {
        out.println("coucou" + i);
        out.flush();

      }

      out.close();
    } else {
      PrintWriter out = response.getWriter();
      out.println("Served at: ");
      out.println(request.getContextPath());

      for (int i = 0; i < 10; i++) {
        out.println("coucou" + i);
        out.flush();

      }

      for (int i = 0; i < 10; i++) {
        out.println("coucou" + i);
        out.flush();

      }

      out.close();
    }

  }

}
