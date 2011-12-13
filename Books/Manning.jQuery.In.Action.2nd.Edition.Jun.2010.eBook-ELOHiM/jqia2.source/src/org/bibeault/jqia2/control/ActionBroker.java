package org.bibeault.jqia2.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ActionBroker extends HttpServlet {
  private static final Log log = LogFactory.getLog(ActionBroker.class);

  private static final String ACTION_PATH = "/chapter8/bootcloset/actions";

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request,response);
  }

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    boolean debug = log.isDebugEnabled();
    if (debug) log.debug("brokering...");
    String pathInfo = request.getPathInfo();
    if (debug) log.debug("  path info: " + pathInfo);
    String path = new StringBuilder()
        .append(ACTION_PATH)
        .append(pathInfo)
        .append(".jsp")
        .toString();
    if (debug) log.debug("  include path: " + path);
    request.getRequestDispatcher(path).include(request, response);
    if (debug) log.debug("brokered.");
  }

}
