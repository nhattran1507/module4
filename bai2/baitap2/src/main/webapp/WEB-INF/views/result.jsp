<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 1/13/2025
  Time: 8:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Kết quả</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
  <div class="row justify-content-center">
    <div class="col-md-6">
      <div class="card">
        <div class="card-header bg-primary text-white text-center">
          <h1>Kết quả</h1>
        </div>
        <div class="card-body">
          <h2 class="text-center">${message}</h2>
          <h3 class="text-center">Kết quả: <strong>${result}</strong></h3>
          <c:if test="${not empty error}">
            <p class="text-danger text-center mt-3">${error}</p>
          </c:if>
        </div>
        <div class="card-footer text-center">
          <a href="/" class="btn btn-secondary">Quay lại</a>
        </div>
      </div>
    </div>
  </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
