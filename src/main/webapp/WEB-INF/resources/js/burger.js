burgers = document.querySelectorAll(".burger-container");
burgerMenu = document.querySelector(".burger-menu");
burgerMenuContainer = document.querySelector(".burger-menu-container");
burgerMenuTransparentGrey = document.querySelector(".transparent-grey");

document.querySelector(".transparent-grey").addEventListener("click",toggleBurger);
for(burger of burgers){
    burger.addEventListener("click",toggleBurger);
    
}
function toggleBurger(){
    document.querySelector(".fixer").classList.toggle("hidden");
    if(!burgerMenu.classList.contains("hidden"))
    {
        setTimeout(()=>burgerMenu.classList.toggle("hidden"),1000);
        burgerMenuContainer.classList.toggle("hidden-menu");
        burgerMenuTransparentGrey.classList.toggle("hidden-transparent-grey");
    }
    else
    {
        burgerMenu.classList.toggle("hidden");
        setTimeout(()=>{burgerMenuContainer.classList.toggle("hidden-menu");
        burgerMenuTransparentGrey.classList.toggle("hidden-transparent-grey");},50);
    }
    setTimeout(()=>document.querySelector(".fixer").classList.toggle("hidden"),1000);
}
document.querySelector(".x .click").addEventListener("click",toggleBurger);