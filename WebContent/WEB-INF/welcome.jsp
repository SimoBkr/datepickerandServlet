<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="model.Alldattesformat"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>

<div class="well">
    <table class="table">
      <thead>
        <tr>
        <%
        	Alldattesformat alldattesformat = (Alldattesformat) request.getAttribute("allformat");
        %>
          <th>Simple Date Format : </th>
          <th>Date with month disabled : </th>
          <th>Date with most functionality : </th>
          <th>Date with Min Max</th>
          <th style="width: 36px;"></th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td><%= alldattesformat.getDatesimple() %></td>
          
          <td><%=alldattesformat.getDatewithmonthdisabled() %></td>
          
          <td><%=alldattesformat.getDatepickerallchangeandtwomonth() %></td>
          
           <td><%=alldattesformat.getDatepickermax()%></td>
          
        </tr>
   
      </tbody>
    </table>
</div>

</body>
</html>