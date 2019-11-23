package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            // Example starter JavaScript for disabling form submissions if there are invalid fields\r\n");
      out.write("            (function () {\r\n");
      out.write("                'use strict'\r\n");
      out.write("\r\n");
      out.write("                window.addEventListener('load', function () {\r\n");
      out.write("                    // Fetch all the forms we want to apply custom Bootstrap validation styles to\r\n");
      out.write("                    var forms = document.getElementsByClassName('needs-validation')\r\n");
      out.write("\r\n");
      out.write("                    // Loop over them and prevent submission\r\n");
      out.write("                    Array.prototype.filter.call(forms, function (form) {\r\n");
      out.write("                        form.addEventListener('submit', function (event) {\r\n");
      out.write("                            if (form.checkValidity() === false) {\r\n");
      out.write("                                event.preventDefault()\r\n");
      out.write("                                event.stopPropagation()\r\n");
      out.write("                            }\r\n");
      out.write("                            form.classList.add('was-validated')\r\n");
      out.write("                        }, false)\r\n");
      out.write("                    })\r\n");
      out.write("                }, false)\r\n");
      out.write("            }())\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        <style>\r\n");
      out.write("              html,\r\n");
      out.write("            body {\r\n");
      out.write("                height: 100%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            body {\r\n");
      out.write("                display: -ms-flexbox;\r\n");
      out.write("                display: flex;\r\n");
      out.write("                -ms-flex-align: center;\r\n");
      out.write("                align-items: center;\r\n");
      out.write("                padding-top: 40px;\r\n");
      out.write("                padding-bottom: 40px;\r\n");
      out.write("                background-color: #f5f5f5;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .form-signup {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                max-width: 420px;\r\n");
      out.write("                padding: 15px;\r\n");
      out.write("                margin: auto;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .form-label-group {\r\n");
      out.write("                position: relative;\r\n");
      out.write("                margin-bottom: 1rem;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .form-label-group > input,\r\n");
      out.write("            .form-label-group > label {\r\n");
      out.write("                height: 3.125rem;\r\n");
      out.write("                padding: .75rem;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .form-label-group > label {\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                top: 0;\r\n");
      out.write("                left: 0;\r\n");
      out.write("                display: block;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                margin-bottom: 0; /* Override default `<label>` margin */\r\n");
      out.write("                line-height: 1.5;\r\n");
      out.write("                color: #495057;\r\n");
      out.write("                pointer-events: none;\r\n");
      out.write("                cursor: text; /* Match the input under the label */\r\n");
      out.write("                border: 1px solid transparent;\r\n");
      out.write("                border-radius: .25rem;\r\n");
      out.write("                transition: all .1s ease-in-out;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .form-label-group input::-webkit-input-placeholder {\r\n");
      out.write("                color: transparent;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .form-label-group input:-ms-input-placeholder {\r\n");
      out.write("                color: transparent;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .form-label-group input::-ms-input-placeholder {\r\n");
      out.write("                color: transparent;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .form-label-group input::-moz-placeholder {\r\n");
      out.write("                color: transparent;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .form-label-group input::placeholder {\r\n");
      out.write("                color: transparent;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .form-label-group input:not(:placeholder-shown) {\r\n");
      out.write("                padding-top: 1.25rem;\r\n");
      out.write("                padding-bottom: .25rem;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .form-label-group input:not(:placeholder-shown) ~ label {\r\n");
      out.write("                padding-top: .25rem;\r\n");
      out.write("                padding-bottom: .25rem;\r\n");
      out.write("                font-size: 12px;\r\n");
      out.write("                color: #777;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            /* Fallback for IE\r\n");
      out.write("            -------------------------------------------------- */\r\n");
      out.write("            @media all and (-ms-high-contrast: none), (-ms-high-contrast: active) {\r\n");
      out.write("                .form-label-group > label {\r\n");
      out.write("                    display: none;\r\n");
      out.write("                }\r\n");
      out.write("                .form-label-group input:-ms-input-placeholder {\r\n");
      out.write("                    color: #777;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .bd-placeholder-img {\r\n");
      out.write("                font-size: 1.125rem;\r\n");
      out.write("                text-anchor: middle;\r\n");
      out.write("                -webkit-user-select: none;\r\n");
      out.write("                -moz-user-select: none;\r\n");
      out.write("                -ms-user-select: none;\r\n");
      out.write("                user-select: none;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            @media (min-width: 768px) {\r\n");
      out.write("                .bd-placeholder-img-lg {\r\n");
      out.write("                    font-size: 3.5rem;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        <title>Quiz - Signup</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Image and text -->\r\n");
      out.write("        <nav class=\"navbar fixed-top navbar-light bg-light\">\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"Webquiz\">\r\n");
      out.write("                <img src=\"https://getbootstrap.com/docs/4.3/assets/brand/bootstrap-solid.svg\" width=\"30\" height=\"30\" class=\"d-inline-block align-top\" alt=\"\">\r\n");
      out.write("                Webquiz\r\n");
      out.write("            </a>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <form class=\"form-signup\" action=\"Signup\" method=\"post\" oninput=\"fullname.value = firstname.value +' ' + lastname.value\">\r\n");
      out.write("            <div class=\"text-center mb-4\">\r\n");
      out.write("                <img class=\"mb-4\" src=\"https://getbootstrap.com/docs/4.3/assets/brand/bootstrap-solid.svg\" alt=\"\" width=\"72\" height=\"72\">\r\n");
      out.write("                <h1 class=\"h3 mb-3 font-weight-normal\">Sign up your account</h1>\r\n");
      out.write("                <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("            </div>\r\n");
      out.write("             <div class=\"form-label-group\">\r\n");
      out.write("                 <input type=\"text\" id=\"inputStudentID\" name=\"studentid\" class=\"form-control\" placeholder=\"Your Student ID : 10xx\" required autofocus>\r\n");
      out.write("                <label for=\"inputStudentID\">StudentID</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-label-group\">\r\n");
      out.write("                 <input type=\"text\" id=\"inputFirstname\" name=\"firstname\" class=\"form-control\" placeholder=\"Firstname\" required autofocus>\r\n");
      out.write("                <label for=\"inputFullname\">Firstname</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-label-group\">\r\n");
      out.write("                 <input type=\"text\" id=\"inputFirstname\" name=\"lastname\" class=\"form-control\" placeholder=\"Lastname\" required autofocus>\r\n");
      out.write("                <label for=\"inputFullname\">Lastname</label>\r\n");
      out.write("            </div>\r\n");
      out.write("             <div class=\"form-label-group\">\r\n");
      out.write("                 <input type=\"text\" id=\"inputFullname\" name=\"fullname\" class=\"form-control\" placeholder=\"Fullname\" required autofocus>\r\n");
      out.write("                <label for=\"inputFullname\">Fullname</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-label-group\">\r\n");
      out.write("                <input type=\"text\" id=\"inputUsername\" name=\"username\" class=\"form-control\" placeholder=\"Username\" required autofocus>\r\n");
      out.write("                <label for=\"inputUsername\">Username</label>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-label-group\">\r\n");
      out.write("                <input type=\"password\" id=\"inputPassword\" name=\"password\" class=\"form-control\" placeholder=\"Password\" required>\r\n");
      out.write("                <label for=\"inputPassword\">Password</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Sign up</button>\r\n");
      out.write("         </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
