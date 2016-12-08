<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="gb2312">
    <title>注册</title>
    <script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            //请求json,输出json
            $("#zhuce").click(function () {
                $.ajax({
                    type:'post',
                    url:'${pageContext.request.contextPath}/doRegist.action',
                    //这里设置contentType为json
                    contentType:'application/json;charset=utf-8',
                    //数据格式时json串
                    data:'{"username":"zcj","password":"admin","repeatpwd":"admin"}',
                    success:function (result) {
                        alert(result)
                    },
                    error:function (result) {

                    }
                });
            });
            //请求key-value,输出json
            $("#regist").click(function () {
                $.ajax({
                    type:'post',
                    url:'${pageContext.request.contextPath}/doRegist.action',
                    //这里设置contentType为不需要设置，默认就好
                    //数据格式为key-value
                    data:'username=zcj&password=admin&repeatpwd=admin',
                    success:function (result) {
                        alert(result.username);
                    },
                    error:function (result) {

                    }
                });
            });


        });
    </script>
</head>
<body >
<div  style="margin:100px auto;width: 600px;height:400px;background-color: lavender;text-align: center">
    <br>
    <h3>注册</h3>
    <br>
    <br>
    <label>用户名:</label><input id="username" type="text">
    <br> <br>
    <label>密&nbsp;&nbsp;&nbsp;码:</label><input id="password" type="password">
    <br> <br>
    <label>确认密码:</label><input id="repeatpwd" type="password">
    <br><br>
    <div style="text-align: center">
        <button id="zhuce">注册</button>&nbsp;&nbsp;
        <button id="regist">注册1</button>&nbsp;&nbsp;
    </div>
</div>
</body>
</html>