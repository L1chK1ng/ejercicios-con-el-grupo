/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Baraja;
import Entidades.Cartas;
import Enums.Signos;
import Enums.Valores;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class GestorBaraja {

    private Scanner leerValores;

    public GestorBaraja() {
        leerValores = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Baraja crearBaraja(){
        Baraja nuevaBaraja = new Baraja();
        System.out.println("-----Creando baraja-----");
        for (Valores valor : Valores.values()) {
            for (Signos signo : Signos.values()) {
                Cartas nuevaCarta = new Cartas(valor, signo);
                nuevaBaraja.getMazo().add(nuevaCarta);
            }
        }
     return nuevaBaraja;
    }
    
    public void barajarYDar(){
        Baraja nuevaBaraja = new Baraja();
        String opcion;
        do{
        System.out.print("-----Inicio----- \n"+
                "Ingrese una opcion del menu \n"+
                "1- Iniciar un nuevo mazo \n"+
                "2- Barajar para mezclar \n"+
                "3- Mostrar proxima carta en el mazo \n"+
                "4- Cartas disponibles en el mazo \n"+
                "5- Pedir carta/s \n"+
                "6- Consultar cartas ya repartidas \n"+
                "7- Cartas en la baraja \n"+
                "8- Reiniciar \n"+
                "9- Salir \n"+
                " \n"+
                "Opcion: ");
        opcion = leerValores.next();
        switch(opcion){
            case "1":
                nuevaBaraja = crearBaraja();
                break;
            case "2":
                nuevaBaraja.barajar();
                break;
            case "3":
                nuevaBaraja.siguienteCarta();
                break;
            case "4":
                nuevaBaraja.cartasDisponibles();
                break;
            case "5":
                nuevaBaraja.darCartas();
                break;
            case "6":
                nuevaBaraja.cartasMonton();
                break;
            case "7":
                nuevaBaraja.mostrarBaraja();
                break;
            case "8":
                nuevaBaraja = crearBaraja();
                nuevaBaraja.barajar();
                break;
            case "9":
                System.out.println("Gracias por participar");
                break;
            default:
                System.out.println("Opcion incorrecta \n"+
                        "Intente nuevamente: \n"+
                        "---------------------------------");
                
        }
        }while(!(opcion.equals("9")));
        
    }

}
