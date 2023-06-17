/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author student
 */
import persistence.userDatabase;
import persistence.roomDatabase;
import helper.customer;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@WebServlet(name = "Book", urlPatterns = {"/Book"})
public class roomBooker extends HttpServlet {

  public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    HttpSession session = request.getSession();

    int roomID = Integer.parseInt(request.getParameter("roomid"));
    int roomNumber = Integer.parseInt(request.getParameter("roomno"));
    int bedno = Integer.parseInt(request.getParameter("bedno"));
    int balno = Integer.parseInt(request.getParameter("balno"));
    
    String startDateString = request.getParameter("startDate");
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date startDate = null;

    try {
    startDate = dateFormat.parse(startDateString);
    } catch (ParseException e) {
    // Handle the parsing exception
    e.printStackTrace();
    }
    
    String dueDateString = request.getParameter("dueDate");
    Date dueDate = null;

    try {
    startDate = dateFormat.parse(startDateString);
    } catch (ParseException e) {
    // Handle the parsing exception
    e.printStackTrace();
    }
    
    Boolean available = Boolean.parseBoolean(request.getParameter("available"));
    int userid = Integer.parseInt(request.getParameter("userid"));
    String drugName = request.getParameter("drug");
    String dosage = request.getParameter("instructions");
    String fullname = request.getParameter("fullname");
    String username = (String)session.getAttribute("username");
    String pass = (String)session.getAttribute("password");
    
    // use uname to find doctor   
    userDatabase ub = new userDatabase();
    customer customer = ub.customerRead(username, pass);
    //Write to database
    roomDatabase rd = new roomDatabase();
    rd.writeroomBooking(roomID, roomNumber, bedno, balno, startDate, dueDate, available, userid);
    response.sendRedirect("booked.jsp");
  }
}
