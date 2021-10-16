let id = document.getElementById("id");
let idSent = document.getElementById("idSent");

id.addEventListener("input", toSent);
// idSent.onclick = function(){id.value = ""} 

function toSent() {
    idSent.setAttribute("action", "/consultar/"+id.value)
}