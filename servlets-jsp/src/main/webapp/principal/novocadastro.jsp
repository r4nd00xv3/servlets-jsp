<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
<html lang="en">
<jsp:include page="head.jsp"></jsp:include>
<jsp:include page="theme-loader.jsp"></jsp:include>
 <body>
 <div class="span3 well">
    <form accept-charset="UTF-8" action="" method="post">
		<input class="span3" name="name" placeholder="Full Name" type="text"> 
        <input class="span3" name="username" placeholder="Username" type="text">
        <input class="span3" name="password" placeholder="Password" type="password"> 
        <button class="btn btn-warning" type="submit">Sign up for WebApp</button>
    </form>
</div>
</body>

</html>