/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import helper.userInfo;
import java.util.ArrayList;

/**
 *
 * @author student
 */
public class customer extends userInfo{
    public customer(String fullName, String email, String address, String phoneNumber, String username, String password){
        this.fullName = fullName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;

    }
    public String getUsername(){
       return this.username;
    }
    
    public String setUsername(String username){
    return this.username = username;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    ArrayList <roomBooked> roombooked = new ArrayList<>();
    public void addRoom(roomBooked room){
        roombooked.add(room);
    }
    public ArrayList<roomBooked> getRoomBooked(){
        return roombooked;
    }


}
