<%@ taglib uri="/struts-tags" prefix="s" %>
<h3>Please Enter your details here !</br>
</h3>
</br>
</br>
<html><title>Java Guys |  Struts 2+ Spring + Hibernate 3</title>
<body style="{font-family:MS Sans Serif;text-align: center; }">
<center>
<s:form method="post" action="createBean.action">
<s:textfield label="First Name" name="firstName"/>
<s:textfield label="Middle Name" name="middleName"/>
<s:textfield label="Last Name" name="lastName"/>
<s:textfield label="Phone Number" name="phoneNumber"/>
<s:textfield label="Email Id" name="emailId"/>
<s:radio list="{'Male','Female'}" label="Gender" name="gender"></s:radio>
<s:select list="{'Gurgaon','Moradabad','Delhi','Noida'}" name="city" label="City"></s:select>
<s:submit label="Save"></s:submit>
</s:form>
</center>
</body></html>