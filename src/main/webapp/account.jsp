<%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 9/9/2023
  Time: 2:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="CSS/login.css">
</head>
<body>

<div class="container" id=" container">
    <h1 id="login">LOGIN</h1>

    <div class="form-container sign-in-container">
        <form action="">
            <div>
                 <label for="username" class="title"> User name</label>
                 <input  id="username" name="username" type="text" size="30">
            </div>



            <div>
                <label for="username" class="title"> Password</label>
                <input  id="username" type="password" size="25">
            </div>

             <div>
                <label for="username" class="title"> Email</label>
                <input  id="username" type="email" >
             </div>

             <div>
                <label for="username" class="title"> Phone number</label>
                <input  id="username" type="tel">
             </div>

            <div class="form_submit">
                 <button class="rgister" type="submit">Submit</button>
                  <button class="rgister" type="reset">Reset</button>
            </div>
        </form>
    </div>

</div>


</body>
</html>
