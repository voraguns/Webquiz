package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class InsertQuiz_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            // Example starter JavaScript for disabling form submissions if there are invalid fields\n");
      out.write("            (function () {\n");
      out.write("                'use strict'\n");
      out.write("\n");
      out.write("                window.addEventListener('load', function () {\n");
      out.write("                    // Fetch all the forms we want to apply custom Bootstrap validation styles to\n");
      out.write("                    var forms = document.getElementsByClassName('needs-validation')\n");
      out.write("\n");
      out.write("                    // Loop over them and prevent submission\n");
      out.write("                    Array.prototype.filter.call(forms, function (form) {\n");
      out.write("                        form.addEventListener('submit', function (event) {\n");
      out.write("                            if (form.checkValidity() === false) {\n");
      out.write("                                event.preventDefault()\n");
      out.write("                                event.stopPropagation()\n");
      out.write("                            }\n");
      out.write("                            form.classList.add('was-validated')\n");
      out.write("                        }, false)\n");
      out.write("                    })\n");
      out.write("                }, false)\n");
      out.write("            }())\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("              html,\n");
      out.write("            body {\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                display: -ms-flexbox;\n");
      out.write("                display: flex;\n");
      out.write("                -ms-flex-align: center;\n");
      out.write("                align-items: center;\n");
      out.write("                padding-top: 40px;\n");
      out.write("                padding-bottom: 40px;\n");
      out.write("                background-color: #f5f5f5;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-signup {\n");
      out.write("                width: 100%;\n");
      out.write("                max-width: 420px;\n");
      out.write("                padding: 15px;\n");
      out.write("                margin: auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-label-group {\n");
      out.write("                position: relative;\n");
      out.write("                margin-bottom: 1rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-label-group > input,\n");
      out.write("            .form-label-group > label {\n");
      out.write("                height: 3.125rem;\n");
      out.write("                padding: .75rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-label-group > label {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0;\n");
      out.write("                left: 0;\n");
      out.write("                display: block;\n");
      out.write("                width: 100%;\n");
      out.write("                margin-bottom: 0; /* Override default `<label>` margin */\n");
      out.write("                line-height: 1.5;\n");
      out.write("                color: #495057;\n");
      out.write("                pointer-events: none;\n");
      out.write("                cursor: text; /* Match the input under the label */\n");
      out.write("                border: 1px solid transparent;\n");
      out.write("                border-radius: .25rem;\n");
      out.write("                transition: all .1s ease-in-out;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-label-group input::-webkit-input-placeholder {\n");
      out.write("                color: transparent;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-label-group input:-ms-input-placeholder {\n");
      out.write("                color: transparent;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-label-group input::-ms-input-placeholder {\n");
      out.write("                color: transparent;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-label-group input::-moz-placeholder {\n");
      out.write("                color: transparent;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-label-group input::placeholder {\n");
      out.write("                color: transparent;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-label-group input:not(:placeholder-shown) {\n");
      out.write("                padding-top: 1.25rem;\n");
      out.write("                padding-bottom: .25rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-label-group input:not(:placeholder-shown) ~ label {\n");
      out.write("                padding-top: .25rem;\n");
      out.write("                padding-bottom: .25rem;\n");
      out.write("                font-size: 12px;\n");
      out.write("                color: #777;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Fallback for IE\n");
      out.write("            -------------------------------------------------- */\n");
      out.write("            @media all and (-ms-high-contrast: none), (-ms-high-contrast: active) {\n");
      out.write("                .form-label-group > label {\n");
      out.write("                    display: none;\n");
      out.write("                }\n");
      out.write("                .form-label-group input:-ms-input-placeholder {\n");
      out.write("                    color: #777;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bd-placeholder-img {\n");
      out.write("                font-size: 1.125rem;\n");
      out.write("                text-anchor: middle;\n");
      out.write("                -webkit-user-select: none;\n");
      out.write("                -moz-user-select: none;\n");
      out.write("                -ms-user-select: none;\n");
      out.write("                user-select: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media (min-width: 768px) {\n");
      out.write("                .bd-placeholder-img-lg {\n");
      out.write("                    font-size: 3.5rem;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>Insert Quiz</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("    <nav class=\"navbar fixed-top navbar-light bg-light\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"Webquiz\">\n");
      out.write("                <img src=\"https://getbootstrap.com/docs/4.3/assets/brand/bootstrap-solid.svg\" width=\"30\" height=\"30\" class=\"d-inline-block align-top\" alt=\"\">\n");
      out.write("                Webquiz\n");
      out.write("            </a>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <form class=\"form-signup\" action=\"Signup\" method=\"post\" oninput=\"fullname.value = firstname.value +' ' + lastname.value\">\n");
      out.write("            <div class=\"text-center mb-4\">\n");
      out.write("                <img class=\"mb-4\" src=\"https://getbootstrap.com/docs/4.3/assets/brand/bootstrap-solid.svg\" alt=\"\" width=\"72\" height=\"72\">\n");
      out.write("                <h1 class=\"h3 mb-3 font-weight-normal\">Insert your quiz</h1>\n");
      out.write("                <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("            </div>\n");
      out.write("             <div class=\"form-label-group\">\n");
      out.write("                 <input type=\"text\" id=\"inputsubjectID\" name=\"subjectID\" class=\"form-control\" required autofocus>\n");
      out.write("                <label for=\"inputsubjectID\">Subject ID : </label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-label-group\">\n");
      out.write("                 <input type=\"text\" id=\"inputquizID\" name=\"quizID\" class=\"form-control\" required autofocus>\n");
      out.write("                <label for=\"inputquizID\">Quiz ID : </label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-label-group\">\n");
      out.write("                 <input type=\"text\" id=\"inputchoice1\" name=\"choice1\" class=\"form-control\" required autofocus>\n");
      out.write("                <label for=\"inputchoice1\">Choice 1 : </label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-label-group\">\n");
      out.write("                 <input type=\"text\" id=\"inputchoice2\" name=\"choice2\" class=\"form-control\" required autofocus>\n");
      out.write("                <label for=\"inputchoice2\">Choice 2 : </label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-label-group\">\n");
      out.write("                 <input type=\"text\" id=\"inputchoice3\" name=\"choice3\" class=\"form-control\" required autofocus>\n");
      out.write("                <label for=\"inputchoice3\">Choice 3 : </label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-label-group\">\n");
      out.write("                 <input type=\"text\" id=\"inputchoice4\" name=\"choice4\" class=\"form-control\" required autofocus>\n");
      out.write("                <label for=\"inputchoice4\">Choice 4 : </label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-label-group\">\n");
      out.write("                 <input type=\"text\" id=\"inputanswer\" name=\"answer\" class=\"form-control\" required autofocus>\n");
      out.write("                <label for=\"inputanswer\">Answer : </label>\n");
      out.write("            </div>\n");
      out.write("            <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Insert</button>\n");
      out.write("         </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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