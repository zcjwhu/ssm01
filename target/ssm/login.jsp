<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录</title>
</head>
<body >
<div  style="margin:100px auto;width: 600px;height:400px;background-color: lavender;text-align: center">
    <br>
    <form method="post" action="/doLogin.action">
    <h3>登录</h3>
    <br>
    <br>
    <label>用户名:</label><input type="text" name="username">
    <br> <br>
    <label>密&nbsp;&nbsp;&nbsp;码:</label><input type="password" name="password">
    <br><br> <br>
    <div style="text-align: center">
        <button type="submit">登录</button>&nbsp;&nbsp;
        <button type="reset">重置</button>
        <br>
        <p><a href="register.jsp">还没有帐号？点击这里注册！</a></p>
    </div>
    </form>
</div>
</body>
</html>