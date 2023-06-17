
package helper;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistence.userDatabase;
import persistence.roomDatabase;
/**
 *
 * @author student
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username=(String) request.getParameter("username");
        String userIDString = request.getParameter("userID");
        String password=(String) request.getParameter("password");
        String account_type = (String) request.getParameter("account_type");
        
                // Validate if the userID parameter is empty or null
        if (userIDString == null || userIDString.isEmpty()) {
        // Handle the case where the userID is missing
        // You can display an error message or redirect the user to an error page
        RequestDispatcher rd = request.getRequestDispatcher("failedlogin.jsp");
        rd.forward(request, response);
        return; // Return early to avoid further processing
        }
        // Parse the userID parameter
        int userID = Integer.parseInt(userIDString);
        
        if(account_type.equals("Customer")){
        customer customer = getCustomerInfo(username, userID, password);
        System.out.println(customer.getUsername());
        if (customer==null){
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, "Oops, customer was null", new NullPointerException());
            RequestDispatcher rd= request.getRequestDispatcher("failedlogin.jsp");
            rd.forward(request, response);
        }
        else{
            request.getSession().setAttribute("username", username);
            request.getSession().setAttribute("userID", userID);
            request.getSession().setAttribute("password", password);
            request.setAttribute("customerBookings", customer.getRoomBooked());

            RequestDispatcher rd= request.getRequestDispatcher("customer.jsp");
            rd.forward(request, response);
            
        }
        }else if(account_type.equals("Admin")){
            if(username.equals("admin") && password.equals("admin")){
                RequestDispatcher rd= request.getRequestDispatcher("admin.jsp");
                rd.forward(request, response);
                
            }else{
                 RequestDispatcher rd= request.getRequestDispatcher("failedlogin.jsp");
                 rd.forward(request, response);      
            }
        } 
    }

    private customer getCustomerInfo(String username, int userID, String password) {
        /**
         * to be completed. For now, we just return a patient object that has a default message;
         * This method must return null when user name and password is incorrect
         * otherwise it must return an object containing all information about the patient
         */

        //search the database for matching username
        userDatabase ud = new userDatabase();
        customer customer = ud.customerRead(username, password);
        
        if (customer == null) {
        // Handle the case where the customer is not found
        // You can display an error message or redirect the user to an error page
        return null; // Return null to indicate the customer was not found
    }
        
        roomDatabase rd = new roomDatabase();       
        customer.roombooked = rd.roomBookedRead(userID);
        return customer;
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

          doPost(request, response);

        
    }

}
