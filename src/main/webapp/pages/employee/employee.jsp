<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <h3> ${employee.toString()}</h3>
<table border="1">
        <tr>
            <td style="width:80px">Id</td>
            <td>${employee.id}</td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${employee.name}</td>
        </tr>
        <tr>
            <td>Gender</td>
            <td>${employee.gender}</td>
        </tr>
        <tr>
            <td>Department</td>
            <td>${employee.department}</td>
        </tr>
        <tr>
            <td colspan="2">
               <a href="form" style="float:right">Go back</a>
            </td>
        <tr>
       </table>

</body>
</html>