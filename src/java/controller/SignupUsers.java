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
@WebServlet(name = "SignupUsers", urlPatterns = {"/SignupUsers"})
public class SignupUsers extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try{
        int count = 0;
        Users bean = new Users();
        bean.setUserName(request.getParameter("username"));
        bean.setFirstName(request.getParameter("fname"));
        bean.setLastName(request.getParameter("lname"));
        bean.setEmali(request.getParameter("email"));
        bean.setAddress(request.getParameter("adress"));
        bean.setPassword(request.getParameter("password"));
        bean.setPhoneNo(request.getParameter("pno"));
        bean.setAge(request.getParameter("age"));
        bean.setDiscription(request.getParameter("desc"));
        
        String Username = bean.getUserName();
        String FirstName= bean.getFirstName();
        String LastName = bean.getLastName();
        String Email = bean.getEmali();
        String Address = bean.getAddress();
        String Password = bean.getPassword();
        String Roll = bean.getRoll();
        String Pno = bean.getPhoneNo();
        String Age = bean.getAge();
        String Desc = bean.getDiscription();
        
        ResultSet search = DB.search("SELECT COUNT(*) FROM `users`");
            if (search.next()) {
                count += Integer.parseInt(search.getString(1));
            }
            String id = "" + count;
            //insert values into database
            DB.iud("INSERT INTO `users`(`id`,`userName`, `email`,`password`,`firstName`,`lastName`, `phoneNo`,  `age`,`roll`,`Description`,`address`) VALUES ('"+id+"','"+Username+"','"+Email+"','"+Password+"','"+FirstName+"','"+LastName+"','"+Pno+"','"+Age+"','"+Roll+"','"+Desc+"','"+Address+"')");
            response.sendRedirect("redirect.jsp");
        } catch (Exception ex) {
            PrintWriter writer = response.getWriter();
            writer.print(ex);
        }

    }

}
