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
<%--        <input type="hidden" name="action" value="dashboard">--%>
    </form>

<%--    <%--%>
<%--        List<Account> listacc = (List<Account>) request.getAttribute("list");--%>
<%--    %>--%>
<%--    <%--%>
<%--        for(Account item: listacc){--%>
<%--    %>--%>
<%--    <%--%>
<%--        Account item = (Account) request.getAttribute("account");--%>
<%--    %>--%>

<%--    <tr>--%>
<%--        <td><%=item.getId()%></td>--%>
<%--        <td><%=item.getFullName()%></td>--%>
<%--        <td><%=item.getEmail()%></td>--%>
<%--        <td><%=item.getPassWord()%></td>--%>
<%--        <td><%=item.getPhone()%></td>--%>
<%--        <td><%=item.getStatus()%></td>--%>
<%--    </tr>--%>
<%--    <%}%>--%>


</table>

</body>
</html>