<%-- 
    Document   : UserRegistration
    Created on : 08-Apr-2020, 12:53:07 am
    Author     : prasa
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form:form method="post" modelAttribute="userInfo" action="/mavenproject3/app1/UserRegistration/saveUserInfo">
            
         <table>
             <tr>
                 <td colspan="2">
                     <label></label>
                 </td>
             </tr>
            <tr>
               <td><form:label path = "Name">Name</form:label></td>
               <td><form:input path = "Name" /></td>
               <td><form:errors path="Name" cssClass="error" /></td>
            </tr>
            <tr>
               <td><form:label path = "Address">Address</form:label></td>
               <td><form:input path = "Address" /></td>
               <td><form:errors path="Address" cssClass="error" /></td>
            </tr>
            <tr>
               <td><form:label path = "Mobile">Mobile</form:label></td>
               <td><form:input path = "Mobile" /></td>
               <td><form:errors path="Mobile" cssClass="error" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
        </form:form>
    </body>
</html>
