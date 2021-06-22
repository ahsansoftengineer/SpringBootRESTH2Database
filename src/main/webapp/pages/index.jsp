<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <h1> This is my index.jsp File</h1>

    <h3> Which is not working due to servlet </h3>

    <h2>Amazingly it is working now</h2>

    <br />
    <h4>JSTL Format ServletController.java / SessionController.java</h4>
    <a href="#"> ${name}</a>
    <br />
    <h4>Employee Simple Complex Object Printed Here (ModelAndViewController.java)</h4>
    <a href="#"> ${employee.toString()}</a>
    <br />
    <h4>Employee Two Complex Object Printed Here (ModelAndViewController.java)</h4>
    <a href="#"> ${alien.toString()}</a>

</body>
</html>