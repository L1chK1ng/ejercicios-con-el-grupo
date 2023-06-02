
package ilich.votos_egg;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;
import servicios.Simulador;

/**
 *
 * @author Ilich
 */
public class Votos_Egg {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ArrayList<String> listaNombre = new ArrayList();
        ArrayList<String> listaDni = new ArrayList();
        ArrayList<Alumno> listaAlumno = new ArrayList();
        
        Simulador sim = new Simulador();
        
        listaNombre = sim.crearListaNombre();
        listaDni = sim.crearListaDni();
        listaAlumno = sim.crearAlumno(listaDni, listaNombre);
        
        sim.mostrarAlumnos(listaAlumno);
        sim.mostrarVotos(listaAlumno);
    }
   
}
