<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Servlets JSP Project</title>
</head>
<body>
<h3>SERVLETS JSP PROJECT</h3>
<form action="ServletLogin" method="post">
<input type="hidden" value="<%= request.getParameter("url")%>" name="url">
    	<div class="container" id="formContainer">
            <h3 class="form-signin-heading">Login !</h3>
            <a href="#" id="flipToRecover" class="flipLink">
              <div id="triangle-topright"></div>
            </a>
            <input type="text" class="form-control" name="login"  placeholder="Digite o email">
            <input type="password" class="form-control" name="senha" placeholder="Digite a senha">
            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
          </form>
    

        </div> <!-- /container -->
<h4>${msg}</h4>
</body>
</html>