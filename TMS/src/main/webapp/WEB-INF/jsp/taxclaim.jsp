


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body style="background-color:lavender">
<h1><center> Tax: Tax Claim </center></h1>

<a href="/getTaxClaimFormPage?language=en">English</a>|<a href="/getTaxClaimFormPage?language=de">German</a>|<a href="/getTaxClaimFormPage?language=fr">French</a></align>

<form:form>
	               

<table>
              
<tr><td id="id1"></td><td id="id2"></td><td id="id3"></td></tr>
				
 <tr><td id="id4"></td><td id="id5"></td><td id="id6"></td></tr>
<tr><td id="id7"></td><td id="id8"></td><td id=id9></td></tr>
<tr><td><input type="Submit" name="submit" value="Calculate Claim"/></td><td></td></tr>
<tr><td><input type="reset" name="reset" value="Clear"/></td><td></td></tr>				
</table>
</form:form>


</body>
</html>