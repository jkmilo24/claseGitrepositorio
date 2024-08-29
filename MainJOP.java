import javax.swing.*;
public class MainJOP {
    public static void main(String[] args){
        String salarioSinAjusteMje= JOptionPane.showInputDialog("Ingrese el salario sin ajustes: ");
        String aumentoMje= JOptionPane.showInputDialog("Ingrese el porcentaje del aumento(si es el 15% ingresar el 0.15): ");
        float salarioSinAjuste = Float.parseFloat(salarioSinAjusteMje);
        float aumento = Float.parseFloat(aumentoMje);
        Ejercicio pruebaJOP = new Ejercicio(salarioSinAjuste, aumento, 0);
        float salarioAjustado= pruebaJOP.calcularSalario();
        JOptionPane.showMessageDialog(null,"El salario con ajuste es " +salarioAjustado);
    }
}
