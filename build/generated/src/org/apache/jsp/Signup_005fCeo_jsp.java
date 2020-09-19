package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Signup_005fCeo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\n");
      out.write("=========================================================\n");
      out.write("* Material Dashboard Dark Edition - v2.1.0\n");
      out.write("=========================================================\n");
      out.write("\n");
      out.write("* Product Page: https://www.creative-tim.com/product/material-dashboard-dark\n");
      out.write("* Copyright 2019 Creative Tim (http://www.creative-tim.com)\n");
      out.write("\n");
      out.write("* Coded by www.creative-tim.com\n");
      out.write("\n");
      out.write("=========================================================\n");
      out.write("\n");
      out.write("* The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\" />\n");
      out.write("  <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"./assets/img/apple-icon.png\">\n");
      out.write("  <link rel=\"icon\" type=\"image/png\" href=\"./assets/img/favicon.png\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("  <title>\n");
      out.write("    Material Dashboard Dark Edition by Creative Tim\n");
      out.write("  </title>\n");
      out.write("  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />\n");
      out.write("  <!--     Fonts and icons     -->\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons\" />\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\">\n");
      out.write("  <!-- CSS Files -->\n");
      out.write("  <link href=\"./assets/css/material-dashboard.css?v=2.1.0\" rel=\"stylesheet\" />\n");
      out.write("  <!-- CSS Just for demo purpose, don't include it in your project -->\n");
      out.write("  <link href=\"./assets/demo/demo.css\" rel=\"stylesheet\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"dark-edition\">\n");
      out.write("  <div class=\"wrapper \">\n");
      out.write("    <div class=\"sidebar\" data-color=\"purple\" data-background-color=\"black\" data-image=\"./assets/img/sidebar-2.jpg\">\n");
      out.write("      <!--\n");
      out.write("        Tip 1: You can change the color of the sidebar using: data-color=\"purple | azure | green | orange | danger\"\n");
      out.write("\n");
      out.write("        Tip 2: you can also add an image using data-image tag\n");
      out.write("    -->\n");
      out.write("      <div class=\"logo\"><a href=\"./dashboard.html\" class=\"simple-text logo-normal\">\n");
      out.write("          Shredder\n");
      out.write("        </a></div>\n");
      out.write("      <div class=\"sidebar-wrapper\">\n");
      out.write("        <ul class=\"nav\">\n");
      out.write("          <li class=\"nav-item active \">\n");
      out.write("            <a class=\"nav-link\" href=\"#\">\n");
      out.write("              <i class=\"material-icons\">person</i>\n");
      out.write("              <p>CEO Sign Up</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <!-- <li class=\"nav-item active-pro \">\n");
      out.write("                <a class=\"nav-link\" href=\"./upgrade.html\">\n");
      out.write("                    <i class=\"material-icons\">unarchive</i>\n");
      out.write("                    <p>Upgrade to PRO</p>\n");
      out.write("                </a>\n");
      out.write("            </li> -->\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"main-panel\">\n");
      out.write("      <!-- Navbar -->\n");
      out.write("      <nav class=\"navbar navbar-expand-lg navbar-transparent navbar-absolute fixed-top \" id=\"navigation-example\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <div class=\"navbar-wrapper\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"javascript:void(0)\">CEO Profile</a>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"collapse navbar-collapse justify-content-end\">\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"./Login Page.html\">\n");
      out.write("                  <i class=\"material-icons\">person</i>\n");
      out.write("                  <p class=\"d-lg-none d-md-block\">\n");
      out.write("                    Account\n");
      out.write("                  </p>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("      <!-- End Navbar -->\n");
      out.write("      <div class=\"content\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("              <div class=\"card\">\n");
      out.write("                <div class=\"card-header card-header-primary\">\n");
      out.write("                  <h4 class=\"card-title\">Edit Your Profile</h4>\n");
      out.write("                  <p class=\"card-category\">Complete your profile</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <form>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                      <div class=\"col-md-5\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label class=\"bmd-label-floating\">CEO ID</label>\n");
      out.write("                          <input type=\"text\" name=\"Ceo_id\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"col-md-3\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label class=\"bmd-label-floating\">Username</label>\n");
      out.write("                          <input type=\"text\"  name=\"username\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label class=\"bmd-label-floating\">Email address</label>\n");
      out.write("                          <input type=\"text\" name=\"email\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                      <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label class=\"bmd-label-floating\">Fist Name</label>\n");
      out.write("                          <input type=\"text\" name=\"fname\"   class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label class=\"bmd-label-floating\">Last Name</label>\n");
      out.write("                          <input type=\"text\" name=\"lname\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                      <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label class=\"bmd-label-floating\">Adress</label>\n");
      out.write("                          <input type=\"text\" name=\"adress\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                      <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label class=\"bmd-label-floating\">Password</label>\n");
      out.write("                          <input type=\"password\" name=\"password\"  class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label class=\"bmd-label-floating\">Phone Number</label>\n");
      out.write("                          <input type=\"text\" name=\"pno\"  class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label class=\"bmd-label-floating\">Age</label>\n");
      out.write("                          <input type=\"text\" name=\"age\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                      <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                          <label>About Me</label>\n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                            <label class=\"bmd-label-floating\">Little bit about yourself</label>\n");
      out.write("                            <textarea class=\"form-control\" name=\"desc\" rows=\"5\"></textarea>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary pull-right\">Sign Up</button>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                  </form>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("              <div class=\"card card-profile\">\n");
      out.write("                <div class=\"card-avatar\">\n");
      out.write("                  <a href=\"#pablo\">\n");
      out.write("                    <img class=\"img\" src=\"./assets/img/User-CEO.png\" />\n");
      out.write("                  </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <h6 class=\"card-category\">Sign Up - CEO</h6>\n");
      out.write("                  <h4 class=\"card-title\">CEO</h4>\n");
      out.write("                  <p class=\"card-description\">\n");
      out.write("                   Sign Up as a CEO and drive your company to a sucessful future.\n");
      out.write("                  </p>\n");
      out.write("                  <a href=\"#pablo\" class=\"btn btn-primary btn-round\">About Us</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <footer class=\"footer\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <nav class=\"float-left\">\n");
      out.write("            <ul>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"https://www.creative-tim.com\">\n");
      out.write("                  Creative Tim\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"https://creative-tim.com/presentation\">\n");
      out.write("                  About Us\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"http://blog.creative-tim.com\">\n");
      out.write("                  Blog\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"https://www.creative-tim.com/license\">\n");
      out.write("                  Licenses\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </nav>\n");
      out.write("          <div class=\"copyright float-right\" id=\"date\">\n");
      out.write("            , made with <i class=\"material-icons\">favorite</i> by\n");
      out.write("            <a href=\"https://www.creative-tim.com\" target=\"_blank\">Creative Tim</a> for a better web.\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </footer>\n");
      out.write("      <script>\n");
      out.write("        const x = new Date().getFullYear();\n");
      out.write("        let date = document.getElementById('date');\n");
      out.write("        date.innerHTML = '&copy; ' + x + date.innerHTML;\n");
      out.write("      </script>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"fixed-plugin\">\n");
      out.write("    <div class=\"dropdown show-dropdown\">\n");
      out.write("      <a href=\"#\" data-toggle=\"dropdown\">\n");
      out.write("        <i class=\"fa fa-cog fa-2x\"> </i>\n");
      out.write("      </a>\n");
      out.write("      <ul class=\"dropdown-menu\">\n");
      out.write("        <li class=\"header-title\"> Sidebar Filters</li>\n");
      out.write("        <li class=\"adjustments-line\">\n");
      out.write("          <a href=\"javascript:void(0)\" class=\"switch-trigger active-color\">\n");
      out.write("            <div class=\"badge-colors ml-auto mr-auto\">\n");
      out.write("              <span class=\"badge filter badge-purple active\" data-color=\"purple\"></span>\n");
      out.write("              <span class=\"badge filter badge-azure\" data-color=\"azure\"></span>\n");
      out.write("              <span class=\"badge filter badge-green\" data-color=\"green\"></span>\n");
      out.write("              <span class=\"badge filter badge-warning\" data-color=\"orange\"></span>\n");
      out.write("              <span class=\"badge filter badge-danger\" data-color=\"danger\"></span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"header-title\">Images</li>\n");
      out.write("        <li>\n");
      out.write("          <a class=\"img-holder switch-trigger\" href=\"javascript:void(0)\">\n");
      out.write("            <img src=\"./assets/img/sidebar-1.jpg\" alt=\"\">\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"active\">\n");
      out.write("          <a class=\"img-holder switch-trigger\" href=\"javascript:void(0)\">\n");
      out.write("            <img src=\"./assets/img/sidebar-2.jpg\" alt=\"\">\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <a class=\"img-holder switch-trigger\" href=\"javascript:void(0)\">\n");
      out.write("            <img src=\"./assets/img/sidebar-3.jpg\" alt=\"\">\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <a class=\"img-holder switch-trigger\" href=\"javascript:void(0)\">\n");
      out.write("            <img src=\"./assets/img/sidebar-4.jpg\" alt=\"\">\n");
      out.write("          </a>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!--   Core JS Files   -->\n");
      out.write("  <script src=\"./assets/js/core/jquery.min.js\"></script>\n");
      out.write("  <script src=\"./assets/js/core/popper.min.js\"></script>\n");
      out.write("  <script src=\"./assets/js/core/bootstrap-material-design.min.js\"></script>\n");
      out.write("  <script src=\"https://unpkg.com/default-passive-events\"></script>\n");
      out.write("  <script src=\"./assets/js/plugins/perfect-scrollbar.jquery.min.js\"></script>\n");
      out.write("  <!-- Place this tag in your head or just before your close body tag. -->\n");
      out.write("  <script async defer src=\"https://buttons.github.io/buttons.js\"></script>\n");
      out.write("  <!--  Google Maps Plugin    -->\n");
      out.write("  <script src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\n");
      out.write("  <!-- Chartist JS -->\n");
      out.write("  <script src=\"./assets/js/plugins/chartist.min.js\"></script>\n");
      out.write("  <!--  Notifications Plugin    -->\n");
      out.write("  <script src=\"./assets/js/plugins/bootstrap-notify.js\"></script>\n");
      out.write("  <!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc -->\n");
      out.write("  <script src=\"./assets/js/material-dashboard.js?v=2.1.0\"></script>\n");
      out.write("  <!-- Material Dashboard DEMO methods, don't include it in your project! -->\n");
      out.write("  <script src=\"./assets/demo/demo.js\"></script>\n");
      out.write("  <script>\n");
      out.write("    $(document).ready(function() {\n");
      out.write("      $().ready(function() {\n");
      out.write("        $sidebar = $('.sidebar');\n");
      out.write("\n");
      out.write("        $sidebar_img_container = $sidebar.find('.sidebar-background');\n");
      out.write("\n");
      out.write("        $full_page = $('.full-page');\n");
      out.write("\n");
      out.write("        $sidebar_responsive = $('body > .navbar-collapse');\n");
      out.write("\n");
      out.write("        window_width = $(window).width();\n");
      out.write("\n");
      out.write("        $('.fixed-plugin a').click(function(event) {\n");
      out.write("          // Alex if we click on switch, stop propagation of the event, so the dropdown will not be hide, otherwise we set the  section active\n");
      out.write("          if ($(this).hasClass('switch-trigger')) {\n");
      out.write("            if (event.stopPropagation) {\n");
      out.write("              event.stopPropagation();\n");
      out.write("            } else if (window.event) {\n");
      out.write("              window.event.cancelBubble = true;\n");
      out.write("            }\n");
      out.write("          }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $('.fixed-plugin .active-color span').click(function() {\n");
      out.write("          $full_page_background = $('.full-page-background');\n");
      out.write("\n");
      out.write("          $(this).siblings().removeClass('active');\n");
      out.write("          $(this).addClass('active');\n");
      out.write("\n");
      out.write("          var new_color = $(this).data('color');\n");
      out.write("\n");
      out.write("          if ($sidebar.length != 0) {\n");
      out.write("            $sidebar.attr('data-color', new_color);\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          if ($full_page.length != 0) {\n");
      out.write("            $full_page.attr('filter-color', new_color);\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          if ($sidebar_responsive.length != 0) {\n");
      out.write("            $sidebar_responsive.attr('data-color', new_color);\n");
      out.write("          }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $('.fixed-plugin .background-color .badge').click(function() {\n");
      out.write("          $(this).siblings().removeClass('active');\n");
      out.write("          $(this).addClass('active');\n");
      out.write("\n");
      out.write("          var new_color = $(this).data('background-color');\n");
      out.write("\n");
      out.write("          if ($sidebar.length != 0) {\n");
      out.write("            $sidebar.attr('data-background-color', new_color);\n");
      out.write("          }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $('.fixed-plugin .img-holder').click(function() {\n");
      out.write("          $full_page_background = $('.full-page-background');\n");
      out.write("\n");
      out.write("          $(this).parent('li').siblings().removeClass('active');\n");
      out.write("          $(this).parent('li').addClass('active');\n");
      out.write("\n");
      out.write("\n");
      out.write("          var new_image = $(this).find(\"img\").attr('src');\n");
      out.write("\n");
      out.write("          if ($sidebar_img_container.length != 0 && $('.switch-sidebar-image input:checked').length != 0) {\n");
      out.write("            $sidebar_img_container.fadeOut('fast', function() {\n");
      out.write("              $sidebar_img_container.css('background-image', 'url(\"' + new_image + '\")');\n");
      out.write("              $sidebar_img_container.fadeIn('fast');\n");
      out.write("            });\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          if ($full_page_background.length != 0 && $('.switch-sidebar-image input:checked').length != 0) {\n");
      out.write("            var new_image_full_page = $('.fixed-plugin li.active .img-holder').find('img').data('src');\n");
      out.write("\n");
      out.write("            $full_page_background.fadeOut('fast', function() {\n");
      out.write("              $full_page_background.css('background-image', 'url(\"' + new_image_full_page + '\")');\n");
      out.write("              $full_page_background.fadeIn('fast');\n");
      out.write("            });\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          if ($('.switch-sidebar-image input:checked').length == 0) {\n");
      out.write("            var new_image = $('.fixed-plugin li.active .img-holder').find(\"img\").attr('src');\n");
      out.write("            var new_image_full_page = $('.fixed-plugin li.active .img-holder').find('img').data('src');\n");
      out.write("\n");
      out.write("            $sidebar_img_container.css('background-image', 'url(\"' + new_image + '\")');\n");
      out.write("            $full_page_background.css('background-image', 'url(\"' + new_image_full_page + '\")');\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          if ($sidebar_responsive.length != 0) {\n");
      out.write("            $sidebar_responsive.css('background-image', 'url(\"' + new_image + '\")');\n");
      out.write("          }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $('.switch-sidebar-image input').change(function() {\n");
      out.write("          $full_page_background = $('.full-page-background');\n");
      out.write("\n");
      out.write("          $input = $(this);\n");
      out.write("\n");
      out.write("          if ($input.is(':checked')) {\n");
      out.write("            if ($sidebar_img_container.length != 0) {\n");
      out.write("              $sidebar_img_container.fadeIn('fast');\n");
      out.write("              $sidebar.attr('data-image', '#');\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            if ($full_page_background.length != 0) {\n");
      out.write("              $full_page_background.fadeIn('fast');\n");
      out.write("              $full_page.attr('data-image', '#');\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            background_image = true;\n");
      out.write("          } else {\n");
      out.write("            if ($sidebar_img_container.length != 0) {\n");
      out.write("              $sidebar.removeAttr('data-image');\n");
      out.write("              $sidebar_img_container.fadeOut('fast');\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            if ($full_page_background.length != 0) {\n");
      out.write("              $full_page.removeAttr('data-image', '#');\n");
      out.write("              $full_page_background.fadeOut('fast');\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            background_image = false;\n");
      out.write("          }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $('.switch-sidebar-mini input').change(function() {\n");
      out.write("          $body = $('body');\n");
      out.write("\n");
      out.write("          $input = $(this);\n");
      out.write("\n");
      out.write("          if (md.misc.sidebar_mini_active == true) {\n");
      out.write("            $('body').removeClass('sidebar-mini');\n");
      out.write("            md.misc.sidebar_mini_active = false;\n");
      out.write("\n");
      out.write("            $('.sidebar .sidebar-wrapper, .main-panel').perfectScrollbar();\n");
      out.write("\n");
      out.write("          } else {\n");
      out.write("\n");
      out.write("            $('.sidebar .sidebar-wrapper, .main-panel').perfectScrollbar('destroy');\n");
      out.write("\n");
      out.write("            setTimeout(function() {\n");
      out.write("              $('body').addClass('sidebar-mini');\n");
      out.write("\n");
      out.write("              md.misc.sidebar_mini_active = true;\n");
      out.write("            }, 300);\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          // we simulate the window Resize so the charts will get updated in realtime.\n");
      out.write("          var simulateWindowResize = setInterval(function() {\n");
      out.write("            window.dispatchEvent(new Event('resize'));\n");
      out.write("          }, 180);\n");
      out.write("\n");
      out.write("          // we stop the simulation of Window Resize after the animations are completed\n");
      out.write("          setTimeout(function() {\n");
      out.write("            clearInterval(simulateWindowResize);\n");
      out.write("          }, 1000);\n");
      out.write("\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
