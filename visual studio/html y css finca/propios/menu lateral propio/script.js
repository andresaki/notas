const boton_menu = document.getElementById("boton-menu")
const menu = document.getElementById("menu")
const body = document.getElementById("body")


boton_menu.addEventListener("click", () => {
    body.classList.toggle("body_move");
    menu.classList.toggle("menu_move")
})