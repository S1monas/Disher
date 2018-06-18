<!DOCTYPE html>
<html>
	<head>
	<#include "css/main.css">
		<meta charset="UTF-8">
		<title>Dish Information</title>
	</head>
	<body class="container">
		<#include "templates/header.ftl">
		<table id="customers">
			<th>Dish Information</th>
			<th></th>
				<tr>
					<td><b>Dish ID:</b></td>
					<td>${dish.id}</td>
				</tr>
				<tr>
					<td><b>Dish Group:</b></td>
					<td>${dish.dishgroup}</td>
				</tr>
				<tr>
					<td><b>Dish Name:</b></td>
					<td>${dish.dishname}</td>
				</tr>
				<tr>
					<td><b>Calories:</b></td>
					<td>${dish.calories}</td>
				</tr>
				<tr>
					<td><b>Price:</b></td>
					<td>${dish.price}</td>
				</tr>
			</table>
		</div>
		<br>
		<a type="button" href="/Disher/dishes" class="button">Back</a>
	</body>
</html>
