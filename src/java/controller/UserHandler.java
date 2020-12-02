/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Products;
import beans.Users;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Randika
 */
@WebServlet(name = "UserHandler", urlPatterns = {"/UserHandler"})
public class UserHandler extends HttpServlet {
    Users user = new Users();
    int count=0;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                    System.out.print("servlet fired");
            
            //setting values to beans
            
            try{
                
                if(request.getParameter("create")!= null &&request.getParameter("create").equals("SignUp")){
                    
                    user.setUserName(request.getParameter("username"));
                    user.setFirstName(request.getParameter("fname"));
                    user.setLastName(request.getParameter("lname"));
                    user.setEmali(request.getParameter("email"));
                    user.setRoll(request.getParameter("roll"));
                    user.setAddress(request.getParameter("adress"));
                    user.setPassword(request.getParameter("password"));
                    user.setPhoneNo(request.getParameter("pno"));
                    user.setAge(request.getParameter("age"));
                    user.setDiscription(request.getParameter("desc"));
                    userInsert();
                    RequestDispatcher r = request.getRequestDispatcher("/redirect.jsp");
                    r.forward(request, response);
                    System.out.print("User added successfully");
                }
                else if(request.getParameter("update")!= null && request.getParameter("update").equals("update")){
                    int id = Integer.parseInt(request.getParameter("id"));
                    user.setFirstName(request.getParameter("fname"));
                    user.setLastName(request.getParameter("lname"));
                    user.setEmali(request.getParameter("email"));
                    user.setRoll(request.getParameter("roll"));
                    user.setAddress(request.getParameter("adress"));
                    user.setPassword(request.getParameter("password"));
                    user.setPhoneNo(request.getParameter("pno"));
                    user.setAge(request.getParameter("age"));
                    user.setDiscription(request.getParameter("desc"));
                    userUpdate(id);
                    RequestDispatcher r = request.getRequestDispatcher("/redirect.jsp");
                    r.forward(request, response);
                    System.out.print("Product updated successfully");
                }
                else if(request.getParameter("delete")!= null && request.getParameter("delete").equals("delete")){
                    int id = Integer.parseInt(request.getParameter("id"));
                    System.out.println(id);
                    userDelete(id);
                    RequestDispatcher r = request.getRequestDispatcher("/empView.jsp");
                    r.forward(request, response);
                }
            }catch (Exception ex) {
            PrintWriter writer = response.getWriter();
            writer.print(ex);
        }
       
    }
    public void userInsert(){
            
               try{
                    String Username = user.getUserName();
                    String FirstName= user.getFirstName();
                    String LastName = user.getLastName();
                    String Email = user.getEmali();
                    String Address = user.getAddress();
                    String Password = user.getPassword();
                    String Roll = user.getRoll();
                    String Pno = user.getPhoneNo();
                    String Age = user.getAge();
                    String Desc = user.getDiscription();
                    ResultSet search = DB.search("SELECT COUNT(*) FROM `users`");
                    if (search.next()) {
                        count += Integer.parseInt(search.getString(1));
                    }
                    String id = "" + count;
                    //insert values into database
                    DB.iud("INSERT INTO `users`(`id`,`userName`, `email`,`password`,`firstName`,`lastName`, `phoneNo`,  `age`,`roll`,`description`,`address`) VALUES ('"+id+"','"+Username+"','"+Email+"','"+Password+"','"+FirstName+"','"+LastName+"','"+Pno+"','"+Age+"','"+Roll+"','"+Desc+"','"+Address+"')");
               }catch(Exception e){
                    System.out.println(e);
               }


        }
        public void userUpdate(int id) throws Exception {
            try{

                    String Username = user.getUserName();
                    String FirstName= user.getFirstName();
                    String LastName = user.getLastName();
                    String Email = user.getEmali();
                    String Address = user.getAddress();
                    String Password = user.getPassword();
                    String Roll = user.getRoll();
                    String Pno = user.getPhoneNo();
                    String Age = user.getAge();
                    String Desc = user.getDiscription();
                    DB.iud("UPDATE `users` SET `userName`='"+Username+"',`email`='"+Email+"',`password`='"+Password+"',`firstName`='"+FirstName+"',`lastName`='"+LastName+"',,`phoneNo`='"+Pno+"',`age`='"+Age+"',`roll`='"+Roll+"',`description`='"+Desc+"',`address`='"+Address+"' WHERE `id` ='"+id+"'");
                
            }catch(Exception e){
               System.out.println(e);
            }
        }
        public void userDelete(int id) throws Exception {
            DB.iud("DELETE FROM `users` WHERE id='"+id+"'");
        }
}
