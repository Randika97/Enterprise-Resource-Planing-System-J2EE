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
    String designation = null;
    int id;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try {
       
            
            String uname = request.getParameter("userName");
            String password= request.getParameter("password");
            String sql = "SELECT * FROM `users` WHERE `userName` ='"+uname+"' AND `Password` = '"+password+"'";
            ResultSet search = DB.search(sql);
            if (search.next()) {
                HttpSession session = request.getSession(true);
                session.setAttribute("user", uname);
                String query = "SELECT * FROM `users` WHERE `userName` ='"+uname+"'";
                ResultSet desig = DB.search(query);
                if (desig.next()) {
                    String roll = desig.getString(9);
                    designation = roll;
                    System.out.print("User's roll in the system :"+roll);
                }
                
                if(designation.equals("Employee")){
                    RequestDispatcher r = request.getRequestDispatcher("dashboardEmp.jsp?message=Hello+" + uname + "");
                r.forward(request, response);
                }
                
                else if(designation.equals("CEO")){
                    RequestDispatcher r = request.getRequestDispatcher("dashboardTopManagement.jsp?message=Hello+" + uname + "");
                r.forward(request, response);
                }
                else if(designation.equals("Manager")){
                    RequestDispatcher r = request.getRequestDispatcher("dashboardMiddleManagement.jsp?message=Hello+" + uname + "");
                r.forward(request, response);
                }
    
            } else {
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/redirect.jsp");
		rd.include(request, response);
            }
        } catch (Exception ex) {
             PrintWriter out = response.getWriter();
             out.print(ex);
        }
    }

}
