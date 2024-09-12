var salarioSinAjuste, porcentajeAumento, salarioConAjuste;
salarioSinAjuste=parseFloat(prompt("Ingrese su salario Actual: "));
porcentajeAumento=parseFloat(prompt("Ingrese el porcentaje a aumentar: "));
if (salarioSinAjuste<1300606) {
    salarioConAjuste= salarioConAjuste+(salarioSinAjuste*porcentajeAumento);
} else {
    salarioConAjuste= salarioSinAjuste;
}

alert ("su salario con ajuste es: " +salarioConAjuste)