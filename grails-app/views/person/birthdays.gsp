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
    <g:each in="${persons}" var="person">
        <div class="personEntry">
            <div class="personText">
                ${person.lastName} ${person.firstName}
            </div>

            <div class="personDate">
                ${person.birthday}
            </div>
        </div>
    </g:each>
</div>
</body>
</html>