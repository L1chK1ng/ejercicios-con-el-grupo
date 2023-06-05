package entidades;

import interfaces.CalculosFormas;

import java.util.Scanner;

public class Rectangulo implements CalculosFormas {

    private double base, altura, area, perimetro;

    public Rectangulo() {

    }

    public Rectangulo(double base, double altura, double area, double perimetro) {
        this.base = base;
        this.altura = altura;
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public Rectangulo crearRectangulo() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la base del rectangulo");
        double base = input.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        double altura = input.nextDouble();

        double area = calcularArea(base, altura);
        double perimetro = calcularPerimetro(base, altura);

        return new Rectangulo(base, altura, area, perimetro);
    }


    @Override
    public double calcularArea(double base, double altura) {
        double resultado = base * altura;
        return resultado;
    }

    @Override
    public double calcularPerimetro(double base, double altura) {
        double resultado = (base + altura) * 2;
        return resultado;
    }
}
