package services;

import entidades.Perro;
import entidades.Persona;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
public class PerroService {

    public ArrayList<Perro> listaPerro = new ArrayList();
    ArrayList<Persona> listaPersona = new ArrayList();
    public Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void creacionPerros() {
        Perro p1 = new Perro("Fer", "Beagle", 2, 30.0);
        listaPerro.add(p1);
        Perro p2 = new Perro("Chuquito", "Doberman", 2, 65.0);
        listaPerro.add(p2);
        Perro p3 = new Perro("Rubia", "otro", 2, 35.0);
        listaPerro.add(p3);
        Perro p4 = new Perro("Morocha", "otro", 2, 35.0);
        listaPerro.add(p4);
        Perro p5 = new Perro("Konan", "otro", 2, 35.0);
        listaPerro.add(p5);
        Perro p6 = new Perro("Zack", "otro", 2, 35.0);
        listaPerro.add(p6);
        Perro p7 = new Perro("Perro", "otro", 2, 35.0);
        listaPerro.add(p7);
        Perro p8 = new Perro("Dickens", "otro", 2, 35.0);
        listaPerro.add(p8);
        Perro p9 = new Perro("Poroto", "otro", 2, 35.0);
        listaPerro.add(p9);
        Perro p10 = new Perro("Homero", "otro", 2, 35.0);
        listaPerro.add(p10);

        //una persona generica ya cargada en los que adoptaron
        Persona personaGen = new Persona("Ilich", "Lopez", "12345678", 34);
        personaGen.setPerro(p3);
        listaPersona.add(personaGen);
    }

    public void darEnAdopcion() {
        String exit = " ";

        do {
            System.out.println("Ingrese el nombre del perro");
            String nombre = input.next();
            System.out.println("Ingrese la raza del perro");
            String raza = input.next();
            System.out.println("Ingrese la edad del perro");
            int edad = input.nextInt();
            System.out.println("Ingrese el tamaño del perro");
            double tamanio = input.nextDouble();
            Perro perroX = new Perro(nombre, raza, edad, tamanio);
            listaPerro.add(perroX);

            System.out.println("Va a dejar otro perrito? S/N");
            exit = input.next();
        } while(exit.equalsIgnoreCase("s"));
    }

    public void mostrarListaPerro() {
        System.out.println("Se muestra lista de perros disponibles");
        int i = 1;
        for (Perro x : listaPerro) {
            System.out.println("Perro " + i + " Nombre: " + x.getNombre() + ", Raza: " + x.getRaza() + ", Edad: " + x.getEdad()
                    + ", Tamaño: " + x.getTamanio());
            i++;
        }
    }

    public Persona crearPersona() {
        System.out.println("Ingrese numero de documento");
        String doc = input.next();
        System.out.println("Ingrese el nombre");
        String nombre = input.next();
        System.out.println("Ingrese el apellido");
        String apellido = input.next();
        System.out.println("Ingrese edad");
        int edad = input.nextInt();

        return new Persona(nombre, apellido, doc, edad);
    }

    public void adoptar() {
        boolean disponible = false;


        System.out.println("se muestra la lista de perros actualizada");
        mostrarListaPerro();

        System.out.println("Ingrese el Nombre del perro que desea adoptar");
        String nomPerro = input.next();

        for (Persona x : listaPersona) {
            if (nomPerro.equalsIgnoreCase(x.getPerro().getNombre())) {
                disponible = true;
            }
        }

        if (disponible) {
            System.out.println("Lo sentimos este perro ya tiene dueño");
        } else {
            System.out.println("Perfecto, este perro no tiene dueño");
            System.out.println("Ahora debes cargar tus datos");
            Persona personaX = crearPersona();

            for (Perro x : listaPerro) {
                if (nomPerro.equalsIgnoreCase(x.getNombre())){
                    personaX.setPerro(x);
                    break;
                }
            }
            listaPersona.add(personaX);
            System.out.println("Listo, " + personaX.getNombre() + " ahora " + personaX.getPerro().getNombre()
                + " es suyo, cuidelo bien");
        }
    }

    public void mostrarPersonas() {
        System.out.println("Se muestra las personas con sus perros");


        for (Persona x : listaPersona) {
            if (x.getPerro() != null) {
                System.out.println(x);
            }
        }
    }

    public void menu() {
        creacionPerros();
        int op;
        do {
            System.out.println("=====================================================================");
            System.out.println("Menu");
            System.out.println("1. Dar un perrito en adopcion");
            System.out.println("2. Adoptar un perrito");
            System.out.println("3. Mostrar lista de perros actualizada");
            System.out.println("4. Mostrar lista de personas con perros ya adoptados");
            System.out.println("5. Salir");
            System.out.println("Seleccione su opcion");
            op = input.nextInt();

            switch (op) {
                case 1:
                    darEnAdopcion(); break;
                case 2:
                    adoptar(); break;
                case 3:
                    mostrarListaPerro(); break;
                case 4:
                    mostrarPersonas(); break;
                case 5:
                    System.out.println("Adios"); break;
                default:
                    System.out.println("Disculpe, esa opcion no esta en el menu");
            }
        } while (op != 5);
    }

}
