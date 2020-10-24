/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Randika
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Randika
 */
public class DB {
     private static Connection c;

    public static void createMyConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://shreder.cyvr3hgt0z1q.ap-southeast-1.rds.amazonaws.com:3306/inventory?&useSSL=false","root","Shredder1234$");
    }

    public static void iud(String sql) throws Exception {
        if (c == null) {
            createMyConnection();
        }
        c.createStatement().executeUpdate(sql);
    }

    public static ResultSet search(String sql) throws Exception {
        if (c == null) {
            createMyConnection();
        }
        return c.createStatement().executeQuery(sql);

    }
    public static Connection getMyConnection()throws Exception{
        if (c==null) {
            createMyConnection();
        }
        return  c;
    }
}

