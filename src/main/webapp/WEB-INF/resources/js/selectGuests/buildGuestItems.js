window.onload = () => {
    data = document.querySelector("#data");
    guestContainer = document.querySelector(".guest-container");
    items = data.querySelector("[name=\"guests\"]").querySelectorAll("item");
    for(item of items){
        values = JSON.parse(item.textContent);
        guestContainer.appendChild(newGuestItem(values.name,values.presence));
    }
}