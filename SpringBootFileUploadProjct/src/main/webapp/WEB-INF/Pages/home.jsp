<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register Employee</title>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap');

        body {
            font-family: 'Roboto', sans-serif;
            margin: 0;
            padding: 0;
            background-image: url('https://images.unsplash.com/photo-1549921296-3c7b2f5c0b84?auto=format&fit=crop&w=1350&q=80');
            background-size: cover;
            background-position: center;
            height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .container {
            background-color: rgba(255, 255, 255, 0.85);
            padding: 40px;
            border-radius: 12px;
            text-align: center;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
        }

        h1 {
            margin-bottom: 30px;
            color: #333;
        }

        .btn {
            background-color: #4CAF50;
            color: white;
            padding: 15px 30px;
            font-size: 16px;
            border: none;
            border-radius: 6px;
            cursor: pointer;
            transition: background-color 0.3s ease;
            text-decoration: none;
        }

        .btn:hover {
            background-color: #45a049;
        }

        .btn img {
            vertical-align: middle;
            margin-right: 10px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome to Employee Section</h1>
        <a href="reg" class="btn">
            <img src="https://cdn-icons-png.flaticon.com/512/992/992651.png" width="24" height="24" alt="Add Icon">
            Register Now
        </a> <br><br><br>
        <a href="showRec" class="btn">
            <img src="https://cdn-icons-png.flaticon.com/512/992/992659.png" width="24" height="24" alt="Show Records Icon">
            Show Records
        </a>
    </div>
</body>
</html>
