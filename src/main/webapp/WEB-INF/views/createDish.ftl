<#import "templates/spring.ftl" as spring />
<!DOCTYPE html>
<html>
	<head>
	<#include "css/main.css">
		<meta charset="UTF-8">
		<title>New Dish</title>
	</head>
	<body class="container">
	<#include "templates/header.ftl">
		<@spring.bind "dish"/>
        <#if noErrors??>
            Dishes<br>
            Dish Group: 		${dish.dishgroup}<br>
            Dish Name: 	${dish.dishname}<br>
            Calories: 			${dish.calories}<br>
            Price: 			${dish.price}<br>
            <a href="/Disher/dishes" class="button">Show dishes</a>
        <#else>		
			<form name="dishes" action="/Disher/addDish" 	method="post">
				Dish Group:<br>
				<@spring.formInput "dish.dishgroup"/>
                <@spring.showErrors "<br>"/><p>
                 Dish Name:<br>
				<@spring.formInput "dish.dishname"/>
                <@spring.showErrors "<br>"/><p>
                Calories:<br>
				<@spring.formInput "dish.calories"/>
                <@spring.showErrors "<br>"/><p>
                Price:<br>
				<@spring.formInput "dish.price"/>
                <@spring.showErrors "<br>"/><p>
                <br>
				<input type="submit" value="Add">
			</form>
		</#if>
	</body>
</html>
