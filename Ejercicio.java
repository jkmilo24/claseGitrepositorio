public class Ejercicio {
    float salarioSinAjuste;
    float aumento;
    float salarioConAjuste;
    
    public Ejercicio(float salarioSinAjuste, float aumento, float salarioConAjuste) {
        this.salarioSinAjuste = salarioSinAjuste;
        this.aumento = aumento;
        this.salarioConAjuste = salarioConAjuste;
    }

    public float calcularSalario(){
        if (salarioSinAjuste<1300606) {
            salarioConAjuste=salarioSinAjuste + (aumento * salarioSinAjuste);
        } else {
            salarioConAjuste=salarioSinAjuste;
        }


        return salarioConAjuste;

    }
}