<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Submission Result</title>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Roboto:wght@500&display=swap');

        body {
            font-family: 'Roboto', sans-serif;
            margin: 0;
            padding: 0;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background: linear-gradient(135deg, #c3ec52 0%, #0ba29d 100%);
        }

        .result-box {
            background-color: white;
            padding: 30px 40px;
            border-radius: 12px;
            box-shadow: 0 8px 16px rgba(0,0,0,0.2);
            text-align: center;
        }

        .result-box h2 {
            color: #333;
            margin-bottom: 20px;
        }

        .result-box p {
            font-size: 18px;
            color: #555;
            margin: 8px 0;
        }

        .highlight {
            font-weight: bold;
            color: #2c7a7b;
        }
    </style>
</head>
<body>
    <div class="result-box">
        <h2>Submission Result</h2>
        <p>Final Result: <span class="highlight">${res}</span></p>
        <p>Files Saved: <span class="highlight">${img1}</span>, <span class="highlight">${res1}</span></p>
    </div>
</body>
</html>
