/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.16
 * Generated at: 2022-03-07 17:51:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import com.project.ConnectionProvider;
import java.sql.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1646646205829L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1646675452297L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.project.ConnectionProvider");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/home-style.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<script src='https://kit.fontawesome.com/a076d05399.js'></script>\n");
      out.write("</head>\n");
      out.write("    <!--Header-->\n");
      out.write("    <br>\n");
      out.write("    <div class=\"topnav sticky\">\n");
String email=session.getAttribute("email").toString(); 
      out.write("\n");
      out.write("<center><h2>Style-wear</h2></center>\n");
      out.write("<h2><a href=\"\"> ");
      out.print(email );
      out.write("<i class='fas fa-user-alt'></i></a></h2>\n");
      out.write("<a href=\"home.jsp\">Home<i class=\"fa fa-institution\"></i></a>\n");
      out.write("<a href=\"myCart.jsp\">My Cart<i class='fas fa-cart-arrow-down'></i></a>\n");
      out.write("<a href=\"myOrders.jsp\">My Orders  <i class='fab fa-elementor'></i></a>\n");
      out.write("<a href=\"changeDetails.jsp\">Change Details <i class=\"fa fa-edit\"></i></a>\n");
      out.write("<a href=\"messageUs.jsp\">Message Us <i class='fas fa-comment-alt'></i></a>\n");
      out.write("<a href=\"about.jsp\">About <i class=\"fa fa-address-book\"></i></a>\n");
      out.write("<a href=\"logout.jsp\">Logout <i class='fas fa-share-square'></i></a>\n");
      out.write("<div class=\"search-container\">\n");
      out.write("<form action=\"searchHome.jsp\" method=\"post\">\n");
      out.write("<input type=\"text\" name=\"search\" placeholder=\"Search\">\n");
      out.write("<button type=\"submit\"><i class=\"fa fa-search\"></i></button>             \n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<!--table-->\n");
      out.write('\n');
      out.write(" <div class=\"footer\">\n");
      out.write("          <p>All Right Reserved @ Javeriya 2022</p>\n");
      out.write("      </div>");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Style-wear</title>\n");
      out.write("<style>\n");
      out.write("h3\n");
      out.write("{\n");
      out.write("	color: black;\n");
      out.write("	text-align: center;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div style=\"color: grey; text-align: center; font-size: 30px;\">Home <i class=\"fa fa-institution\"></i></div>\n");

String msg=request.getParameter("msg");
if("added".equals(msg))
{

      out.write("\n");
      out.write("<h3 class=\"alert\">Product added successfully!</h3>\n");

}

      out.write('\n');
      out.write('\n');

if("exist".equals(msg))
{

      out.write("\n");
      out.write("<h3 class=\"alert\">Product already exist in you cart! Quantity  increased!</h3>\n");

}

      out.write('\n');
      out.write('\n');

if("invalid".equals(msg))
{

      out.write("\n");
      out.write("<h3 class=\"alert\">Password change successfully!</h3>\n");

}

      out.write("\n");
      out.write("<table>\n");
      out.write("<thead>\n");
      out.write("<tr>\n");
      out.write(" <th scope=\"col\">ID</th>\n");
      out.write(" <th scope=\"col\">Name</th>\n");
      out.write(" <th scope=\"col\">Category</th>\n");
      out.write("<th scope=\"col\"><i class=\"fa fa-inr\"></i> Price</th>\n");
      out.write("<th scope=\"col\">Add to cart <i class='fas fa-cart-plus'></i></th>\n");
      out.write(" </tr>\n");
      out.write("</thead>\n");
      out.write("<tbody>\n");

try{
	Connection con=ConnectionProvider.getCon();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from products where status='Active'");
	while(rs.next()){

      out.write("\n");
      out.write("<tr>\n");
      out.write(" <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString(2) );
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("<td><i class=\"fa fa-inr\"></i>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("<td><a href=\"addToCartAction.jsp?id=");
      out.print(rs.getString(1));
      out.write("\">Add to cart <i class='fas fa-cart-plus'></i></a></td>\n");
      out.write("</tr>\n");

	}
}
catch(Exception e){
	System.out.println(e);
}

      out.write("\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write(" <br>\n");
      out.write(" <br>\n");
      out.write(" <br>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
