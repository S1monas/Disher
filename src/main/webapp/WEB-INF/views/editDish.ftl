<!DOCTYPE html>
<html>
	<head>
	<#include "css/main.css">
		<meta charset="UTF-8">
		<title>Dish Update</title>
	</head>
	<body class="container">
	<#include "templates/header.ftl">
		<form name="dish" action="/Disher/updateDish" method="post">
			<input placeholder="Dish ID"     		 type="text"   	name="id"  		value="${dish.id}"><p>
			<input placeholder="Dish Group"    	 type="text"   	name="dishgroup"  		value="${dish.dishgroup}"><p>
			<input placeholder="Dish Name"					 type="text"   	name="dishname" 		value="${dish.dishname}"><p>
			<input placeholder="Calories"     			 type="text" 	name="calories"   	value="${dish.calories}"><p>
			<input placeholder="Price"     			     type="text"   	name="price"  		value="${dish.price}"><p>
			<input type="submit" value="Update">
		</form>
	</body>
</html>
