<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
   <h1>Submit the Form to See the Result in Alien Page</h1>
   <form action="alienresult"  >
      <table border="1">
       <tr>
           <td style="width:80px">Id</td>
           <td>
               <input type="number"   value="${alien.id}" name="id" style="background:pink;" />
           </td>
       </tr>
       <tr>
           <td>Name</td>
           <td>
               <input type="text" value="${alien.name}" name="name" style="width:100%; background:pink;" />
           </td>
       </tr>
       <tr>
           <td>Gender</td>
           <td>
               <select name="gender" value="${alien.gender}" style="width:100%; background:yellow;">
                   <option value="0" disabled selected>Select Gender</option>
                   <option value="male">Male</option>
                   <option value="female">Female</option>
                   <option value="others">Others</option>
              </select>
           </td>
       </tr>
       <tr>
           <td colspan="2">
               <button style="float:right")>Submit</button>
           </td>
       <tr>
      </table>
   </form>
</body>
</html>