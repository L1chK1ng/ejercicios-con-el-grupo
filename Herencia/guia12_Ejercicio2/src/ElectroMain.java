import entidades.Electrodomestico;
import entidades.Lavadora;

public class ElectroMain {
    public static void main(String[] args) {
        Lavadora lava = new Lavadora();

        Lavadora lavadora1 = lava.crearLavadora();
        lava.precioFinal(lavadora1);

        System.out.println(lavadora1.toString());

    }
}
