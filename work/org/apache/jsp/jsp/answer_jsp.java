/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.15
 * Generated at: 2017-07-25 07:52:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpSession;
import beans.Question;
import java.util.ArrayList;

public final class answer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("javax.servlet.http.HttpSession");
    _jspx_imports_classes.add("beans.Question");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

Question question = (Question)request.getAttribute("question");

      out.write('\n');

ArrayList list =  (ArrayList)request.getAttribute("question-list");

      out.write("\n");
      out.write("\n");
      out.write("<HTML>\n");
      out.write("<head>\n");
      out.write("<title>問題</title>\n");
      out.write("<style type =\"text/css\">\n");
      out.write("\n");
      out.write("p{\n");
      out.write("margin-top:2em;\n");
      out.write("margin-right:5em;\n");
      out.write("margin-bottom:2em;\n");
      out.write("margin-left:5em;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"#ccffff\">\n");
      out.write("\n");
      out.write("<SCRIPT language=\"JavaScript\">\n");
      out.write("</SCRIPT>\n");
      out.write("<div align=\"center\">\n");
      out.write("<font size=\"7\"  >WebDrillシステム</font>\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<div align=\"left\">\n");
      out.write("\n");
      out.write("<P>\n");
      out.write("<form method=\"post\" action=\"./AnswerRegistServlet\"><br></form>\n");
      out.write("<font size=\"+2\">");
      out.print(question.getTitle());
      out.write("</font><br>\n");
      out.write("<p><br>\n");
      out.write("<font size = \"+2\">");
      out.print(question.getTeacher_name());
      out.write("</font></p>\n");
      out.write("<p>回答者指名<br>\n");
      out.write("<input type=\"string\" name=\"student_name\" size=\"30\" ></p>\n");
      out.write("<p>回答者ID<br>\n");
      out.write("<input type=\"string\" name=\"user_id\" size=\"30\" maxlength=\"8\"></p>\n");
      out.write("<br>\n");
      out.write("<font size=\"+2\">");
      out.print(question.getContent());
      out.write("</font><br>\n");
      out.write("<br>\n");
      out.write("<p>回答欄<br>\n");
      out.write("<textarea name=\"student_answer\" cols=\"20\" rows=\"10\"maxlength=\"100\"></textarea ></p>\n");
      out.write("<p>感想欄<br>\n");
      out.write("<textarea name=\"impression\" cols=\"20\" rows=\"10\"maxlength=\"200\"></textarea ></p>\n");
      out.write("\n");
      out.write("\n");
      out.write("<FORM method=\"POST\" action = \"./AnswerRegistServlet\">\n");
      out.write("<input type=\"submit\" value=\"送信\">\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<FORM method=\"POST\" action = \"./GetQuestionServlet\">\n");
      out.write("<input type=\"submit\" value=\"問題選択へ戻る\">\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</BODY>\n");
      out.write("</HTML>");
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