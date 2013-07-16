<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<html><title>Java Guys |  Struts 2+ Spring + Hibernate 3</title>
<body style="{font-family:Segoe Print;text-align: center; }">
Congratulations <s:property value="name"/> !</br>
</br>
<table style="font-family: MS Sans Serif;" border="1">
<b></b><tr style="background-color:teal;color: white">
<td>First Name</td>
<td>Middle Name</td>
<td>Last Name</td> 
<td>Phone Number</td>
<td>Email</td>
<td>Gender</td>
<td>City</td></tr></b>
<s:iterator value="studentList">
<tr><td><s:property value="firstName"/></td>
<td><s:property value="middleName"/></td>
<td><s:property value="lastName"/></td>
<td><s:property value="phoneNumber"/></td>
<td><s:property value="emailId"/></td>
<td><s:property value="gender"/></td>
<td><s:property value="city"/></td></tr>
</s:iterator>
</table>
</br>
We have created our Hello World Example !
</br>
Your Details are successfully saved in database !
</body></html>