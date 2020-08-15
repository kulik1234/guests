<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pl">
    <head>
        <meta http-equiv="Content-Type"  content="text/html charset=UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Goście</title>
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/def.css">
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/login.css">
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/selectBar.css">
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/selectGuests/selectGuests.css">
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/addGuestModule/addGuestModule.css">
    </head>
    <body>
    <div id="data">
        <group name="guests">
            ${guests}
        </group>
    </div>
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
                <a href="<%=request.getContextPath()%>/logout" style="color:inherit;text-decoration:none;">Wyloguj</a>
            </div>
        </header>
        <div class="col-12 col-md-12 col-s-12 s-padding0 main-container">
            <div style="text-align: center;"><button onclick="addGuestModule()">Dodaj gościa</button></div>
            <div class="col-3 col-md-1"></div>
            <div class="select-bar col-s-12 col-md-10 col-6">
                <span class="selected" data="all">WSZYSCY</span>
                <span data="will">BĘDĄ</span>
                <span data="wont">NIE BĘDĄ</span>
                <span data="undecided">NIEZDECYDOWANI</span>
            </div>
            <div class="col-3 col-md-1"></div>
        
            <div class="col-12 col-md-12 col-s-12 s-padding0">
                <div class="col-2"></div>
                <div class="guest-container col-8 col-md-12 col-s-12">
                </div>
                <div class="col-2"></div>
            </div>
        </div>
        <footer class="col-s-12 col-md-12 col-12">
            <div class="col-s-12 col-md-12 col-12"><span>Powered by BOS</span><br><span>Copyright 2019</span></div>
        </footer>
    </div>
        <div class="fixer hidden"></div>
        <script src="<%=request.getContextPath()%>/resources/js/functions.js"></script>
        <script src="<%=request.getContextPath()%>/resources/js/burger.js"></script>
        <script src="<%=request.getContextPath()%>/resources/js/selectBar.js"></script>
        <script src="<%=request.getContextPath()%>/resources/js/selectGuests/selectGuests.js"></script>
        <script src="<%=request.getContextPath()%>/resources/js/addGuestModule/addGuestModule.js"></script>
        <script src="<%=request.getContextPath()%>/resources/js/selectGuests/buildGuestItems.js"></script>
    </body>
</html>
