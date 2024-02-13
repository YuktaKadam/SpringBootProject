<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body bgcolor="aqua">
	<form:form modelAttribute="employee" method="get" action="/updateandsave">
		<table>
			<tr>
				<td>Emp_ID</td>
				<td>
					<form:hidden path="emp_id" />
				</td>
			</tr>
			
			<tr>
				<td>Emp_Name</td>
				<td>
					<form:input path="emp_name" />
				</td>
			</tr>
			
			<tr>
				<td>Emp_Image</td>
				<td>
					<form:input path="emp_img" />
				</td>
			</tr>
			
			
			<tr>
				<td>Emp_CTC</td>
				<td>
					<form:input path="emp_ctc" />
				</td>
			</tr>
	
			
		
				<td colspan="2">
				   <input type="submit" value="UPDATE">
				</td>
				
			</tr>
			
					
			
		</table>
	</form:form>
</body>