<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/22
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <a href="/user/getRequestParam?name=沙漠之雕">[跳转到]</a><br>
        <a href="/user/testPathVariable/10">[测试占位符]</a><br>
        <a href="/user/testRequestHeader">[测试请求头]</a><br>
        <a href="/user/testCookieValue">[测试cookie]</a><br>
        <a href="/user/addParam">[保存至session中]</a>

</body>
</html>
