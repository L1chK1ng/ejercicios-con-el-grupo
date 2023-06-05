package entidades;

import java.util.Scanner;

public final class YateDeLujo extends BarcoAMotor {

    public Scanner input = new Scanner(System.in).useDelimiter("\n");
    protected Integer numeroCamarotes;

    public YateDeLujo() {

    }

    public YateDeLujo(String matricula, Double eslora, Integer anioFabricacion, Double potenciaCV, Integer numeroCamarotes) {
        super(matricula, eslora, anioFabricacion, potenciaCV);
        this.numeroCamarotes = numeroCamarotes;
    }

    public Integer getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(Integer numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    public YateDeLujo crearYate() {
        System.out.println("----------------------------------------------");
        BarcoAMotor barcoTemp = crearBM();
        System.out.println("Ingrese el numero de camarotes que tiene el Yate");
        int camarotes = input.nextInt();
        return new YateDeLujo(barcoTemp.matricula, barcoTemp.eslora, barcoTemp.anioFabricacion, barcoTemp.potenciaCV, camarotes);
    }

    /*
    Se calcula el modulo del barco multiplicando por diez la eslora en mts,
    mas el atributo particular de este barco
     */
    @Override
    public double moduloBarco() {
        double modulo = super.moduloBarco() + this.potenciaCV + this.numeroCamarotes;
        return modulo;
    }

    @Override
    public String toString() {
        return "Yate de lujo{" +
                "Camarotes=" + numeroCamarotes +
                ", PotenciaCV=" + potenciaCV +
                ", Matricula='" + matricula + '\'' +
                ", Eslora=" + eslora +
                ", Año=" + anioFabricacion +
                '}';
    }
}
