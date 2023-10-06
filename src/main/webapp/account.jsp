
<%--<!DOCTYPE html>--%>
<%--<html lang="en">--%>
<%--<head>--%>
<%--    <meta charset="UTF-8">--%>
<%--    <meta name="viewport" content="width=device-width, initial-scale=1.0">--%>
<%--    <title>Document</title>--%>
<%--    <link rel="stylesheet" href="CSS/login.css">--%>


<%--</head>--%>
<%--<body>--%>
<%--<div class="container" id=" container">--%>
<%--    <h1 id="login">LOGIN</h1>--%>

<%--    <div class="form-container sign-in-container">--%>
<%--        <form action="logincontrol" method="post">--%>
<%--    </div>--%>
<%--    <label for="username" class="title"> User name</label>--%>
<%--    <input  id="username" name="username" type="text" size="30">--%>
<%--    <div>--%>


<%--    </div>--%>
<%--    <label for="username" class="title"> Password</label>--%>
<%--    <input  id="username" type="password" name="password" size="25">--%>
<%--    <div>--%>



<%--        <div class="form_submit">--%>
<%--            <button class="rgister" type="submit" value="login">Submit</button>--%>
<%--            <button class="rgister" type="reset">Reset</button>--%>
<%--        </div>--%>


<%--        </form>--%>
<%--    </div>--%>



<%--</div>--%>


<%--<div>--%>

<%--</div>--%>


<%--</body>--%>
<%--</html>--%>

<%@ page import="vn.edu.iuh.fit.models.Account" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        table {
            border-collapse: collapse;
            width: 80%;
            color: #333;
            font-family: Arial, sans-serif;
            font-size: 18px;
            text-align: center;
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            margin: auto;
            margin-top: 50px;
            margin-bottom: 50px;
            background-color: aqua;
        }

        table tr:nth-child(even) td {
            background-color: #f2f2f2;
        }

        table tr:hover td {
            background-color: #ffedcc;
        }
    </style>
</head>
<body>

<table>
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Password</td>
        <td>Email</td>
        <td>Phone</td>
        <td>Status</td>
    </tr>

    <form action="controllerServlet" method="get">
        <button name="action" value="dashboard" type="submit" class="btn btn-primary">Show</button>

    </form>



</table>

<%--fadf--%>

</body>
</html>




