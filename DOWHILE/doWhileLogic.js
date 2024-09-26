var numeroEntrada=0, factorial=1, opcion;
do {
    opcion=parseInt(prompt("Elija la opcion que desea realizar: 1: Calcular Factorial  2. Determinar si es par"));
    switch (opcion) {
        case 1:
            numeroEntrada=parseInt(prompt("Ingrese el número al que le desea calcular el factorial"));
            for (let i = 1; i <= numeroEntrada; i++){
                factorial=factorial*i
                
          }
          alert(factorial + " es el factorial de " + numeroEntrada);
          factorial=1
            break;
        case 2:
            numeroEntrada=parseInt(prompt("Ingrese el número que quiere verificar si es par"));
            if ((numeroEntrada%2)==0) {
                alert(numeroEntrada + " es par");
            } else {
               alert(numeroEntrada + " es impar"); 
            }
            break;


            
    }

} while (opcion != 3); 