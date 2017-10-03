<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sample Table</title>
</head>
<body>
 


<table border="1">



<thead>Automation Results

<tr>
	<th>First name</th>
	<th>Last Name</th>
	<th>Middile Name</th>
	<th>Mob No</th>
	
</tr>

<tr>
<% String[] stArray={"bob","riche","jacky","rosy"}; 

for (int j=0;j<10;j++){
	out.print("<tr></tr>");	

 for (int i=0;i<stArray.length;i++){



	out.print("<td>"+stArray[i]+"</td>");
	
	
	}

		

}	 %>
</tr>
	


		
	




</thead>


<tbody>




<!--<tr>
	<td>Ashmy</td>
	<td>David</td>
	<td></td>
	<td>02455678890</td>
</tr>

<tr>
	<td>Nivya</td>
	<td>Varghese</td>
	<td></td>
	<td>0786555678</td>
</tr>

<tr>
	<td>Jees</td>
	<td>Zacharia</td>
	<td></td>
	<td>023459678</td>
</tr>

  -->



</tbody>


</table>










    </body>
</html>  










</body>
</html>