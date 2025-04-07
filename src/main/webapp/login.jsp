<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>ISE CONNECT - Login</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      background-color: #f8f9fa;
    }
    header {
      background-color: #343a40;
      color: white;
      padding: 1rem 2rem;
    }
    footer {
      background-color: #343a40;
      color: white;
      text-align: center;
      padding: 1rem;
      position: fixed;
      bottom: 0;
      width: 100%;
    }
    .login-form {
      max-width: 400px;
      margin: 4rem auto;
      background-color: white;
      padding: 2rem;
      border-radius: 10px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
  </style>
</head>
<body>

  <!-- Header -->
  <header class="d-flex justify-content-between align-items-center">
    <h4 class="mb-0">ISE CONNECT</h4>
    <span class="text-light">Login</span>
  </header>

  <!-- Login Form -->
  <div class="login-form">
    <h4 class="text-center mb-4">Login to your account</h4>
    <form method="post"action="Login">
      <div class="mb-3">
        <label for="email" class="form-label">Email address</label>
        <input type="email" class="form-control" name="email" placeholder="Enter your email" required>
      </div>
      <div class="mb-4">
        <label for="password" class="form-label">Password</label>
        <input type="password" class="form-control" name="password" placeholder="Enter your password" required>
      </div>
      <div class="d-grid">
        <button type="submit" class="btn btn-primary">Login</button>
      </div>
    </form>
  </div>

  <!-- Footer -->
  <footer>
    &copy; 2025 ISE CONNECT. All rights reserved.
  </footer>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
