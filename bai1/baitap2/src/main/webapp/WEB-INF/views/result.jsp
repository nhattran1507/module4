<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Kết quả tra cứu</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container mt-5">
  <div class="card mx-auto" style="max-width: 500px;">
    <div class="card-header bg-success text-white text-center">
      <h2>Kết quả tra cứu</h2>
    </div>
    <div class="card-body">
      <c:choose>
        <c:when test="${not empty translation}">
          <p class="fs-4 text-center">Từ: <strong>${word}</strong></p>
          <p class="fs-5 text-center">Nghĩa: <strong>${translation}</strong></p>
        </c:when>
        <c:otherwise>
          <p class="text-danger text-center fs-5">${error}</p>
        </c:otherwise>
      </c:choose>
    </div>
    <div class="card-footer text-center">
      <a href="/" class="btn btn-primary">Quay lại</a>
    </div>
  </div>
</div>
</body>
</html>
