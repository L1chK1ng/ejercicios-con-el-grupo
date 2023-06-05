import entidades.Edificio;
import entidades.Polideportivo;
import service.EdificioService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EdificioService es = new EdificioService();
        ArrayList <Edificio> listaEdif = new ArrayList<>();

        listaEdif = es.crearLista();

        es.muestra(listaEdif);
    }

}