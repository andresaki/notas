const boton_menu = document.querySelector(".boton-menu")
const menu = document.querySelector(".menu")

boton_menu.addEventListener("click", () => {
    menu.classList.toggle("menu-visible");
})