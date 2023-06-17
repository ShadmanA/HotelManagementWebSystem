/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.ArrayList;

/**
 *
 * @author student
 */
public class userInfo {
    
    String fullName;
    String email;
    String address;
    String phoneNumber;
    String username;
    String password;
    
    public String getName(){
        return fullName;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    /*private ArrayList <roomBooked> roombooked = new ArrayList<>();
    public void addRoom(roomBooked room){
        roombooked.add(room);
    }
    public ArrayList<roomBooked> getRoomBooked(){
        return roombooked;
    }
    Already Exists for the customer class
    */
    
}
