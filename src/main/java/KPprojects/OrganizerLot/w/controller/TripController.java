//package KPprojects.OrganizerLot.w.controller;
//
//
//import KPprojects.OrganizerLot.w.repository.IFlightRepository;
//import KPprojects.OrganizerLot.w.repository.ITripRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
<!doctype html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<title>Lista uzytkownikow</title>
<!-- Required meta tags -->
<meta charset="utf-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous"/>
</head>

<body>
<div class="container">
<table class="table">
<thead>
<th>Login</th>
<th>Imie</th>
<th>Naziwko</th>
<th>Email</th>
<th>Plec</th>
<th>Rola</th>
<th>Edycja</th>
<th>Usun</th>
</thead>
<tbody>
<tr th:each="uzytkownik : ${lista}">
<td th:text="${uzytkownik.name}">admin</td>
<td th:text="${uzytkownik.firstName}">Szymon</td>
<td th:text="${uzytkownik.surname}">Dembek</td>
<td th:text="${uzytkownik.email}">szymon@wp.pl</td>
<td th:if="${uzytkownik.sex != null}" th:text="${uzytkownik.sex.name}">Mezczyzna</td>
<td th:if="${uzytkownik.sex == null}">nieznana</td>
<td th:if="${uzytkownik.mainRole == null}"></td>
<td th:if="${uzytkownik.mainRole != null}" th:text="${uzytkownik.mainRole.name}">jakas rola</td>
<td><a class="btn btn-warning" th:href="@{/myUsers/edit/{userId}(userId=${uzytkownik.id})}">Edycja</a></td>
<td><a class="btn btn-danger" th:href="@{/myUsers/delete/{userId}(status=1,userId=${uzytkownik.id})}">Usun</a></td>
</tr>
</tbody>
</table>
<a class="btn btn-primary" th:href="@{/myUsers/add}">Nowy user</a>
</div>
</body>
</html>
