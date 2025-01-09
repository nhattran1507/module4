<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Cập nhật học sinh</title>
</head>
<body>
<h1>Cập nhật học sinh</h1>
<form action="/students/edit" method="post">
    <input type="hidden" name="code" value="${student.code}">
    Tên: <input type="text" name="name" value="${student.name}"><br>
    Địa chỉ: <input type="text" name="address" value="${student.address}"><br>
    Điểm: <input type="number" name="point" value="${student.point}"><br>
    Lớp: <input type="text" name="className" value="${student.className}"><br>
    <button type="submit">Cập nhật</button>
</form>
</body>
</html>
