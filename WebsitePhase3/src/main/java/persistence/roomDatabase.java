/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

/**
 *
 * @author student
 */
import helper.roomBooked;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class roomDatabase {
   private static Connection getCon(){
    Connection con = null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?serverTimezone=EST","root","student");
        System.out.println("Connection established");
    }catch(Exception e){
        System.out.println(e);
    }
    return con;
}
   public ArrayList<roomBooked> roomBookedRead(int userID){
       ArrayList<roomBooked> bean = new ArrayList<roomBooked>();
       try{
           Connection con = getCon();
           
           String q = "select * from User_ROOM_Book WHERE userid LIKE " + userID+"";
           
           PreparedStatement ps = con.prepareStatement(q);
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               int userid = rs.getInt("userid");
               int roomid = rs.getInt("roomid");
               
               String q2 = "select * from ROOM WHERE id LIKE "+ roomid;
               PreparedStatement ps2 = con.prepareStatement(q2);
               ResultSet rs2 = ps2.executeQuery();
               if(rs2.next()){
               int roomno = rs2.getInt("roomno");
               int bedno = rs2.getInt("bedno");
               int balno = rs2.getInt("balno");
               Date startDate = rs2.getDate("startDate");
               Date dueDate = rs2.getDate("dueDate");
               Boolean available = rs2.getBoolean("available");
               roomBooked r = new roomBooked(roomid, roomno, bedno, balno, startDate, dueDate, available);
               bean.add(r);
               }
           }
           con.close();
       }catch(Exception e){
           System.out.println(e);
       }
       return bean;
   }
   public void writeroomBooking(int roomID, int roomNumber, int bedno, int balno, Date startDate, Date dueDate, boolean available, int userid){
       try{
           Connection con = getCon();
           String q = "INSERT INTO ROOM (id, roomno, bedno, balno, startDate, dueDate, available) VALUES("+roomID+", "+roomNumber+", "+bedno+", "+balno+", "+startDate+", "+dueDate+", "+available+")";
           String q2 = "INSERT INTO User_ROOM_Book (roomid, userid, startDate, dueDate, roomno) VALUES("+roomID+", "+userid+", "+startDate+", "+dueDate+", "+roomNumber+")";
           PreparedStatement ps = con.prepareStatement(q);
           PreparedStatement ps2 = con.prepareStatement(q2);
           ps.executeUpdate();
           ps2.executeUpdate();
           System.out.println("Room Booked Successfully");
           con.close();
       }catch(Exception e){
           System.out.println(e);
       }
   }
}
