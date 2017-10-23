<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" 
              integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <link rel="stylesheet" href="../Web_Pages/stylescss/Body/login.css">
        <title>Inicio</title>
    </head>
    <body class="home">

        <header>
            <h1 id="title">Sistema de Llamados Techmedic S.A.S</h1>
        </header>  

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            
            <a class="navbar-brand" href="#">techMedic</a>
    
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="#">Inicio</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../views/registro.jsp">Registro</a>
                    </li>
                </ul>    
            </div>
        </nav>
        <c:if test="${param.error!= null}">
            <span style="color:red;">¡Error de credenciales<span/>
	</c:if>
        <div class="container">
            <div class="row">
                <div class="col-sm-6 col-md-4 col-md-offset-4">
                    <h1 class="text-center login-title">Ingrese su usuario y contraseña</h1>
                    <div class="account-wall">
                        <img class="profile-img" src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=120" alt="">
                        <form name='f' action="j_spring_security_check" method='POST' class="form-signin">
                            <input type="text" name="usuario" class="form-control" placeholder="Usuario" required autofocus>
                            <input type="password" name="clave" class="form-control" placeholder="Contraseña" required>
                            <button class="btn btn-lg btn-primary btn-block" type="submit">Accesar</button>
                            <label class="checkbox pull-left">
                                <input type="checkbox" value="Recordar" name="_spring_security_remember_me" checked="checked">Remember me
                            </label>
                            <a href="#" class="pull-right need-help">Need help? </a><span class="clearfix"></span>
                        </form>
                    </div>
                    <a href="#" class="text-center new-account">Create an account </a>
                 </div>
            </div>
        </div>
    </body>

</html>
