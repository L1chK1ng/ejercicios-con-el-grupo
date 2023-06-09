import entidades.Alojamiento;
import entidades.Hotel;
import servicios.Rentas;

import java.util.ArrayList;

public class TuristaMain {
    public static void main(String[] args) {
        Rentas ren1 = new Rentas();
        ArrayList <Alojamiento> listaAlojamiento = new ArrayList<>();
        String separador = "-------------------------------------------------------------";

        listaAlojamiento = ren1.hotelDisponible();

        ren1.menuAlojamiento(listaAlojamiento);

    }
}
