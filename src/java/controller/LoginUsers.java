/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Randika
 */
@WebServlet(name = "LoginUsers", urlPatterns = {"/LoginUsers"})
public class LoginUsers extends HttpServlet {
    String roll;
    int id;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try {
       
            
            String userName = request.getParameter("userName");
            String password= request.getParameter("password");
            Cookie loginCookie = new Cookie("user",userName);
            loginCookie.setMaxAge(30*60);
            response.addCookie(loginCookie);
//            String userid = "SELECT * FROM `users` WHERE `userName ='"+userName+"'";
//            ResultSet uid = DB.search(userid);
//            if (uid.next()) {
//                id = Integer.parseInt(uid.getString(0));
//                System.out.print("id"+id);
//            }
            String desig = "SELECT * FROM `users` WHERE `userName` ='"+userName+"'";
            ResultSet designation = DB.search(desig);
            if (designation.next()) {
                roll = designation.getString(9);
                System.out.print("User roll :"+roll);
            }else{
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/redirect.jsp?message=<font color=red>Either user name or password is wrong.</font>");
		rd.include(request, response);
            }
            
            String sql = "SELECT * FROM `users` WHERE `userName` ='"+userName+"' AND `Password` = '"+password+"'";
            ResultSet search = DB.search(sql);
            if (search.next()) {
                HttpSession session = request.getSession(true);
                session.setAttribute("user", userName);
                if(roll.equals("Employee")){
                    RequestDispatcher r = request.getRequestDispatcher("dashboardEmp.jsp?message=Hello+" + userName + "");
                r.forward(request, response);
                }
                
                else if(roll.equals("CEO")){
                    RequestDispatcher r = request.getRequestDispatcher("dashboardTopManagement.jsp?message=Hello+" + userName + "");
                r.forward(request, response);
                }
                else if(roll.equals("Manager")){
                    RequestDispatcher r = request.getRequestDispatcher("dashboardMiddleManagement.jsp?message=Hello+" + userName + "");
                r.forward(request, response);
                }
    
            } else {
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/redirect.jsp?message=<font color=red>Either user name or password is wrong.</font>");
		rd.include(request, response);
            }
        } catch (Exception ex) {
             PrintWriter out = response.getWriter();
             out.print(ex);
        }
    }

}
