adjustLoginContainer();
if( !/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent) ) 
window.addEventListener("resize",adjustLoginContainer);
function adjustLoginContainer() {
    siblingHeight = document.querySelector("header .col-s-8").getBoundingClientRect().height;
    document.querySelector("#headerFixing").setAttribute("style","height:"+siblingHeight+"px;");
    loginContainerHeight = adjustContainer();
    document.querySelector("#loginContainer").setAttribute("style","height:"+loginContainerHeight+"px;");
}
