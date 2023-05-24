package service;

import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ilich Dell
 */
public class CineService {

    public Scanner input = new Scanner(System.in).useDelimiter("\n");
    public ArrayList<Espectador> listaSpect = new ArrayList();

    public Cine creacionCine() {
        System.out.println("Ingrese la pelicula que se reproducira ahora");
        String pelicula = input.next();
        System.out.println("Ingrese el precio de la entrada");
        Double precio = input.nextDouble();
        String[][] sala = new String[8][6];

        return new Cine(pelicula, precio, sala);
    }

    public Espectador creaEspectador(String par, int a, double b) {
        System.out.println("Ingrese el nombre del espectador");
        String nombre = input.next();
        System.out.println("Ingrese la edad del espectador");
        int edad = input.nextInt();
        System.out.println("Ingrese el dinero disponible");
        double dinero = input.nextDouble();

        return new Espectador(nombre, edad, dinero);
    }

    public Pelicula crearPelicula() {
        System.out.println("Ingrese el titulo de la pelicula");
        String nombre = input.next();
        System.out.println("Ingrese en Minutos la duracion de la pelicula");
        Duration d = Duration.ofMinutes(input.nextInt());
        System.out.println("Edad minima permitida para ver la pelicula");
        int edadMin = input.nextInt();
        System.out.println("Ingrese el director de la pelicula");
        String director = input.next();

        return new Pelicula(nombre, d, edadMin, director);
    }

    public void boleteria() {
        System.out.println("Datos del cine");
        Cine cine1 = creacionCine();
        System.out.println("Ahora datos de la pelicula");
        Pelicula peli1 = crearPelicula();
        String[][] salaMatrix = cine1.getSala();
        int entrar = 0;

        do {
            System.out.println("cuantas personas van a entrar hasta 48");
            entrar = input.nextInt();
        } while (entrar >= 48);

        for (int i = 0; i < entrar; i++) {
            int a = (int) (Math.random() * (65 - 10) + 10);
            double b = Math.random() * (10000 - 100) + 100;
            Espectador aux = new Espectador("Usuario " + (i + 1), a, b);
            listaSpect.add(aux);
        }
        boolean bandera = false;
        int cont = 0;
        int fila = 0;
        int columna = 0;

        for (int f = 0; f < 8; f++) {
            for (int c = 0; c < 6; c++) {
                switch (c) {
                    case 0:
                        salaMatrix[f][c] = (f + 1) + "A ";
                        break;
                    case 1:
                        salaMatrix[f][c] = (f + 1) + "B ";
                        break;
                    case 2:
                        salaMatrix[f][c] = (f + 1) + "C ";
                        break;
                    case 3:
                        salaMatrix[f][c] = (f + 1) + "D ";
                        break;
                    case 4:
                        salaMatrix[f][c] = (f + 1) + "E ";
                        break;
                    case 5:
                        salaMatrix[f][c] = (f + 1) + "F ";
                        break;
                }
            }
        }
        /*
        for (Espectador aux : listaSpect) {
            if (cine1.getPrecio() <= aux.getDineroDisponible()
                    && peli1.getEdadMin() <= aux.getEdad()) {
                do{
                    bandera=true;
                    fila = (int)Math.random()*(7-0)+0;
                    columna = (int)Math.random()*(5-0)+0;
                     if (!salaMatrix[fila][columna].equalsIgnoreCase("X")) {
                        bandera=false;
                        salaMatrix[fila][columna] = "X";
                    }
                        
                } while (!bandera);
            }
        }
        
         */
        
        //Con esta clase se genera el random mas comodo
        Random aleatorio = new Random();

        for (Espectador x : listaSpect) {
            int pF = aleatorio.nextInt(8);
            int pC = aleatorio.nextInt(6);
            if (cine1.getPrecio() <= x.getDineroDisponible()
                    && peli1.getEdadMin() <= x.getEdad()) {
                if (!salaMatrix[pF][pC].equalsIgnoreCase("X")) {
                    salaMatrix[pF][pC] = " X ";
                }
            }
        }
        
        //Impreime la matriz
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(salaMatrix[i][j] + " ");
            }
            System.out.println("");
        }
        
        //Muestro la lista de espectadores
        for (Espectador x : listaSpect) {
            System.out.println(x);
        }

    }

}
