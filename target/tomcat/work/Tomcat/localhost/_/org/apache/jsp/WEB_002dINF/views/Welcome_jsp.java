/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-03-02 15:29:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/common/navigation.jspf", Long.valueOf(1582974022479L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jspf", Long.valueOf(1582808753274L));
    _jspx_dependants.put("/WEB-INF/views/common/header.jspf", Long.valueOf(1583162466465L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspringLocale_005fmessage_0026_005fcode_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspringLocale_005fmessage_0026_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspringLocale_005fmessage_0026_005fcode_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!-- import jstl core library -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Todos Application</title>\r\n");
      out.write("<link href=\"webjars/bootstrap/4.4.1/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"margin: 4px; padding: 40px\">");
      out.write('\r');
      out.write('\n');
      out.write("<nav role=\"navigation\" class=\"navbar navbar-default\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"\">\r\n");
      out.write("\t\t<a href=\"http://www.in28minutes.com\" class=\"navbar-brand\">in28Minutes</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"navbar-collapse\">\r\n");
      out.write("\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t<li class=\"active\"><a href=\"/\">Home</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"/list-todos\">Todos</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t<li><a href=\"/logout\">Logout</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t");
      if (_jspx_meth_springLocale_005fmessage_005f0(_jspx_page_context))
        return;
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" <br /> ");
      if (_jspx_meth_springLocale_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("<a\r\n");
      out.write("\t\thref=\"/list-todos\">Click here</a> to start maintaining your todo's.\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<script src=\"webjars/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"webjars/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_springLocale_005fmessage_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  springLocale:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_springLocale_005fmessage_005f0 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspringLocale_005fmessage_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_springLocale_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_springLocale_005fmessage_005f0.setParent(null);
    // /WEB-INF/views/Welcome.jsp(4,1) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_springLocale_005fmessage_005f0.setCode("welcome.message");
    int[] _jspx_push_body_count_springLocale_005fmessage_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_springLocale_005fmessage_005f0 = _jspx_th_springLocale_005fmessage_005f0.doStartTag();
      if (_jspx_th_springLocale_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_springLocale_005fmessage_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_springLocale_005fmessage_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_springLocale_005fmessage_005f0.doFinally();
      _005fjspx_005ftagPool_005fspringLocale_005fmessage_0026_005fcode_005fnobody.reuse(_jspx_th_springLocale_005fmessage_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_springLocale_005fmessage_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  springLocale:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_springLocale_005fmessage_005f1 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspringLocale_005fmessage_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_springLocale_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_springLocale_005fmessage_005f1.setParent(null);
    // /WEB-INF/views/Welcome.jsp(4,68) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_springLocale_005fmessage_005f1.setCode("welcome.authenticated");
    int[] _jspx_push_body_count_springLocale_005fmessage_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_springLocale_005fmessage_005f1 = _jspx_th_springLocale_005fmessage_005f1.doStartTag();
      if (_jspx_th_springLocale_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_springLocale_005fmessage_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_springLocale_005fmessage_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_springLocale_005fmessage_005f1.doFinally();
      _005fjspx_005ftagPool_005fspringLocale_005fmessage_0026_005fcode_005fnobody.reuse(_jspx_th_springLocale_005fmessage_005f1);
    }
    return false;
  }
}
