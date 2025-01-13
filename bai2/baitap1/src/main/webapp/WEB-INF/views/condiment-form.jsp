<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 1/11/2025
  Time: 11:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Chọn gia vị</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
  <h2 class="text-center mb-4">Chọn gia vị ăn kèm với Sandwich</h2>
  <form action="/save" method="post" class="border p-4 rounded shadow-sm">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" name="condiment" value="Xà lách" id="lettuce">
      <label class="form-check-label" for="lettuce">Xà lách</label>
    </div>
    <div class="form-check">
      <input class="form-check-input" type="checkbox" name="condiment" value="Cà chua" id="tomato">
      <label class="form-check-label" for="tomato">Cà chua</label>
    </div>
    <div class="form-check">
      <input class="form-check-input" type="checkbox" name="condiment" value="Mù tạt" id="mustard">
      <label class="form-check-label" for="mustard">Mù tạt</label>
    </div>
    <div class="form-check">
      <input class="form-check-input" type="checkbox" name="condiment" value="Mầm cải" id="sprouts">
      <label class="form-check-label" for="sprouts">Mầm cải</label>
    </div>
    <button type="submit" class="btn btn-primary mt-3">Lưu lựa chọn</button>
  </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

