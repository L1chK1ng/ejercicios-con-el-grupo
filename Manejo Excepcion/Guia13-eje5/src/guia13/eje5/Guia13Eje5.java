/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia13.eje5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Guia13Eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
        debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
        ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
        número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
        consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
        ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
        controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
        carácter fallido como un intento.
        */
       
       int nAdivinar=(int) (Math.random()*500+1);
       int nIntentos = 0, nUsuario = 0;
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Numero aleatorio=" + nAdivinar);
        while (nAdivinar != nUsuario) {
            System.out.println("Ingrese un número entre 1 y 500");
            nUsuario=verificador();
            nIntentos++;
        }


       
        System.out.println("Felicidades, has adivinado el número en el intento número "+nIntentos);
       
       
    }

    public static int verificador() {
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        int nUsuario = 0;
        try {
            nUsuario = in.nextInt();
            in.nextLine();
        } catch (InputMismatchException i) {
            System.out.println("No se ha ingresado un número");

        }

        return nUsuario;
    }

}


