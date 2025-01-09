<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Tra cứu từ điển Anh - Việt</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container mt-5">
  <div class="card mx-auto" style="max-width: 500px;">
    <div class="card-header bg-primary text-white text-center">
      <h2>Tra cứu từ điển Anh - Việt</h2>
    </div>
    <div class="card-body">
      <form action="/translate" method="get">
        <div class="mb-3">
          <label for="word" class="form-label">Nhập từ tiếng Anh:</label>
          <input type="text" id="word" name="word" class="form-control" placeholder="Nhập từ..." required />
        </div>
        <button type="submit" class="btn btn-success w-100">Tra cứu</button>
      </form>
    </div>
  </div>
</div>
</body>
</html>
