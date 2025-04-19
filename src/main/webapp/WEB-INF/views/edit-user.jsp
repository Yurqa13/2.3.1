<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Edit User</title>
</head>
<body>
<h2>Edit User</h2>
<form action="update" method="post">
  <input type="hidden" name="id" value="${user.id}">
  Name: <input type="text" name="name" value="${user.name}" required><br>
  Age: <input type="number" name="age" value="${user.age}" required><br>
  Email: <input type="email" name="email" value="${user.email}"><br>
  <input type="submit" value="Update">
</form>
<br>
<a href="${pageContext.request.contextPath}/">Back to list</a>
</body>
</html>