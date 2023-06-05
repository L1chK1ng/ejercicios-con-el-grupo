package entidades;

import java.util.Scanner;

public class Barco {
    public Scanner input = new Scanner(System.in).useDelimiter("\n");
    protected String matricula;
    protected Double eslora;
    protected Integer anioFabricacion;

    public Barco() {

    }

    public Barco(String matricula, Double eslora, Integer anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Barco crearBarco() {
        System.out.println("----------------------------------------------");
        System.out.println("Ingrese la matricula del barco");
        String matricula = input.next();
        System.out.println("Ingrese la longitud del barco (eslora) en metros");
        double eslora = input.nextDouble();
        System.out.println("Ingrese el año de fabricacion del barco");
        int anio = input.nextInt();

        return new Barco(matricula, eslora, anio);
    }

    /*
    Se calcula el modulo del barco multiplicando por diez la eslora en mts
     */
    public double moduloBarco() {
        double modulo = this.eslora * 10;
        return modulo;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "Matricula='" + matricula + '\'' +
                ", Eslora=" + eslora +
                ", Año=" + anioFabricacion +
                '}';
    }
}
