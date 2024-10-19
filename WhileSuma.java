import java.util.Scanner;


public class WhileSuma {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int numerosNaturalesAsumar = 0, acu = 1, sumaNumerosNaturales = 0, n;

        System.out.println("Cuanto numeros deseas sumar: ");
        n = tecla.nextInt();
        while (acu < n) {
            System.out.println("Dame un numero: ");
            numerosNaturalesAsumar = tecla.nextInt();
            sumaNumerosNaturales = sumaNumerosNaturales + numerosNaturalesAsumar;
            acu=acu+1;
        }

        System.out.println(" El resultado es " + sumaNumerosNaturales);
        tecla.close();
    }
}