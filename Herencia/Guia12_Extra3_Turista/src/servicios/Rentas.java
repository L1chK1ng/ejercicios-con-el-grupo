package servicios;

import entidades.Alojamiento;
import entidades.Hotel4Estrellas;
import entidades.Hotel5Estrellas;

import java.util.ArrayList;
import java.util.Scanner;

public class Rentas {

    public ArrayList<Alojamiento> hotelDisponible() {
        ArrayList<Alojamiento> listaAlojamientos = new ArrayList<>();

        Alojamiento hotel1 = new Hotel4Estrellas("Burro con sueño", "Calle 1", "Barrio antigüo", "Manolo", 40, 70, 10, 50d, false, null, "Glotoneria", 28);
        listaAlojamientos.add(hotel1);
        Alojamiento hotel2 = new Hotel4Estrellas("A dormir", "Calle 4", "Barrio viejo", "Juancito", 80, 140, 20, 50d, true, "Tipo B", "Muertos de hambre", 100);
        listaAlojamientos.add(hotel2);
        Alojamiento hotel3 = new Hotel5Estrellas("Mejor hotel", "Calle 6", "Barrio nuevo", "Diego", 160, 280, 40, 50d, true, "Tipo A", "Like chancho's", 300, 10, 20, 10);
        listaAlojamientos.add(hotel3);
        Alojamiento hotel4 = new Hotel5Estrellas("Top Hotel", "Calle 8", "Barrio top", "Aaron", 320, 560, 80, 50d, true, "Tipo A", "Chancho's Gourmet", 600, 25, 40, 50);
        listaAlojamientos.add(hotel4);

        return listaAlojamientos;
    }

    public void menuAlojamiento(ArrayList<Alojamiento> lista) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String separador = "-----------------------------------------------";
        System.out.println(separador);
        System.out.println("Lista de hoteles disponibles");
        System.out.println(separador);


        int i = 1;
        double total = 0d;
        for (Alojamiento aux : lista) {
            System.out.println(separador);
            if (aux instanceof Hotel5Estrellas) {
                System.out.println(separador);
                System.out.println("Hotel " + i + ": 5 estrellas ");
                System.out.println("Nombre: " + aux.getNombre());
                System.out.println("Direccion: " + aux.getDireccion() + ", " + aux.getLocalidad());
                System.out.println("Gerente encargado: " + aux.getGerenteEnc());
                System.out.println("Cantidad de pisos: " + ((Hotel5Estrellas) aux).getCantPisos() + " pisos");
                System.out.println("Cantidad de habitaciones: " + ((Hotel5Estrellas) aux).getCantHabitaciones() + " habitaciones");
                System.out.println("Numero de camas: " + ((Hotel5Estrellas) aux).getNumCamas() + " camas");
                if (((Hotel5Estrellas) aux).getGym()) {
                    System.out.println("Cuenta con Gimnasio: Si");
                } else {
                    System.out.println("Cuenta con gimnasio: No");
                }
                System.out.println("Nombre del restaurant: " + ((Hotel5Estrellas) aux).getNombRestaurant());
                System.out.println("Capacidad del restaurant: " + ((Hotel5Estrellas) aux).getCapRestaurant() + " personas");
                System.out.println("Cantidad de salones de conferencias: " + ((Hotel5Estrellas) aux).getCantSalonesConf() + " salones");
                System.out.println("Cantidad de Suites: " + ((Hotel5Estrellas) aux).getCantSuites() + " suites");
                System.out.println("Cantidad de limosinas: " + ((Hotel5Estrellas) aux).getCantLimosina() + " limosinas");
                ((Hotel5Estrellas) aux).precioFinal();
                System.out.println("Precio: " + ((Hotel5Estrellas) aux).getPrecioHab() + "$");
            } else if (aux instanceof Hotel4Estrellas) {
                System.out.println(separador);
                System.out.println("Hotel " + i + ": 4 estrellas ");
                System.out.println("Nombre: " + aux.getNombre());
                System.out.println("Direccion: " + aux.getDireccion() + ", " + aux.getLocalidad());
                System.out.println("Gerente encargado: " + aux.getGerenteEnc());
                System.out.println("Cantidad de pisos: " + ((Hotel4Estrellas) aux).getCantPisos() + " pisos");
                System.out.println("Cantidad de habitaciones: " + ((Hotel4Estrellas) aux).getCantHabitaciones() + " habitaciones");
                System.out.println("Numero de camas: " + ((Hotel4Estrellas) aux).getNumCamas() + " camas");
                if (((Hotel4Estrellas) aux).getGym()) {
                    System.out.println("Cuenta con Gimnasio: Si");
                } else {
                    System.out.println("Cuenta con gimnasio: No");
                }
                System.out.println("Nombre del restaurant: " + ((Hotel4Estrellas) aux).getNombRestaurant());
                System.out.println("Capacidad del restaurant: " + ((Hotel4Estrellas) aux).getCapRestaurant() + " personas");
                ((Hotel4Estrellas) aux).precioFinal();
                System.out.println("Precio: " + ((Hotel4Estrellas) aux).getPrecioHab()+ "$");
            }
            i++;
        }
    }
}
