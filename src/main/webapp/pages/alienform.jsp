<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
   <h1>Submit the Form to See the Result in Alien Page</h1>
    <form action="addalien"  >
       <table border="1">
        <tr>
            <td style="width:80px">Id</td>
            <td>
                <input type="number" name="id" style="background:pink;" />
            </td>
        </tr>
        <tr>
            <td>Name</td>
            <td>
                <input type="text" name="name" style="background:pink;" />
            </td>
        </tr>
        <tr>
            <td>Gender</td>
            <td>
                <select name="gender" style="width:100%; background:yellow;">
                    <option value="0" disabled selected>Select Gender</option>
                    <option value="male">Male</option>
                    <option value="female">Female</option>
                    <option value="others">Others</option>
               </select>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <label id="message"> </label>
                <button style="float:right" onclick="return prompt('Are you sure you want to add'")>Submit</button>
            </td>
        <tr>
       </table>
    </form>
</body>
</html>