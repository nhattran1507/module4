<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>Chi tiết học sinh</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
        crossorigin="anonymous">
</head>
<body>
<div class="container mt-4">
  <h1>Chi tiết học sinh</h1>
  <table class="table table-bordered">
    <tr>
      <th>Mã số</th>
      <td>${student.code}</td>
    </tr>
    <tr>
      <th>Tên</th>
      <td>${student.name}</td>
    </tr>
    <tr>
      <th>Địa chỉ</th>
      <td>${student.address}</td>
    </tr>
    <tr>
      <th>Điểm</th>
      <td>${student.point}</td>
    </tr>
    <tr>
      <th>Lớp</th>
      <td>${student.className}</td>
    </tr>
  </table>
  <a href="/students" class="btn btn-primary">Quay lại danh sách</a>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>
