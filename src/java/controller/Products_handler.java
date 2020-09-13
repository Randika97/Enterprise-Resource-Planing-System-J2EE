/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Products;
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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Randika
 */
@WebServlet(name = "Products_handler", urlPatterns = {"/Products_handler"})
public class Products_handler extends HttpServlet {
    int count=0;
    Products p = new Products();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            System.out.print("servlet fired");
            
            //setting values to beans
            
            try{
                //establishing session
//                HttpSession session = request.getSession(true);
//                String name =(String)session.getAttribute("user");
                
                if(request.getParameter("create")!= null &&request.getParameter("create").equals("Add")){
                    
                    p.setProdutCode(request.getParameter("produtCode"));
                    p.setProductName(request.getParameter("productName"));
                    p.setProductStockInHand(Integer.parseInt(request.getParameter("productStockInHand")));
                    p.setPrice(Integer.parseInt(request.getParameter("price")));
                    p.setCategory(request.getParameter("category"));
                    p.setProductDesc(request.getParameter("productDesc"));
                    productInsert();
                    RequestDispatcher r = request.getRequestDispatcher("/redirect.jsp");
                    r.forward(request, response);
                }
                else if(request.getParameter("update")!= null && request.getParameter("update").equals("update")){
                    p.setProdutCode(request.getParameter("produtCode"));
                    p.setProductName(request.getParameter("productName"));
                    p.setProductStockInHand(Integer.parseInt(request.getParameter("productStockInHand")));
                    p.setPrice(Integer.parseInt(request.getParameter("price")));
                    p.setCategory(request.getParameter("category"));
                    p.setProductDesc(request.getParameter("productDesc"));
                    productUpdate();
                    RequestDispatcher r = request.getRequestDispatcher("/redirect.jsp");
                    r.forward(request, response);
                }
                else if(request.getParameter("delete")!= null && request.getParameter("delete").equals("delete")){
                   String id = (String) request.getAttribute("proid");
                    productDelete(id);
                    RequestDispatcher r = request.getRequestDispatcher("/redirect.jsp");
                    r.forward(request, response);
                }
                else if(request.getParameter("view")!= null && request.getParameter("view").equals("view")){
                    System.out.println("view fired");
                    productView();
                    List<Products> product = productView();
                    request.setAttribute("products", product);
                    RequestDispatcher r = request.getRequestDispatcher("/productView.jsp");
                    r.forward(request, response);
                }
            }catch (Exception ex) {
            PrintWriter writer = response.getWriter();
            writer.print(ex);
        }

    }
        public void productInsert(){
            
               try{
                   //getting values from beans
                    String productCode = p.getProdutCode();
                    String productName = p.getProductName();
                    int sih = p.getProductStockInHand();
                    int price = p.getPrice();
                    String desc = p.getProductDesc();
                    String category = p.getCategory();
                    //Auto_Increament by manually
                    ResultSet search = DB.search("SELECT COUNT(*) FROM `products`");
                        if (search.next()) {
                        count += Integer.parseInt(search.getString(1));
                         }
                        int id =count;
                        DB.iud("INSERT INTO `products`(`id`,`produtCode`,`productName`,`productStockInHand`, `price`, `category`,`productDesc`) VALUES ('"+id+"','"+productCode+"','"+productName+"','"+sih+"','"+price+"','"+category+"','"+desc+"')");
               }catch(Exception e){
                    System.out.println(e);
               }


        }
        public void productUpdate() throws Exception {
            try{
                //getting values from beans
            String productCode = p.getProdutCode();
            String productName = p.getProductName();
            int sih = p.getProductStockInHand();
            int price = p.getPrice();
            String category = p.getCategory();
            String desc = p.getProductDesc();
            DB.iud("UPDATE `products` SET `productName`='"+productName+"',`productStockInHand`='"+sih+"',`price`='"+price+"',`category`='"+category+"',`productDesc`='"+desc+"' WHERE `id` ='"+productCode+"'");
                
            }catch(Exception e)
            {
               System.out.println(e);
            }
        }
        public void productDelete(String proId) throws Exception {
            DB.iud("DELETE FROM `products` WHERE produtCode='"+proId+"'");
        }
        
        public List<Products> productView() throws Exception {
        ArrayList<Products> progs = new ArrayList<Products>();
        ResultSet rs = DB.search("SELECT * FROM `products`");
        while (rs.next()) {
            Products view = new Products();
            view.setProdutCode(rs.getString(2));
            view.setProductName(rs.getString(3));
            view.setPrice(Integer.parseInt(rs.getString(4)));
            view.setProductStockInHand(Integer.parseInt(rs.getString(5)));
            view.setCategory(rs.getString(6));
            view.setProductDesc(rs.getString(7));
            progs.add(view);
        }
        return progs;
    }

}
