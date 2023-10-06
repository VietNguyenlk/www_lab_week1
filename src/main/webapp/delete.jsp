<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/6/2023
  Time: 11:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            align-items: center;
            background-image: linear-gradient(#33CCFF, pink);

        }
        .del{
            margin-top: 300px;
            margin-left: 400px;
            font-size: 24px;


        }
    </style>
</head>
<body>
<form class="del" action="controllerServlet"  method="post">

        <label> Nhập ID account cần xóa</label>
        <input style="height: 30px" name="id" type="text" placeholder="nhập ID"/>
        <button style="height: 30px" name="action" value="delete_id"> Delete </button>

</form>



</body>
</html>
