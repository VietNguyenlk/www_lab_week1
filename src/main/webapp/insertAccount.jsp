<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/6/2023
  Time: 8:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
   .in{
       margin-top: 20px;
       margin-left: 200px;
       width: 500px;
       height: 30px;

   }

</style>
<body>


<%--    <form action="controllerServlet?action=insert_account"  method="post">--%>
<%--        <input type="text" name="id" class="in" placeholder="nhap id"/>--%>
<%--        </br>--%>
<%--        <input type="text" name="name" class="in" placeholder="nhap name"/>--%>
<%--        </br>--%>
<%--        <input  type="password" name="pass" class="in" placeholder="nhap pass"/>--%>
<%--        </br>--%>
<%--        <input type="email" name="email" class="in" placeholder="nhap email "/>--%>
<%--        </br>--%>
<%--        <input type="tel" name="phone" class="in" placeholder="nhap phone"/>--%>

<%--        <button type="submit"> Insert </button>--%>
<%--        --%>
<%--    </form>--%>

<%-- cach 2--%>
<form action="controllerServlet"  method="post">
    <input type="text" name="id" class="in" placeholder="nhap id"/>
    </br>
    <input type="text" name="name" class="in" placeholder="nhap name"/>
    </br>
    <input  type="password" name="pass" class="in" placeholder="nhap pass"/>
    </br>
    <input type="email" name="email" class="in" placeholder="nhap email "/>
    </br>
    <input type="tel" name="phone" class="in" placeholder="nhap phone"/>

    <button name="action" value="insert_account" type="submit"> Insert </button>

</form>

</body>
</html>
