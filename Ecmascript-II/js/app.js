 /*function buscar() {
        console.log("click");
        var textoBusqueda = document.getElementById("texto").textContent;
        if (textoBusqueda != "") {
            var elementos = document.querySelectorAll("div[class=\"well\"] > p");
            for (elemento of elementos) {
                console.log(elemento.textContent);
                if (elemento.textContent.indexOf(textoBusqueda) <= -1) {
                    elemento.disabled = true;
                    console.log(textoBusqueda);

                }

            }

        }
 }

document.getElementById("buscar").onclick = buscar();*/


(function () {
    function habilitar(){
         var elementos = document.querySelectorAll("div[class=\"well\"]");
            for (elemento of elementos) {
                elemento.style.display="block";
            }

    }
  function buscar() {
        habilitar();
        var textoBusqueda = document.getElementById("texto").value;
        if (textoBusqueda != "") {
            var elementos = document.querySelectorAll("div[class=\"well\"] > p");
            for (elemento of elementos) {
                
                if (elemento.textContent.search(textoBusqueda) > -1) {
                   
                     console.log(elemento.textContent);
                    console.log(textoBusqueda);

                }
                else{
                     elemento.parentNode.style.display = "none";
                     console.log("none");
                    //console.log(elemento.textContent);

                }

            }

        }

    }

    document.getElementById("buscar").onclick = buscar;



})();