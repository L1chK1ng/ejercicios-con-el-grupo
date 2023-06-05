package entidades;

import java.util.Scanner;

public final class Polideportivo extends Edificio {

    private String nombre;
    private Boolean techada;

    public Polideportivo(Double ancho, Double largo, Double alto, String nombre, Boolean techada) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.techada = techada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getTechada() {
        return techada;
    }

    public void setTechada(Boolean techada) {
        this.techada = techada;
    }

    public Polideportivo crearPolideportivo() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("---------------------------------------------");
        System.out.println("Ingrese el nombre del polideportivo");
        String nombre = input.next();
        System.out.println("Ingrese el ancho del polideportivo");
        double ancho = input.nextDouble();
        System.out.println("Ingrese el largo del polideportivo");
        double largo = input.nextDouble();
        System.out.println("Ingrese el alto del polideportivo");
        double alto = input.nextDouble();

        Character tiene='n';
        boolean techo = false;
        do {
            System.out.println("El polideportivo es techado? S/N");
            tiene = input.next().charAt(0);

            if ((tiene.equals('s') || tiene.equals('S'))) {
                techo = true;
            }
        } while (!((tiene.equals('s') || tiene.equals('S')) && ((tiene.equals('n') || tiene.equals('N')))));

        return new Polideportivo(ancho, largo, alto, nombre, techo);
    }

    @Override
    public double calcularSuperficie() {
        double superficie = this.largo * this.ancho;
        return superficie;
    }

    @Override
    public double calcularVolumen() {
        double volumen = this.largo * this.ancho * this.alto;
        return volumen;
    }

}
