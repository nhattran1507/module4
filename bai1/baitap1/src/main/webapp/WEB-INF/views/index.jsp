<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Chuyển đổi USD sang VNĐ</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container mt-5">
    <div class="card">
        <div class="card-header bg-primary text-white text-center">
            <h2>Chuyển đổi USD sang VNĐ</h2>
        </div>
        <div class="card-body">
            <form action="/" method="post">
                <div class="mb-3">
                    <label for="rate" class="form-label">Tỉ giá (VNĐ/USD):</label>
                    <input type="number" id="rate" name="rate" class="form-control" placeholder="Nhập tỉ giá" required />
                </div>
                <div class="mb-3">
                    <label for="usd" class="form-label">Số lượng USD:</label>
                    <input type="number" id="usd" name="usd" class="form-control" placeholder="Nhập số lượng USD" required />
                </div>
                <button type="submit" class="btn btn-success w-100">Chuyển đổi</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
