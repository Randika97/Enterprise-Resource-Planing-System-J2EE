<%-- 
    Document   : products
    Created on : 13-Sep-2020, 13:10:26
    Author     : Randika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Products_handler" name="create" method="post">
            <label for="fname">Product Code :</label>
            <input type="text" id="produtCode" name="produtCode"><br>
            <label for="lname">Product Name :</label>
            <input type="text" id="productName" name="productName"><br>
            <label for="fname">Stock in hand</label>
            <input type="text" id="productStockInHand" name="productStockInHand"><br>
            <label for="lname">Price : </label>
            <input type="text" id="price" name="price"><br>
            <label for="fname">Category</label>
            <input type="text" id="category" name="category"><br>
            <label for="lname">Description</label>
            <input type="text" id="productDesc" name="productDesc"><br>
            <input type="submit" name ="create" value="Add">

        </form>
    </body>
</html>
