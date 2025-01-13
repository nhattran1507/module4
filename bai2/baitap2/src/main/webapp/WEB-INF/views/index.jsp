<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 1/13/2025
  Time: 8:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Máy tính cá nhân</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <h1 class="text-center mb-4">Máy tính cá nhân</h1>
            <form action="/calculate" method="get" class="p-4 border rounded bg-light">
                <div class="mb-3">
                    <label for="num1" class="form-label">Số thứ nhất:</label>
                    <input type="number" name="num1" id="num1" class="form-control" required>
                </div>
                <div class="mb-3">
                    <label for="num2" class="form-label">Số thứ hai:</label>
                    <input type="number" name="num2" id="num2" class="form-control" required>
                </div>
                <div class="mb-3">
                    <label for="operator" class="form-label">Phép tính:</label>
                    <select name="operator" id="operator" class="form-select" required>
                        <option value="add">Cộng</option>
                        <option value="subtract">Trừ</option>
                        <option value="multiply">Nhân</option>
                        <option value="divide">Chia</option>
                    </select>
                </div>
                <div class="d-grid">
                    <button type="submit" class="btn btn-primary">Tính toán</button>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

