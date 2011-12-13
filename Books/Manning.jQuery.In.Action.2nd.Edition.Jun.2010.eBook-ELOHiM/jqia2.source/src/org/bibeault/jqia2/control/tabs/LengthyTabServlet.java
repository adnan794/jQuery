package org.bibeault.jqia2.control.tabs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LengthyTabServlet extends HttpServlet {

  private static final int ITERATIONS = 10;
  private static final long DELAY = 1000;

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    for (int n = 0; n < ITERATIONS; n++) {
      try {
        Thread.sleep(DELAY);
      }
      catch (InterruptedException e) {
        //eat exception
      }
    }
    response.getWriter().write(
      new StringBuilder()
        .append("<img src='")
        .append(request.getContextPath())
        .append("/chapter11/tabs/thanks.jpg'/>")
        .toString());
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
  }

}
