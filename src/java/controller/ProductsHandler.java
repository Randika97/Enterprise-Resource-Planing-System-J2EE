/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Products;
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
@WebServlet(name = "ProductsHandler", urlPatterns = {"/ProductsHandler"})
public class ProductsHandler extends HttpServlet {
    
    int count=0;
    int vendorId;
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
                    //vendorId = Integer.parseInt(request.getParameter("vid"));
                    productInsert();
                    RequestDispatcher r = request.getRequestDispatcher("/productView.jsp");
                    r.forward(request, response);
                    System.out.print("Product added successfully");
                }
                else if(request.getParameter("update")!= null && request.getParameter("update").equals("update")){
                    int id = Integer.parseInt(request.getParameter("id"));
                    p.setProdutCode(request.getParameter("produtCode"));
                    p.setProductName(request.getParameter("productName"));
                    p.setProductStockInHand(Integer.parseInt(request.getParameter("productStockInHand")));
                    p.setPrice(Integer.parseInt(request.getParameter("price")));
                    p.setCategory(request.getParameter("category"));
                    p.setProductDesc(request.getParameter("productDesc"));
                    productUpdate(id);
                    RequestDispatcher r = request.getRequestDispatcher("/productView.jsp");
                    r.forward(request, response);
                    System.out.print("Product updated successfully");
                }
                else if(request.getParameter("delete")!= null && request.getParameter("delete").equals("delete")){
                    int proid = Integer.parseInt(request.getParameter("id"));
                    System.out.println(proid);
                    productDelete(proid);
                    RequestDispatcher r = request.getRequestDispatcher("/productView.jsp");
                    r.forward(request, response);
                }
                else if(request.getParameter("view")!= null && request.getParameter("view").equals("view")){
                    productView();
                    List<Products> product = productView();
                    request.setAttribute("products", product);
                    RequestDispatcher r = request.getRequestDispatcher("/productView.jsp");
                    r.forward(request, response);
                    System.out.println("Products rendered");
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
                        if (search.next()){
                            count += Integer.parseInt(search.getString(1));
                        }
                        int id =count;
                        DB.iud("INSERT INTO `products`(`id`,`produtCode`,`productName`,`productStockInHand`, `price`, `category`,`productDesc`) VALUES ('"+id+"','"+productCode+"','"+productName+"','"+sih+"','"+price+"','"+category+"','"+desc+"')");
               }catch(Exception e){
                    System.out.println(e);
               }


        }
        public void productUpdate(int id) throws Exception {
            try{
                //getting values from beans
                //int id = 0;
                String productName = p.getProductName();
                int sih = p.getProductStockInHand();
                int price = p.getPrice();
                String category = p.getCategory();
                String desc = p.getProductDesc();
                DB.iud("UPDATE `products` SET `productName`='"+productName+"',`productStockInHand`='"+sih+"',`price`='"+price+"',`category`='"+category+"',`productDesc`='"+desc+"' WHERE `id` ='"+id+"'");
                
            }catch(Exception e){
               System.out.println(e);
            }
        }
        public void productDelete(int proId) throws Exception {
            DB.iud("DELETE FROM `products` WHERE id='"+proId+"'");
        }
        
        public List<Products> productView() throws Exception {
        ArrayList<Products> progs = new ArrayList<Products>();
        ResultSet rs = DB.search("SELECT * FROM `products`");
        while (rs.next()) {
            Products view = new Products();
            view.setId(Integer.parseInt(rs.getString(1)));
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
