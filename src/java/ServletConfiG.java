/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;


/**
 *
 * @author HP
 */
public class ServletConfiG extends HttpServlet {
  public void doGet(HttpServletRequest request,HttpServletResponse response)
  throws IOException,ServletException
  {
      response.setContentType("text/html");
       PrintWriter out=response.getWriter();
      
       ServletConfig config=getServletConfig();
       
       String driver=config.getInitParameter("driver");
       out.print("Driver is: "+driver);
       out.close();
      
      
  }
    

}
