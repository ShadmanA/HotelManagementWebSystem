/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import helper.userInfo;
import helper.customer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author student
 */
public class userDatabase {
   private static Connection getCon(){
    Connection con = null;
    try{
        System.out.println("Before Connection");
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?serverTimezone=EST","root","student");
        System.out.println("Connection established");
    }catch(Exception e){
        System.out.println(e);
    }
    return con;
}
   public customer customerRead(String username, String password){
       customer bean = null;
       try{
           Connection con = getCon();
        
        String q = "SELECT * FROM USER WHERE username = ?";
        PreparedStatement ps = con.prepareStatement(q);
        ps.setString(1, username);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            bean = new customer();
            bean.setUsername(rs.getString("username"));
            bean.setPassword(rs.getString("password"));
            bean.setFullName(rs.getString("fullname"));
            bean.setEmail(rs.getString("email"));
           }
           con.close();
       }catch(Exception e){
           System.out.println(e);
       }
       return bean;
   }
}
