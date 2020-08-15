const addGuestModule = () => {
    if(module = document.querySelector("#addGuestModule")){
        module.classList.toggle("hidden");
        for(item of module.querySelectorAll(".item-to-add")){
            resetItemToAdd(item);
            module.querySelector("input[name=\"name\"]").focus();
        }
        return true;
    }
    module = document.createElement("div");
    module.setAttribute("id","addGuestModule");
    module.innerHTML = `
    <div id="loginContainer" class="col-s-12 col-md-12 col-12 item-to-add" >
    
            <div class="flexGap"></div>
            <div id="smallLoginContainer">
            <div class="x"><div class="flexGap"></div><div class="click">x</div></div>
                <div class="message"></div>
                <div id="form">
                    <form action="" method="post">    
                    <div>
                            <label>
                                <span>Nazwa: </span><br class="small-device-br"><input type="text" name="guestName">
                            </label>
                        </div>
                        
                        <div>
                            <label>
                                <span>Czy będzie?: </span><br class="small-device-br">
                                        <select name="presence">
                                            <option value="undecided">NIEZDECYDOWANY</option>
                                            <option value="will">BĘDZIE</option>
                                            <option value="wont">NIE BĘDZIE</option>
                                        </select>
                            </label>
                        </div>
                        <div>
                            <button onclick="addGuests()">Dodaj</button>
                        </div>
                        </form>
                </div>
            </div>
            <div class="flexGap"></div>
    </div>
`;
    document.querySelector("#root").appendChild(module);
    module.querySelector("input[name=\"guestName\"]").focus();
    module.addEventListener("keypress",(e)=>{
        if(e.keyCode == 13)
        module.querySelector("button").click();
    });
    module.querySelector(".x").addEventListener("click",() => {
        module.classList.toggle("hidden");
        
    })
    return false;
};
const addGuests = () => {
    items = new Array();
    for(child of document.querySelector("#addGuestModule").querySelectorAll(".item-to-add")){
        let name = child.querySelector("input[name=\"name\"]");
        let presence = child.querySelector("select[name=\"presence\"]");
        if(isGoodName(name.value)){
                  items.push(
                {
                    "name": name.value,
                    "presence": presence.value,
                }    
            );
            goodItem(child);
        }
        else {
            goodItem(child,false);
        }
  
    }
    for(i of items){
    document.querySelector(".guest-container").appendChild(newGuestItem(i.name,i.presence));  
    }
    
}
