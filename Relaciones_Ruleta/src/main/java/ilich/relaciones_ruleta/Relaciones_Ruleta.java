package ilich.relaciones_ruleta;

import entidades.Juego;
import entidades.Jugador;
import entidades.Revolver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ilich Dell
 */
public class Relaciones_Ruleta {

    public static void main(String[] args) {
        Juego juego1 = new Juego(llenarLista(), llenarRevolver());

        disparo(juego1);
        ronda(juego1);
        System.out.println(juego1);
    }
    

    //Metodos y cargas de revolver
    public static Revolver llenarRevolver() {
        Integer posicionActual = (int) (Math.random() * (6 - 1 + 1) + 1);
        Integer posicionCarga = (int) (Math.random() * (6 - 1 + 1) + 1);

        return new Revolver(posicionActual, posicionCarga);
    }

    public static Boolean mojar(Revolver r) {
        return r.getPosicionActual() == r.getPosicionCarga();
    }

    //si el tambor esta en la ultima posicion se reinicia, sino continua
    public static void siguienteChorro(Revolver r) {
        if (r.getPosicionActual() == 6) {
            r.setPosicionActual(1);
        } else {
            r.setPosicionActual(r.getPosicionActual() + 1);
        }
    }

    //Metodos y carga de jugador
    public static void disparo(Juego j) {
        boolean aux = false;
        do {
            for (Jugador x : j.getJugadores()) {
                siguienteChorro(j.getRevolver()); //aca gira el tambor
                if (mojar(j.getRevolver())) {    //si cae en la carga se moja
                    x.setMojado(true);
                    aux = true;
                    break;
                }
            }
        } while (aux == false);
        //Se creo el while para que siga iterando hasta que a alguno
        //le toque la posicion del agua
    }

    //Este metodo recorre la lista de jugadores y muestra al mojado
    public static void ronda(Juego j) {
        for (Jugador x : j.getJugadores()) {
            if (x.getMojado()) {
                System.out.println("El jugador " + x.getNombre() + " ha perdido");
                break;
            }
        }
    }

    //Aca se llena la lista de jugadores con el revolver
    public static List<Jugador> llenarLista() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int cant = 0;
        ArrayList<Jugador> jugadores = new ArrayList();
        do {
            System.out.println("Ingrese cantidad de jugadores 1-6");
            cant = input.nextInt();
        } while (cant < 1 || cant > 6);

        for (int i = 1; i <= cant; i++) {   //se crean jugadores
            Jugador j = new Jugador();     
            j.setId((i));             //seteamos el id con un numero
            j.setNombre("Jugador " + (i));  //el nombre generico jugador + id
            jugadores.add(j);
        }

        return jugadores;
    }

}
