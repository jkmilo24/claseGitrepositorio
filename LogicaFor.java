import java.util.Scanner;

public class LogicaFor{

  public static void main(String[] args) {
    Scanner jc = new Scanner(System.in);
    
    int contadorPersonas=0, acumuladorEdad=0, acumuladorEstatura=0,
    promedioEdad=0, promedioEstatura=0, procentajeCondicion=0, cantidadPersonas=2;
    
    for (int numeroPersona = 1; numeroPersona <= cantidadPersonas; numeroPersona++) {
        System.out.print("Ingrese la edad de la persona numero: " + numeroPersona );
        int edad= jc.nextInt();
        System.out.print("Ingrese el estado civil de la persona numero: " + numeroPersona + " 1. soltero  2. casado" );
        int estadoCivil= jc.nextInt();
        System.out.print("Ingrese la estatura de la persona numero: " + numeroPersona + " en cm" );
        int estatura= jc.nextInt();
        System.out.print("Ingrese el sexo de la persona numero: " + numeroPersona + " 1. Hombre  2. Mujer" );
        int sexo= jc.nextInt();

        if ((edad>=18)&&(estadoCivil==1 || estadoCivil==2)&&(estatura>170)&&(sexo==1 || sexo==2)) { 
            contadorPersonas=contadorPersonas+1;
            acumuladorEdad = acumuladorEdad + edad;
            acumuladorEstatura = acumuladorEstatura + estatura;

        }
        
    }
    promedioEdad= acumuladorEdad/contadorPersonas;
    promedioEstatura = acumuladorEstatura/contadorPersonas;
    procentajeCondicion = (contadorPersonas/cantidadPersonas)*100;    

    System.out.print("El promedio de edades de las personas con condiciones dadas es de: " + promedioEdad);
    System.out.print("El promedio de estaturas de las personas con condiciones dadas es de: " + promedioEstatura);
    System.out.print("El porcentaje de personas que cumplen con las condiciones dadas es: " + procentajeCondicion);
    }

  }

