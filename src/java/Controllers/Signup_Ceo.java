/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Beans.Ceo_beans;
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
 * @author ALPHA
 */
@WebServlet(name = "Signup_Ceo", urlPatterns = {"/Signup_Ceo"})
public class Signup_Ceo extends HttpServlet {


   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
         try{
        int count = 0;
        Ceo_beans bean = new Ceo_beans();
        bean.setCeo_id(request.getParameter("Ceo_id"));
        bean.setUsername(request.getParameter("username"));
        bean.setFirst_Name(request.getParameter("fname"));
        bean.setLast_Name(request.getParameter("lname"));
        bean.setEmali(request.getParameter("email"));
        bean.setAdress(request.getParameter("adress"));
        bean.setPassword(request.getParameter("password"));
        bean.setPhoneNum(request.getParameter("pno"));
        bean.setAge(request.getParameter("age"));
        bean.setDiscription(request.getParameter("desc"));
        
        String Ceo_id= bean.getCeo_id();
        String Username = bean.getUsername();
        String FirstName= bean.getFirst_Name();
        String LastName = bean.getLast_Name();
        String Email = bean.getEmali();
        String Adress = bean.getAdress();
        String Password = bean.getPassword();
        String Pno = bean.getPhoneNum();
        String Age = bean.getAge();
        String Desc = bean.getDiscription();
        
        ResultSet search = DB.search("SELECT COUNT(*) FROM `ceo`");
            if (search.next()) {
                count += Integer.parseInt(search.getString(1));
            }
            String id = "" + count;
            //insert values into database
            DB.iud("INSERT INTO `ceo`(`id`,`Ceo_id`, `UserName`, `Email`, `FirstName`, `LastName`, `Adress`, `Password`, `PhoneNumber`, `Age`,`Description`) VALUES ('"+id+"','"+Ceo_id+"','"+Username+"','"+Email+"','"+FirstName+"','"+LastName+"','"+Adress+"','"+Password+"','"+Pno+"','"+Age+"','"+Desc+"')");
            response.sendRedirect("Ceo_Login.jsp");
        } catch (Exception ex) {
            PrintWriter writer = response.getWriter();
            writer.print(ex);
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
