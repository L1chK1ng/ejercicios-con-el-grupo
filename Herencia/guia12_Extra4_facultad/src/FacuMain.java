import entidades.Persona;
import servicios.FacuServices;

import java.util.ArrayList;

public class FacuMain {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersona = new ArrayList();
        FacuServices fc = new FacuServices();

        listaPersona = fc.crearLista();

        fc.menuGral(listaPersona);
    }
}
