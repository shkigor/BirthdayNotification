<%--
  Created by IntelliJ IDEA.
  User: igor
  Date: 3/2/16
  Time: 10:30 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Today birthdays</title>
</head>

<body>
<h1>Именинники сегодня:</h1>

<g:if test="${flash.message}">
    <div class="flash">
        ${flash.message}
    </div>
</g:if>

<div id="allBirthdays">
    <g:each in="${users}" var="user">
        <div class="userEntry">
            <div class="postText">
                ${user.firstName}
            </div>

            <div class="userDate">
                ${user.birthday}
            </div>
        </div>
    </g:each>
</div>
</body>
</html>