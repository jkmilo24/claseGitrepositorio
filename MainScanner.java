import java.util.Scanner;
public class MainScanner {
    public static void main(String [] args){
        Scanner sal= new Scanner(System.in);
        System.out.println("Ingese el salario sin ajuste: ");
        float salarioSinAjuste=sal.nextFloat();
        System.out.println("Ingrese el porcentaje del aumento(si es el 15% ingresar 0,15 )");
        float aumento=sal.nextFloat();
        Ejercicio pruebaScanner = new Ejercicio(salarioSinAjuste, aumento, 0);
        float salarioAjustado=pruebaScanner.calcularSalario();
        System.out.println("El salario ajustado es igual a: " + salarioAjustado);
        sal.close();
    }
}
