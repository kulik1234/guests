var ifItemDark = true;
function adjustContainer() {
    if( !/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent) ) 
   screenHeight = window.innerHeight;
   else 
       screenHeight = window.outerHeight;
    headerHeight = document.querySelector("header").getBoundingClientRect().height;
    footerHeight = document.querySelector("footer").getBoundingClientRect().height;
    return(parseInt(screenHeight - headerHeight - footerHeight));
}
function newGuestItem(name,presence){
    item = document.createElement("div");
    item.classList.add("guest-item",presence,ifItemDark?"dark":"bright");
    ifItemDark = !ifItemDark;
    item.appendChild(child = document.createElement("div"));
    child.classList.add("pointer-dot");
    child.setAttribute("title","Wskaźnik który mówi o obecności");
    item.appendChild(document.createTextNode(name));
    return item;
}
function isGoodName(name){
    reg = new RegExp("^[A-Za-z ]{3,}$");
    return reg.test(name);
}
function resetItemToAdd(item){
    item.classList.remove("good","wrong");
    item.querySelector(".message").innerText = "";
}
function goodItem(item,bool = true){
    if(bool){
        item.querySelector(".message").innerText = "Dodano Gościa";
        item.classList.remove("wrong");
        item.classList.add("good");
        item.querySelector("input[name=\"name\"]").value = "";
        item.querySelector("input[name=\"name\"]").focus();
    }
    else {
        item.classList.add("wrong");
        item.classList.remove("good");
        item.querySelector(".message").innerText = "Podano złą nazwę";
    }
}