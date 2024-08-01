/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.25
 * Generated at: 2024-07-29 07:31:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.professor;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class updateSyllabus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
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

  public boolean getErrorOnELNotFound() {
    return false;
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>강의계획서</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("@import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap');\r\n");
      out.write("\r\n");
      out.write("* {\r\n");
      out.write("	margin: 0 auto;\r\n");
      out.write("	padding: 0 auto;\r\n");
      out.write("	font-family: 'Noto Sans KR', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header--top {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 40px;\r\n");
      out.write("	background-color: #031734;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("section {\r\n");
      out.write("	padding: 10px 100px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=\"text\"]{\r\n");
      out.write("	font-size: 16px;\r\n");
      out.write("	padding: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("textarea {\r\n");
      out.write("	font-size: 16px;\r\n");
      out.write("	padding: 5px;\r\n");
      out.write("	resize: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".submit--button {\r\n");
      out.write("	margin-top: 20px;\r\n");
      out.write("	margin-left: 200px;\r\n");
      out.write("	padding: 10px 15px;\r\n");
      out.write("	border: none;\r\n");
      out.write("	border-radius: 10px;\r\n");
      out.write("	color: white;\r\n");
      out.write("	background-color: #142845;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("		<div class=\"header--top\"></div>\r\n");
      out.write("	</header>\r\n");
      out.write("	<c:set var=\"syllabus\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${syllabus}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("	<section >\r\n");
      out.write("		<h2>강의 계획서 수정</h2>\r\n");
      out.write("		<br> \r\n");
      out.write("		<form action=\"/professor/update?subjectId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${syllabus.subjectId}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" method=\"post\">\r\n");
      out.write("			<input type=\"hidden\" name=\"_method\" value=\"put\"/>\r\n");
      out.write("			<label>강의 개요</label> <br> \r\n");
      out.write("			<textarea rows=\"5\" cols=\"50\" name=\"overview\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${syllabus.overview}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("			<br> <label>수업 목표</label> <br> \r\n");
      out.write("			<textarea rows=\"5\" cols=\"50\" name=\"objective\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${syllabus.objective}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("			<br> <label>교재</label> <br> <input type=\"text\" name=\"textbook\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${syllabus.textbook}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> <br>  \r\n");
      out.write("			<label>주별 계획</label> <br> \r\n");
      out.write("			<textarea rows=\"10\" cols=\"50\" name=\"program\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${syllabus.program}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("			<br>\r\n");
      out.write("			<button type=\"submit\" class=\"submit--button\" >제출</button>\r\n");
      out.write("		</form>\r\n");
      out.write("	</section>\r\n");
      out.write("	</c:set>\r\n");
      out.write("</body>\r\n");
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