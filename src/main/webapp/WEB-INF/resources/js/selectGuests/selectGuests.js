gContainer = document.querySelector(".guest-container");
sBar = document.querySelector(".select-bar");
sBar.addEventListener("click",(e)=>{
    sBarList(e.target);
});
function sBarList(target){        
    i = 1;
    if(target.nodeName == "SPAN"){
        data = target.getAttribute("data")
        for(node of gContainer.children){
            classList = node.classList;
            if(classList.contains(data) || data=="all"){
                classList.remove("hidden");
                if(i){
                    classList.remove("bright");
                    classList.add("dark");
                    i = 0;
                }
                else {
                    classList.remove("dark");
                    classList.add("bright");
                    i = 1;
                }
            }
            else {
                classList.add("hidden");
                classList.remove("dark");
                classList.remove("bright");
            }          
        }
    }
}

function adjustGuestsContainer() {
    document.querySelector(".col-12.col-md-12.col-s-12.s-padding0.main-container")
            .setAttribute("style","min-height: " + adjustContainer() + "px;");
}
sBarList(sBar.querySelector(".selected"));
adjustGuestsContainer();
if( !/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent) ) 
window.addEventListener("resize",adjustGuestsContainer);