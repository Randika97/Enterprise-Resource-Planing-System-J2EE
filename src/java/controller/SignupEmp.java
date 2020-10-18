/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Users;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Randika
 */
@WebServlet(name = "SignupEmp", urlPatterns = {"/SignupEmp"})
public class SignupEmp extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 try{
        int count = 0;
        String roll = "Employee";
        Users user = new Users();
        user.setUserName(request.getParameter("username"));
        user.setFirstName(request.getParameter("fname"));
        user.setLastName(request.getParameter("lname"));
        user.setEmali(request.getParameter("email"));
        user.setAddress(request.getParameter("adress"));
        user.setPassword(request.getParameter("password"));
        user.setPhoneNo(request.getParameter("pno"));
        user.setAge(request.getParameter("age"));
        user.setDiscription(request.getParameter("desc"));
        
        String userName = user.getUserName();
        String firstName= user.getFirstName();
        String lastName = user.getLastName();
        String email = user.getEmali();
        String address = user.getAddress();
        String password = user.getPassword();
        String pNo = user.getPhoneNo();
        String age = user.getAge();
        String desc = user.getDiscription();
        
        ResultSet search = DB.search("SELECT COUNT(*) FROM `users`");
            if (search.next()) {
                count += Integer.parseInt(search.getString(1));
            }
            String id = "" + count;
            //insert values into database
            DB.iud("INSERT INTO `users`(`id`,`userName`,`email`,`password`,`firstName`,`lastName`,`phoneNo`,`age`,`roll`,`description`,`address`) VALUES ('"+id+"','"+userName+"','"+email+"','"+password+"','"+firstName+"','"+lastName+"','"+pNo+"','"+age+"','"+roll+"','"+desc+"','"+address+"')");
            response.sendRedirect("redirect.jsp");
        } catch (Exception ex) {
            PrintWriter writer = response.getWriter();
            writer.print(ex);
        }
    }


}
