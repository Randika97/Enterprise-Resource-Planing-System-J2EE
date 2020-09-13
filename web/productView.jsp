<%-- 
    Document   : productView
    Created on : 13-Sep-2020, 14:18:09
    Author     : Randika
--%>

<%@page import="beans.Products"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1px">
        <thead>
         <tr>
           <th>produtCode</th>
           <th>productName</th>
           <th>productStockInHand</th>
           <th>price</th>
           <th>category</th>
           <th>productDesc</th>
           <th>Product update</th>
         </tr>
       </thead>
         <tbody>
              <%
            ArrayList<Products> products = (ArrayList<Products>) request.getAttribute("products");
            for (Products pro : products) {
                                            %>
               <tr>
                 <td><%=pro.getProdutCode()  %></td>
                 <td><%=pro.getProductName() %></td>
                 <td><%=pro.getPrice() %></td>
                 <td><%=pro.getCategory()  %></td>
                 <td><%=pro.getProductStockInHand()%></td>
                 <td><%=pro.getProductDesc() %></td>
                 <td><form action="Products_handler" method="post">
                          <% String ProdutCode = pro.getProdutCode();
                             request.setAttribute("proid", ProdutCode);
                          %>
                         <input type="submit" name="delete" value="delete">
                         <input type="submit" name="update" value="update">
                     </form>
                 </td>
                  <% } %>
               </tr>  
             </tbody>
     </table>
    </body>
</html>
