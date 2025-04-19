<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Add User</title>
</head>
<body>
<h2>Add User</h2>
<form action="add" method="post">
  Name: <input type="text" name="name" required><br><br>
  Email: <input type="email" name="email" required><br><br>
  Age: <input type="number" name="age" required min="1"><br><br>
  <input type="submit" value="Add User">
</form>
<br>
<a href="${pageContext.request.contextPath}/">Back to list</a>
</body>
</html>