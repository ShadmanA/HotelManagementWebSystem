/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.Date;

/**
 *
 * @author student
 */
public class roomBooked {

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date sdate) {
        this.startDate = sdate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date date) {
        this.dueDate = date;
    }
    
    public int getBedNumber() {
        return bedno;
    }

    public void setBedNumber(int bedno) {
        this.bedno = bedno;
    }

    public int getBalNumber() {
        return balno;
    }

    public void setBalNumber(int balno) {
        this.balno = balno;
    }
    
    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }


    int roomNumber;
    Date startDate;
    Date dueDate;
    int bedno;
    int balno;
    int roomID;
    private  boolean available;

    /*
    To be completed
     */
    public roomBooked(int roomID, int roomNumber, int bedno, int balno, Date bookStartTime, Date bookEndTime, boolean available) {
        this.roomNumber = roomNumber;
        this.bedno = bedno;
        this.balno = balno;
        this.startDate = bookStartTime;
        this.dueDate = bookEndTime;
        this.available=available;
        this.roomID = roomID;
    }

    
}
