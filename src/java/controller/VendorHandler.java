/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Vendor;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
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
@WebServlet(name = "VendorHandler", urlPatterns = {"/VendorHandler"})
public class VendorHandler extends HttpServlet {
    int count=0;
    Vendor vendorGlobal = new Vendor();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                    System.out.print("servlet fired");
            
            //setting values to beans
            
            try{
               //establishing session
//                HttpSession session = request.getSession(true);
//                String name =(String)session.getAttribute("user");
                
                if(request.getParameter("create")!= null && request.getParameter("create").equals("Add")){
                    vendorGlobal.setVendorName(request.getParameter("vendorName"));
                    vendorGlobal.setVendorPhone(request.getParameter("vendorPhone"));
                    vendorGlobal.setVendorAddress(request.getParameter("vendorAddress")); 
                    vendorGlobal.setVendorEmail(request.getParameter("vendorEmail"));
                    vendorInsert();
                    RequestDispatcher r = request.getRequestDispatcher("/redirect.jsp");
                    r.forward(request, response);
                }
                else if(request.getParameter("update")!= null && request.getParameter("update").equals("update")){
                    vendorGlobal.setVendorName(request.getParameter("vendorName"));
                    vendorGlobal.setVendorPhone(request.getParameter("vendorPhone"));
                    vendorGlobal.setVendorAddress(request.getParameter("vendorAddress")); 
                    vendorGlobal.setVendorEmail(request.getParameter("vendorEmail"));
                    vendorUpdate();
                    RequestDispatcher r = request.getRequestDispatcher("/redirect.jsp");
                    r.forward(request, response);
                }
                else if(request.getParameter("delete")!= null && request.getParameter("delete").equals("delete")){
                   String id = (String) request.getAttribute("vendorId");
                   vendorDelete(id);
                    RequestDispatcher r = request.getRequestDispatcher("/redirect.jsp");
                    r.forward(request, response);
                }
                else if(request.getParameter("view")!= null && request.getParameter("view").equals("view")){
                    System.out.println("view fired");
                    vendorView();
                    List<Vendor> vendor = vendorView();
                    request.setAttribute("vendors", vendor);
                    RequestDispatcher r = request.getRequestDispatcher("/vendorView.jsp");
                    r.forward(request, response);
                }
            }catch (Exception ex) {
            PrintWriter writer = response.getWriter();
            writer.print(ex);
        }
    }
    public void vendorInsert(){
            
               try{
                   //getting values from beans
                    String vendorName = vendorGlobal.getVendorName();
                    String vendorPhone = vendorGlobal.getVendorPhone();
                    String vendorAddress = vendorGlobal.getVendorAddress();
                    String vendorEmail = vendorGlobal.getVendorEmail();
                    //Auto_Increament by manually
                    ResultSet search = DB.search("SELECT COUNT(*) FROM `vendor`");
                        if (search.next()) {
                             count += Integer.parseInt(search.getString(1));
                        }
                        int id =count;
                        DB.iud("INSERT INTO `vendor`(`vendorId`,`vendorName`,`vendorPhone`, `vendorAddress` , `vendorEmail`) VALUES ('"+id+"','"+vendorName+"','"+vendorPhone+"','"+vendorAddress+"','"+vendorEmail+"')");
               }catch(Exception e){
                    System.out.println(e);
               }


        }
        public void vendorUpdate() throws Exception {
            try{
                //getting values from beans
                String vendorId = vendorGlobal.getVendorId();
                String vendorName = vendorGlobal.getVendorName();
                String vendorPhone = vendorGlobal.getVendorPhone();
                String vendorAddress = vendorGlobal.getVendorAddress();
                String vendorEmail = vendorGlobal.getVendorEmail();
                DB.iud("UPDATE `vendor` SET `vendorName`='"+vendorName+"',`vendorPhone`='"+vendorPhone+"',`vendorAddress`='"+vendorAddress+"' , `vendorEmail`='"+vendorEmail+"' WHERE `vendorId` ='"+vendorId+"'");

            }catch(Exception e){
               System.out.println(e);
            }
        }
        
        public void vendorDelete(String vendorId) throws Exception {
            DB.iud("DELETE FROM `vendor` WHERE vendorId='"+vendorId+"'");
        }
        
        public List<Vendor> vendorView() throws Exception {
        ArrayList<Vendor> progs = new ArrayList<Vendor>();
        ResultSet rs = DB.search("SELECT * FROM `vendor`");
        while (rs.next()) {
            Vendor v = new Vendor();
            v.setVendorId(rs.getString(1));
            v.setVendorName(rs.getString(2));
            v.setVendorPhone((rs.getString(3)));
            v.setVendorAddress((rs.getString(4)));
            v.setVendorEmail((rs.getString(5)));
            progs.add(v);
        }
        return progs;
    }


}
