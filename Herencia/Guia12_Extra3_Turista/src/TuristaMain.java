import entidades.Alojamiento;
import entidades.Hotel;
import servicios.Rentas;

import java.util.ArrayList;

public class TuristaMain {
    public static void main(String[] args) {
        Rentas ren1 = new Rentas();
<<<<<<< HEAD
        ArrayList < Alojamiento> listaAlojamiento = new ArrayList<>();
        ArrayList <Hotel> listaH = new ArrayList();
=======
        ArrayList <Alojamiento> listaAlojamiento = new ArrayList<>();
>>>>>>> 53e149c9ce93b016e4f62159f4c940e7f589cd54
        String separador = "-------------------------------------------------------------";

        listaAlojamiento = ren1.hotelDisponible();
        listaH = ren1.ordenarHotel(listaAlojamiento);

        ren1.menuAlojamiento(listaAlojamiento);

        System.out.println(separador);
        System.out.println(listaH);



    }
}
