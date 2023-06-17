

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="helper.roomBooked"%>
<!DOCTYPE html>


<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Patient Page </title>
    <style>

      .schedule-section {
        float: left;
        width: 100%;
        margin-top: 20px;
        margin-left: 20px;
      }
      .drug-section {
        float: left;
        width: 40%;
        margin-top: 20px;
        margin-left: 20px;
      }
      table {
        width: 100%;
        border-collapse: collapse;
      }
      th, td {
        border: 1px solid black;
        padding: 8px;
        text-align: left;
      }
      th {
        background-color: lightgray;
      }
    button {
        padding: 10px 20px;
        border: 2px solid black;
        border-radius: 5px;
        background-color: lightgray;
        font-size: 18px;
        cursor: pointer;
  }
  button:hover {
    background-color: lightgreen;
  }
</style>
</head>

    ArrayList<roomBooked> roomBooked= (ArrayList)request.getAttribute("roomBooked");
  
%>
  <body>

    <div class="schedule-section">
      <h2>Schedule</h2>
      <table id="schedule-table">
      <tr>
        <th></th>
        <th>Suite 1</th>
        <th>Suite 2</th>
        <th>Suite 3</th>
        <th>Suite 4</th>
        <th>Suite 5</th>
        <th>Suite 6</th>
        <th>Suite 7</th>
        <th>Suite 8</th>
        <th>Suite 9</th>
        <th>Suite 10</th>
      </tr>
      <tr>
        <th>Floor 10</th>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <th>Floor 9</th>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <th>Floor 8</th>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <th>Floor 7</th>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <th>Floor 6</th>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <th>Floor 5</th>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <th>Floor 4</th>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <th>Floor 3</th>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <th>Floor 2</th>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <th>Floor 1</th>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td><button>Book</button></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>        
      </table>
      <button>Book Room</button>
    </div>
  </body>
</html>
