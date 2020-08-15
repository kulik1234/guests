bar = document.querySelector(".select-bar");
bar.addEventListener("click",(e)=>{
   if(e.target.nodeName == "SPAN")
   {for(b of bar.children)
       b.classList.remove("selected");
   e.target.classList.add("selected");}
});
