package org.bibeault.jqia2.control.progressbar;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LengthyOperationServlet extends HttpServlet {

  private static final int ITERATIONS = 100;
  private static final long DELAY = 125;

  static final String VAR_COUNT = "count";

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    for (int n = 0; n < ITERATIONS; n++) {
      try {
//        System.out.println("tick " + request.getSession().getAttribute(VAR_COUNT));
        Thread.sleep(DELAY);
        request.getSession().setAttribute(VAR_COUNT,n);
      }
      catch (InterruptedException e) {
        //eat exception
      }
    }
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
  }

}
