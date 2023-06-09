import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;

import java.util.ArrayList;

/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
public class ElectroMain {
    public static void main(String[] args) {
        Lavadora lava = new Lavadora();
        Televisor tv = new Televisor();
        ArrayList <Electrodomestico> listaElectro = new ArrayList();
        double totalTV=0d, totalLava=0d;

        Televisor tv1 = tv.crearTele();
        listaElectro.add(tv1);
        Televisor tv2 = tv.crearTele();
        listaElectro.add(tv2);

        Lavadora lava1 = lava.crearLavadora();
        listaElectro.add(lava1);
        Lavadora lava2 = lava.crearLavadora();
        listaElectro.add(lava2);

        int i =0;
        for (Electrodomestico aux : listaElectro) {
            if (aux instanceof Televisor) {
                totalTV += aux.precioFinal();
            } else if (aux instanceof Lavadora) {
                totalLava += aux.precioFinal();
            }
            System.out.println("Electro " + i + ":" + aux);
        }

        System.out.println("El precio total de los televisores es: " + "$" + totalTV);
        System.out.println("El precio total de las lavadoras es: " + "$" + totalLava);
        System.out.println("El total de todos los electrodomesticos es: " + (totalTV + totalLava));
        
       






    }
}
