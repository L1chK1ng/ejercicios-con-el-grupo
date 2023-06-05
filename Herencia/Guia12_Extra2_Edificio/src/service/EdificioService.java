package service;

import entidades.EdificioDeOficina;
import entidades.Edificio;
import entidades.Polideportivo;

import java.util.ArrayList;
import java.util.Scanner;

public class EdificioService {

    public Polideportivo crearPolideportivo() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("---------------------------------------------");
        System.out.println("Ingrese el nombre del polideportivo");
        String nombre = input.next();
        System.out.println("Ingrese el ancho del polideportivo");
        double ancho = input.nextDouble();
        System.out.println("Ingrese el largo del polideportivo");
        double largo = input.nextDouble();
        System.out.println("Ingrese el alto del polideportivo");
        double alto = input.nextDouble();

        Character tiene='n';
        boolean techo = false;
        do {
            System.out.println("El polideportivo es techado? S/N");
            tiene = input.next().charAt(0);

            if ((tiene == 's' || tiene == 'S')) {
                techo = true;
            }
        } while ((tiene != 's' && tiene != 'n') && (tiene != 'S' && tiene != 'N'));

        return new Polideportivo(ancho, largo, alto, nombre, techo);
    }

    public EdificioDeOficina crearEdificiOf() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("--------------------------------------------");
        System.out.println("Ingrese el ancho del edificio");
        double ancho = input.nextDouble();
        System.out.println("Ingrese el largo del edificio");
        double largo = input.nextDouble();
        System.out.println("Ingrese el alto del edificio");
        double alto = input.nextDouble();
        System.out.println("Ingrese el numero de pisos del edificio");
        int pisos = input.nextInt();
        System.out.println("Ingrese la cantidad de oficinas por piso");
        int oficinas = input.nextInt();
        System.out.println("Ingrese la cantidad de personas maxima por oficina");
        int personas = input.nextInt();
        return new EdificioDeOficina(ancho, largo, alto, oficinas, personas, pisos);
    }

    public ArrayList <Edificio> crearLista() {
        ArrayList <Edificio> listaEdificaciones = new ArrayList<>();

        //añadiendo 2 polideportivo
        for (int i = 0; i < 2; i++) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Polideportivo " + (i+1));
            Polideportivo politemp = crearPolideportivo();
            listaEdificaciones.add(politemp);
        }

        //añadiendo 2 edificios
        for (int i = 0; i < 2; i++) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Edificio de oficinas " + (i+1));
            EdificioDeOficina edifTemp = crearEdificiOf();
            listaEdificaciones.add(edifTemp);
        }

        return listaEdificaciones;
    }

    /*
    Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
     */
    public void muestra(ArrayList <Edificio> lista) {
        double superficie=0d, volumen=0d;
        int i=1, j=1, personasXPiso=0, personasTotal=0;

        for (Edificio edif : lista) {
            if (edif instanceof Polideportivo) {
                superficie = edif.calcularSuperficie();
                volumen = edif.calcularVolumen();
                System.out.println("Superficie del polideportivo " + i + ": " + superficie);
                System.out.println("Volumen del polideportivo " + i + ": " + volumen);
                if (((Polideportivo) edif).getTechada()) {
                    System.out.println("El polideportivo " + i + ": Es techado");
                } else {
                    System.out.println("El polideportivo " + i + ": No es techado");
                }
                System.out.println("---------------------------------------------------------");
            } else if (edif instanceof EdificioDeOficina) {
                superficie = edif.calcularSuperficie();
                volumen = edif.calcularVolumen();
                personasXPiso = ((EdificioDeOficina) edif).personasPorPiso();
                personasTotal = ((EdificioDeOficina) edif).personasMaxEdificio();
                System.out.println("Superficie del edificio de oficina " + j + ": " + superficie);
                System.out.println("Volumen del edificio de oficina " + j + ": " + volumen);
                System.out.println("Cantidad maxima de personas por piso del edificio " + j + ": " + personasXPiso);
                System.out.println("Cantidad maxima de personas en todo el edificio " + j + ": " + personasTotal);
                System.out.println("--------------------------------------------------------------------");
            }
            i++;
            j++;
        }
    }
}
