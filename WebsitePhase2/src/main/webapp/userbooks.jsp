<%-- 
    Document   : userbooks
    Created on : Jan 24, 2021, 1:00:48 AM
    Author     : student
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="ryerson.ca.lab2.roomBooked"%>
<!DOCTYPE html>


<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your Room</title>
    </head>
    <style>

body {
  background-color: #B0E6F7;

}
</style>
<% 
    ArrayList<roomBooked> rooms= (ArrayList)request.getAttribute("roomsBookedInfo");
  
%>

<center><h2>Hello <%=session.getAttribute("uname")%></h2></center>
<br>
<center><img src="resources/LuxuryLounge.jpg" height = "300", width = "750" ></center>
<center><h3> These are your booked rooms</h3></center>
<br>
<form action="Extend" method="post">
<table border="2" align="center" cellpadding="5" cellspacing="5">

<tr>
   
<th> Room Number </th>
<th> Start Date </th>
<th> Due Date </th>
<th> Extend </th>

</tr>

    <% for(roomBooked room: rooms){
    %>
<tr>
<td> <%=room.getRoomNumber()%> </td>
<td> <%=new SimpleDateFormat("YYYY-MM-dd").format(room.getStartDate())%></td>
<td> <%=new SimpleDateFormat("YYYY-MM-dd").format(room.getDueDate())%></td>
<% if (room.isAvailable()){
%>
<td> <input type="submit" value="Extend" ></td>
<%}

else {
%>


<td> "You can no longer extend your stay at this room"</td>
<% }}
%>
</tr>
</table>
</form>
</body>
</html>
