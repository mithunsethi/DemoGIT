<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>adding numbers</title>
</head>
<body>
    <form action="controller" method="post" style="background-color: gree;margin: 20% 200px   ">
         <input type="text" name="num1" placeholder="enter 1st number"> <br>
         <input type="text" name="num2" placeholder="enter 2nd number" > <br>
         <input type="submit" value="add"> <br>
         
         <%
         if(request.getAttribute("adding")!=null || request.getAttribute("num1")!=null ||request.getAttribute("num2")!=null){
         out.println(request.getAttribute("num1")+"+"+request.getAttribute("num2")+"="+request.getAttribute("adding"));
         }
         %>
    </form>
</body>
</html>