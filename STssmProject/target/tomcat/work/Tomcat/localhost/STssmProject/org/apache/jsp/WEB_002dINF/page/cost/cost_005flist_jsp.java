/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-08-23 00:47:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.page.cost;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cost_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>费用查询</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"res/css/bootstrap.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"res/js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"res/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t//给修改按钮绑定事件\r\n");
      out.write("\t\t$(\"#update\").click(function() {\r\n");
      out.write("\t\t\tvar roleids = $(\"input[id=ids]:checked\");\r\n");
      out.write("\t\t\tif (roleids.length == 1) {\r\n");
      out.write("\t\t\t\t//提交表单\r\n");
      out.write("\t\t\t\tvar f1 = $(\"#f1\");\r\n");
      out.write("\t\t\t\tf1.attr(\"action\", \"cost/loadupdate.do\");\r\n");
      out.write("\t\t\t\tf1.submit();\r\n");
      out.write("\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\talert(\"必须选自一个（只能有一个）进行修改\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t//给删除按钮绑定事件\r\n");
      out.write("\t\t$(\"#delete\").click(function() {\r\n");
      out.write("\t\t\tif (confirm(\"您确定要删除费用吗？\")) {\r\n");
      out.write("\t\t\t\t//提交表单\r\n");
      out.write("\t\t\t\tvar f1 = $(\"#f1\");\r\n");
      out.write("\t\t\t\tf1.attr(\"action\", \"cost/delete.do\");\r\n");
      out.write("\t\t\t\tf1.submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t//checkboxfun 实现全选货全不选\r\n");
      out.write("\tfunction checkboxfun(v) {\r\n");
      out.write("\t\t//alert(v.checked);\r\n");
      out.write("\t\tvar roleids = $(\"input[id=ids]\");\r\n");
      out.write("\t\t//遍历所有的checkbox\r\n");
      out.write("\t\troleids.each(function(i) {\r\n");
      out.write("\t\t\t//设置checked的值\r\n");
      out.write("\t\t\tthis.checked = v.checked;\r\n");
      out.write("\r\n");
      out.write("\t\t\t//\t$(this).attr(\"checked\",v.checked);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div style=\"padding: 0px; margin: 0px;\">\r\n");
      out.write("\t\t<ul class=\"breadcrumb\" style=\"margin: 0px; padding-left: 20px;\">\r\n");
      out.write("\t\t\t<li>系统管理</li>\r\n");
      out.write("\t\t\t<li>费用管理</li>\r\n");
      out.write("\t\t\t<li>查询费用</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<form action=\"cost/find.do\" method=\"post\" id=\"f1\" class=\"form-inline\">\r\n");
      out.write("\t\t<div class=\"row alert alert-info\" style=\"margin: 0px; padding: 5px;\">\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label>费用名称</label> <input type=\"text\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\tname=\"costName\" placeholder=\"请输入费用名称\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"查询费用\" class=\"btn btn-success\" /> <a\r\n");
      out.write("\t\t\t\thref=\"cost/loadadd.do\" class=\"btn btn-info\">添加费用</a> <input\r\n");
      out.write("\t\t\t\ttype=\"button\" id=\"update\" value=\"修改费用\" class=\"btn btn-primary\" /> <input\r\n");
      out.write("\t\t\t\ttype=\"button\" id=\"delete\" value=\"删除费用\" class=\"btn btn-danger\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"row\" style=\"padding: 15px;\">\r\n");
      out.write("\t\t\t<table class=\"table \">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th><input type=\"checkbox\" onclick=\"checkboxfun(this)\" /></th>\r\n");
      out.write("\t\t\t\t\t<th>费用编号</th>\r\n");
      out.write("\t\t\t\t\t<th>费用名称</th>\r\n");
      out.write("\t\t\t\t\t<th>费用描述</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/page/cost/cost_list.jsp(93,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/page/cost/cost_list.jsp(93,4) '${costs}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${costs}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/page/cost/cost_list.jsp(93,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("cost");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t<input type=\"checkbox\" id=\"ids\" name=\"costId\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cost.costId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cost.costId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cost.costName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cost.costDesc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
