<%@page contentType="text/html" pageEncoding="UTF-8"%><!DOCTYPE html>
<html lang="pl">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Logowanie</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/def.css" >
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/login.css" >
</head>
<body>
    <div id="root">
        <header class="col-s-12 col-md-12 col-12">
            <div id="headerFixing" class="col-s-2 col-md-2">
                <div class="burger-container">
                    <div class="flexGap"></div>
                        <div class="burger">
                            <div></div>
                            <div></div>
                            <div></div>
                        </div>
                    <div class="flexGap"></div>
                </div>
                <div class="burger-menu hidden">
                    <div class="flex max-height">
                        <div class="burger-menu-container hidden-menu">
                            <div class="x"><div class="flexGap"></div><div class="click">x</div></div>
                            <div class="menu-burger-item"><span>item</span></div>
                        </div>
                        <div class="hidden-transparent-grey transparent-grey"></div>
                    </div>
                </div>
            </div>

            <div class="col-s-8 col-md-8">
                <span> <a href="<%=request.getContextPath()%>/" style="color:inherit;text-decoration:none;">Guests</a></span>
            </div>
            <div class="col-s-2 col-md-2">

            </div>
        </header>
        <div id="loginContainer" class="col-s-12 col-md-12 col-12" >
            <div class="flexGap"></div>
            <div id="smallLoginContainer">
                <h3><span>Logowanie</span></h3>
                <div class="bad-message" id="message"><span>${dupa}${kupa}</span></div>
                <div id="form">
                    <form action="<%=request.getContextPath()%>/login" method="post">
                        <div>
                            <label>
                                <span>Login: </span><br class="small-device-br"><input type="text" name="ssoId" autocomplete="off">
                            </label>
                        </div>
                        <div>
                            <label>
                                <span>Hasło: </span><br class="small-device-br"><input type="password" name="password" autocomplete="off">
                            </label>
                        </div>
                        <div>
                            <button>Zaloguj</button>
                        </div>
                    </form>
                </div>
               <div class="big-space col-s-12"></div>
            </div>
            <div class="flexGap"></div>
        </div>
        <footer class="col-s-12 col-md-12 col-12">
            <div class="col-s-12 col-md-12 col-12"><span>Powered by BOS</span><br><span>Copyright 2019</span></div>
        </footer>
    </div>
    <div class="fixer hidden"></div>
	<script src="<%=request.getContextPath()%>/resources/js/functions.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/screenHeight.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/burger.js"></script>
</body>
</html>
