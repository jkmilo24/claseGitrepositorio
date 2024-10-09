import java.util.Scanner;

public class LogicaNegocio {
    
    public static double calcularIVA(double c){
        double IVA;
        IVA=c*0.19;
        return IVA;
    }
    public static void main(String[] args) {
       
        Scanner jk = new Scanner(System.in);

        double precioDeLaCompra, IVA;

        System.out.println("Ingrese el precio total de la compra: ");
        precioDeLaCompra= jk.nextDouble();

        IVA= calcularIVA(precioDeLaCompra);

        System.out.println("El precio total sin IVA es de: "+precioDeLaCompra);

    }



}
