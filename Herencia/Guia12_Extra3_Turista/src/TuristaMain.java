import entidades.Alojamiento;
import entidades.Hotel;
import servicios.Rentas;

import java.util.ArrayList;

public class TuristaMain {
    public static void main(String[] args) {
        Rentas ren1 = new Rentas();
        ArrayList < Alojamiento> listaAlojamiento = new ArrayList<>();
        ArrayList <Hotel> listaH = new ArrayList();
        String separador = "-------------------------------------------------------------";

        listaAlojamiento = ren1.hotelDisponible();
        listaH = ren1.ordenarHotel(listaAlojamiento);

        ren1.menuAlojamiento(listaAlojamiento);

        System.out.println(separador);
        System.out.println(listaH);



    }
}
