package entidades;

import java.util.Scanner;

public final class Velero extends Barco{
    public Scanner input = new Scanner(System.in).useDelimiter("\n");

    protected Integer cantidadMastil;

    public Velero () {

    }

    public Velero(String matricula, Double eslora, Integer anioFabricacion, Integer cantidadMastil) {
        super(matricula, eslora, anioFabricacion);
        this.cantidadMastil = cantidadMastil;
    }

    public Integer getCantidadMastil() {
        return cantidadMastil;
    }

    public void setCantidadMastil(Integer cantidadMastil) {
        this.cantidadMastil = cantidadMastil;
    }

    public Velero crearVelero() {
        System.out.println("----------------------------------------------");
        Barco barcoTemp = crearBarco();
        System.out.println("Ingrese cuantos mastiles tiene el velero");
        int cantidadMastil = input.nextInt();

        return new Velero(barcoTemp.matricula, barcoTemp.eslora, barcoTemp.anioFabricacion, cantidadMastil);
    }

    /*
    Se calcula el modulo del barco multiplicando por diez la eslora en mts,
    mas el atributo particular de este barco
     */
    @Override
    public double moduloBarco() {
       double modulo = super.moduloBarco() + this.cantidadMastil;
       return modulo;
    }

    @Override
    public String toString() {
        return "Velero{" +
                "Mastiles=" + cantidadMastil +
                ", Matricula='" + matricula + '\'' +
                ", Eslora=" + eslora +
                ", Año=" + anioFabricacion +
                '}';
    }
}
