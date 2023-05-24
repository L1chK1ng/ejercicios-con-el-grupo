/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class Baraja {

    private ArrayList<Cartas> mazo;
    private ArrayList<Cartas> monton;

    public Baraja() {
        this.mazo = new ArrayList();
        this.monton = new ArrayList();
    }

    public ArrayList<Cartas> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Cartas> mazo) {
        this.mazo = mazo;
    }

    public void barajar() {
        if (mazo.size() == 0) {
            System.out.println("Debe crear un nuevo mazo");
        } else {
            Collections.shuffle(mazo);
            System.out.println("La baraja fue mezclada");
        }
    }

    public void siguienteCarta() {
        if (mazo.size() == 0) {
            System.out.println("No hay cartas en el mazo, inicie uno nuevo");
        } else {
            System.out.println("La carta siguiente es: \n"
                    + mazo.get(0));
        }

    }

    public void cartasDisponibles() {
        System.out.println("La cantidad de cartas disponibles es: " + mazo.size());
    }

    public void darCartas() {
        Scanner leerValores = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese la cantidad de cartas que desea recibir: ");
        int cantidad = leerValores.nextInt();
        if (cantidad > mazo.size()) {
            System.out.println("Lo siento, no quedan suficientes cartas para pedir");
        } else {
            System.out.println("Las cartas que recibira seran: ");
            for (Cartas carta : mazo.subList(0, cantidad)) {
                System.out.println(carta);
                monton.add(carta);
            }
            mazo.subList(0, cantidad).clear();
        }
    }

    public void cartasMonton() {
        System.out.println("-----Cartas fuera del mazo-----");
        if (monton.size() == 0) {
            System.out.println("Aun no se han repartido cartas");
        } else {
            System.out.println("Las cartas que ya se repartieron son: ");
            for (Cartas carta : monton) {
                System.out.println(carta);
            }
        }
    }

    public void mostrarBaraja() {
        System.out.println("-----Cartas disponibles en el mazo-----");
        if (mazo.size() == 0) {
            System.out.println("No quedan mas cartas en el mazo \n"
                    + "Puede reiniciar y barajar denuevo");
        } else {
            System.out.println("Las cartas disponibles en el mazo son: ");
            for (Cartas carta : mazo) {
                System.out.println(carta);
            }
        }
    }
}
