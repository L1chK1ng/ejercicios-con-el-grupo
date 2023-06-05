package entidades;

import interfaces.CalculosFormas;

import java.util.Scanner;

public class Circulo implements CalculosFormas {

    private double radio, diametro, perimetro, area;

    public Circulo() {

    }

    public Circulo(double radio, double diametro, double perimetro, double area) {
        this.radio = radio;
        this.diametro = diametro;
        this.perimetro = perimetro;
        this.area = area;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Circulo crearCirculo() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        final double pi = 3.1416;
        System.out.println("Ingrese el radio del circulo");
        double radio = input.nextDouble();
        System.out.println("Ingrese el diametro del circulo");
        double diametro = input.nextDouble();

        double area = calcularArea(pi, radio);
        double perimetro = calcularPerimetro(pi, diametro);

        return new Circulo(radio, diametro, perimetro, area);
    }


    @Override
    public double calcularArea(double pi, double radio) {
        double resultado = pi*radio;
        resultado = Math.pow(resultado, 2);
        return resultado;
    }

    @Override
    public double calcularPerimetro(double pi, double diametro) {
        double resultado = pi*diametro;
        return resultado;
    }
}
