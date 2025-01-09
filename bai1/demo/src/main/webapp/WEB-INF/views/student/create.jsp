<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Thêm mới học sinh</title>
</head>
<body>
<h1>Thêm mới học sinh</h1>
<form action="/students/create" method="post">
    Tên: <input type="text" name="name"><br>
    Địa chỉ: <input type="text" name="address"><br>
    Điểm: <input type="number" name="point"><br>
    Lớp: <input type="text" name="className"><br>
    <button type="submit">Lưu</button>
</form>
</body>
</html>
