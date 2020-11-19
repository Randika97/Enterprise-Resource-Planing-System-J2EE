/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Products;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
 
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

@WebServlet("/EmailSendingServlet")
public class EmailSendingServlet extends HttpServlet {
    private String host;
    private String port;
    private String user;
    private String pass;
    
 
    public void init() {
        // reads SMTP server setting from web.xml file
        ServletContext context = getServletContext();
        host = context.getInitParameter("host");
        port = context.getInitParameter("port");
        user = context.getInitParameter("user");
        pass = context.getInitParameter("pass");
    }
 
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // reads form fields
        String recipient = "randikasuridu@gmail.com";
        String subject = "Low products warning";

        String resultMessage = "";
 
        try {
              ResultSet rs = DB.search("SELECT * FROM `products` WHERE productStockInHand < 20");
              ArrayList<String> lowproducts = new ArrayList<>();
              while(rs.next()) {
              System.out.println(rs.getString(2));
              lowproducts.add(rs.getString(2));
            }
            System.out.print(lowproducts);
            String content = "These products have low stock in hand :"+lowproducts;
            EmailUtility.sendEmail(host, port, user, pass, recipient, subject,
                    content);
            resultMessage = "The e-mail was sent successfully";
        } catch (Exception ex) {
            ex.printStackTrace();
            resultMessage = "There were an error: " + ex.getMessage();
        } finally {
            request.setAttribute("Message", resultMessage);
            getServletContext().getRequestDispatcher("/dashboardEmp.jsp").forward(
                    request, response);
        }
    }
}