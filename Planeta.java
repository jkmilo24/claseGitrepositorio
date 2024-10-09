public class Planeta{
    private String nombre;
    private int satelite, diametro, distanciaSol;
    private boolean observable;
    private double masa, volumen, densidad;

    public Planeta (String nombre, int satelite, int diametro, int distanciaSol, double masa, double volumen, double masa, double volumen, boolean observable){
        this.nombre = nombre;
        this.satelite = satelite;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.masa = masa;
        this.volumen = volumen;
        this.observable = observable;
}
    public void DatosPlaneta(){
        System.out.println("Nombre del planeta es: " +this.nombre);
        System.out.println("Cantidad de satelites son : " +this.satelite);
        System.out.println("La masa es: " +this.masa);
        System.out.println("El volumen es: " +this.volumen);
        System.out.println("El diametro es: " +this.diametro);
        System.out.println("La distancia al sol es: " +this.distanciaSol);
        System.out.println("El planeta es observable? : " +this.observable);
    }

    public void calcularDensidad(){
        densidad= this.masa / this.volumen;
        System.out.println("La densidad del planeta es: " +densidad );
    }

    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
        Planeta jupiter = new Planeta("Jupiter", 1, 1.899E27, 1.4313E15, 139820, 750000000, true);

        System.out.println("Los datos de la tierra es: " );
        tierra.DatosPlaneta();
        System.out.println("Los datos de jupiter es: " );
        jupiter.DatosPlaneta();

    }

}