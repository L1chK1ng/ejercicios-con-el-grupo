package entidades;

import java.util.Scanner;

public class BarcoAMotor extends Barco {
    public Scanner input = new Scanner(System.in).useDelimiter("\n");

    protected Double potenciaCV;

    public BarcoAMotor() {

    }

    public BarcoAMotor(String matricula, Double eslora, Integer anioFabricacion, Double potenciaCV) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public Double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public BarcoAMotor crearBM() {
        System.out.println("----------------------------------------------");
        Barco barcoTemp = crearBarco();
        System.out.println("Ingrese la potencia del motor (CV) del barco");
        double potencia = input.nextDouble();
        return new BarcoAMotor(barcoTemp.matricula, barcoTemp.eslora, barcoTemp.anioFabricacion, potencia);
    }

    /*
    Se calcula el modulo del barco multiplicando por diez la eslora en mts,
    mas el atributo particular de este barco
     */
    @Override
    public double moduloBarco() {
        double modulo = super.moduloBarco() + potenciaCV;
        return modulo;
    }

    @Override
    public String toString() {
        return "Barco a Motor{" +
                "PotenciaCV=" + potenciaCV +
                ", Matricula='" + matricula + '\'' +
                ", Eslora=" + eslora +
                ", Año=" + anioFabricacion +
                '}';
    }
}
