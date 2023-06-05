import entidades.Circulo;
import entidades.Rectangulo;

/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Circulo cirService = new Circulo();
        Rectangulo rectService = new Rectangulo();

        Circulo circulo1 = cirService.crearCirculo();
        Rectangulo rectangulo1 = rectService.crearRectangulo();

        System.out.println("Circulo \n" +
                "Radio: " + circulo1.getRadio() + "\n" +
                "Diametro: " + circulo1.getDiametro() + "\n" +
                "Area: " + circulo1.getArea() + "\n" +
                "Perimetro: " + circulo1.getPerimetro() + "\n");

        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Rectangulo \n" +
                "Base: " + rectangulo1.getBase() + "\n" +
                "Altura: " + rectangulo1.getAltura() + "\n" +
                "Area: " + rectangulo1.getArea() + "\n" +
                "Perimetro: " + rectangulo1.getPerimetro() + "\n");

    }
}