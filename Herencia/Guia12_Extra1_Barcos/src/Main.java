import entidades.Alquiler;
import entidades.Barco;
import entidades.Velero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
       Alquiler alquiler1 = new Alquiler().nuevoAlquiler();

        double dias = alquiler1.diasOcupacion();
        double totalPrecio = dias * alquiler1.getModuloBarco();

        System.out.println("-------------------------------------------------");
        System.out.println("Nombre del cliente: " + alquiler1.getNombre());
        System.out.println("Documento del cliente: " + alquiler1.getDni());
        System.out.println("Caracteristicas de la embarcacion seleccionada:");
        System.out.println(alquiler1.getEmbarcacion());
        System.out.println("Lugar donde esta la embarcacion: " + alquiler1.getPosicionEmbarque());

        System.out.println("-------------------------------------------------");
        System.out.println("Datos del alquiler");
        alquiler1.mostrarFechaAlquiler();
        alquiler1.mostrarFechaDevolucion();
        System.out.println("dias de ocupacion: " + dias);
        System.out.println("El total a pagar por el alquiler de la embarcacion: " + "$" + totalPrecio);


    }
}