<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>URL Shortener</title>
</head>
<body>
    <h1>URL Shortener</h1>
    <form action="shorten" method="post">
        <label for="longUrl">Enter Long URL:</label>
        <input type="text" id="longUrl" name="longUrl" required>
        <br><br>
        <label for="encodingType">Choose Encoding Type:</label>
        <select id="encodingType" name="encodingType">
            <option value="16">Base-16</option>
            <option value="64">Base-64</option>
            
            
        </select>
        <br><br>
        <button type="submit">Get Short URL</button>
    </form>
</body>
</html>
