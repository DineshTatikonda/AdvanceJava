/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.99
 * Generated at: 2024-09-27 05:32:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addemp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    ");
 String status=(String)request.getAttribute("status");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("       <center>\r\n");
      out.write("    <h1><font color=\"#fadfad\">Welcome Employee Management System</font></h1>\r\n");
      out.write("    <h1><a href='addemp.jsp'>Add Employee</a></h1>\r\n");
      out.write("    <h1><a href='viewemp'>View All Employee</a></h1>\r\n");
      out.write("    <h1><a href='searchemp,jsp'>Search Employee</a></h1>\r\n");
      out.write("    <hr>\r\n");
      out.write("    <form action=\"saveuser\">\r\n");
      out.write("        <table border='1'>\r\n");
      out.write("        ");
if(status!=null){ 
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td colspan=2 align='center'>");
      out.print( status );
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        ");
 }
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>Name</td>\r\n");
      out.write("          <td><input type='text' name='name'></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>Email</td>\r\n");
      out.write("          <td><input type='text' name='email'></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>Gender</td>\r\n");
      out.write("          <td>\r\n");
      out.write("          <input type='radio' name='gender' value=\"male\"/>Male\r\n");
      out.write("          <input type='radio' name='gender' value=\"female\"/>Female\r\n");
      out.write("          <input type='radio' name='gender' value=\"other\"/>Other\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>Department</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                      <select name='department'>\r\n");
      out.write("                        <option value =\"HR\">HR</option>\r\n");
      out.write("                        <option value =\"SALES\">SALES</option>\r\n");
      out.write("                        <option value =\"MANAGER\">MANAGER</option> \r\n");
      out.write("                   </select>\r\n");
      out.write("                   </td>   \r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td>Salary</td>\r\n");
      out.write("         <td><input type='text' name='salary'> \r\n");
      out.write("        </tr>\r\n");
      out.write("        <td>Mobile</td>\r\n");
      out.write("         <td><input type='text' name='mobile'> \r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("        <td>Address</td>\r\n");
      out.write("        <td>\r\n");
      out.write("           <textarea rows='10' cols='20'></textarea>\r\n");
      out.write("        </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("             <td colspan='2' align='center'><input type='submit' value='Add Employee'></td>\r\n");
      out.write("        \r\n");
      out.write("        </tr>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        </table>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    </form>\r\n");
      out.write("    \r\n");
      out.write("    </center>\r\n");
      out.write("       \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
