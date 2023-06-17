/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.lab2;

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

    private  boolean available;

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
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
    String roomNumber;
    Date startDate;
    Date dueDate;

    /*
    To be completed
     */
    public roomBooked(String roomNumber, Date borrowStartTime, Date borrowEndTime, boolean available) {
        this.roomNumber = roomNumber;
        this.startDate = borrowStartTime;
        this.dueDate = borrowEndTime;
        this.available=available;
    }

    
}
