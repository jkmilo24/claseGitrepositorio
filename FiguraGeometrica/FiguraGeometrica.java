package FiguraGeometrica;
public class FiguraGeometrica{
    float ladoCuadrado;
    float baseTriangulo;
    float alturaTriangulo;
    float radioCirculo;
    int opcionFiguraGeometrica;

    public FiguraGeometrica (float ladoCuadrado, float baseTriangulo, float alturaTriangulo, float radioCirculo, int opcionFiguraGeometrica){
        this.ladoCuadrado = ladoCuadrado;
        this.baseTriangulo = baseTriangulo;
        this.alturaTriangulo = alturaTriangulo;
        this.opcionFiguraGeometrica = opcionFiguraGeometrica;
        
    }

    public void calcularArea(){
        switch (opcionFiguraGeometrica) {
            case 1:
                float areaCuadrado = ladoCuadrado*ladoCuadrado;
                System.out.println("El area del cuadrado es: "+areaCuadrado); 
                break;
            
            case 2:
                float areaTriangulo = baseTriangulo*alturaTriangulo/2;
                System.out.println("El area del triangulo es: "+areaTriangulo);
                break;

            case 3:
            double areaCirculo = Math.PI*radioCirculo*radioCirculo;
            System.out.println("El area del triangulo es: "+areaCirculo);
                break;
            
            default:
                break;
        }

    }   
    

}