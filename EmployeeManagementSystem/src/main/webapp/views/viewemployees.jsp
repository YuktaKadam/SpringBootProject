<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<table align="center" border="1" cell-spacing="10px" cell-padding="10px">
 <tr>
  <th>emp_id</th>
  <th>emp_name</th>
  <th>emp_img</th>
  <th>emp_ctc</th>
  <th>basic_sal</th>
  <th>pf</th>
  <th>allowances</th>
  <th>tds</th>
  <th>prof_tax</th>
  <th>net_sal</th>
  <th>Edit</th>
  <th>Delete</th>
 </tr>
 
 <c:forEach var="employee" items="${employees}">
 <tr>
  <td>${employee.emp_id}</td>
  <td>${employee.emp_name}</td>
  <td>
   <img src=${employee.emp_img} alt="error" width="50px">
  </td>
  <td>${employee.emp_ctc}</td>
  <td>${employee.basic_sal}</td>
  <td>${employee.pf}</td>
<td>${employee.allowances}</td>
  <td>${employee.tds}</td>
  <td>${employee.prof_tax}</td>
  <td>${employee.net_sal}</td>
  <td>
   <a href="/editemp/${employee.emp_id}">Edit</a>
  </td>
  <td>
   <a href="/deletemp/${employee.emp_id}">Delete</a>
  </td>
  </tr>
 </c:forEach>
 </table>