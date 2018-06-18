<!DOCTYPE html>
<html>
	<head>
	<#include "css/main.css">
		<meta charset="UTF-8">
		<title>Dishes</title>
	</head>
	<body class="container">
	<#include "templates/header.ftl">
		<table id="customers">
			<tr>
				<th>Dish ID</th>
				<th>Dish Group</th>
				<th>Dish Name</th>
				<th>Calories</th>
				<th>Price</th>
				<th>Delete</th>
				<th>Update</th>
			</tr>
			<#list dishes as dish>
				<tr>
					<td><a href="/Disher/dish/${dish.id}">${dish.id}</a></td>
					<td>${dish.dishgroup}</td>
					<td>${dish.dishname}</td>
					<td>${dish.calories}</td>
					<td>${dish.price}</td>
					<td><a href="/Disher/delete/${dish.id}" class="button">Delete</a></td>
					<td><a href="/Disher/update/${dish.id}" class="button">Update</a></td>
				</tr>
			</#list>
		</table>
		<br>
		<a href="/Disher/addDish" class="button">Add</a>
	</body>
</html>
