/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.lab2;

import java.util.ArrayList;

/**
 *
 * @author student
 */
class userInfo {
    /*to be completed
    For now, we just add room info to make the example work. This class must be completed in future
    */
    private ArrayList <roomBooked> roombooked = new ArrayList<>();
    public void addRoom(roomBooked room){
        roombooked.add(room);
    }
    public ArrayList<roomBooked> getRoomBooked(){
        return roombooked;
    }
    
}
