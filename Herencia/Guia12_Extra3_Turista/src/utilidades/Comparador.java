package utilidades;

import entidades.Alojamiento;
import entidades.Hotel;

import java.util.Comparator;

public class Comparador {

    public static Comparator <Hotel> precioDescen = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel h1, Hotel h2) {
            return h2.getPrecioHab().compareTo(h1.getPrecioHab());
        }
    };
}
