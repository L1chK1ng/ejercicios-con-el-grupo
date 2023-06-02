package servicios;

import entidades.Alumno;
import entidades.Votos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ilich
 *
 * La clase Simulador debe tener un método que genere un listado de alumnos
 * manera aleatoria y lo retorne. Las combinaciones de nombre y apellido deben
 * ser generadas de manera aleatoria. Nota: usar listas de tipo String para
 * generar los nombres y los apellidos
 *
 * Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro
 * de un rango real de números de documentos. Y agregar a los alumnos su DNI.
 * Este método debe retornar la lista de dnis.
 *
 * • Ahora tendremos un método que, usando las dos listas generadas, cree una
 * cantidad de objetos Alumno, elegidos por el usuario, y le asigne los nombres
 * y los dnis de las dos listas a cada objeto Alumno. No puede haber dos alumnos
 * con el mismo dni, pero si con el mismo nombre
 */
public class Simulador {

    public String separador = "---------------------------------------------------";
    public Scanner input = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<String> crearListaDni() {
        Random aleatorio = new Random();
        ArrayList<String> listaDni = new ArrayList();
        Long dni;

        for (int i = 0; i < 500; i++) {
            dni = aleatorio.nextLong(10000000, 99000000);
            String dniString = dni.toString();
            listaDni.add(dniString);
        }

        return listaDni;
    }

    public ArrayList<String> crearListaNombre() {
        ArrayList<String> listaNombre = new ArrayList();

        String[] nombres = {"Jose", "Pedro", "Maria", "Juana", "Juan", "Carla", "Carlos", "Julia", "Julio", "Agustina"};
        String[] apellidos = {"Ramirez", "Lopez", "Peralta", "Basile", "Gomez", "Garcia", "Salazar", "Avalos", "Acosta", "Torrealba"};
        String nombreCompleto;

        Random r = new Random();

        for (int j = 0; j < 10; j++) {
            nombreCompleto = nombres[r.nextInt(9)] + " " + apellidos[r.nextInt(9)];
            listaNombre.add(nombreCompleto);
        }

        return listaNombre;
    }

    public ArrayList<Alumno> crearAlumno(ArrayList<String> listDni, ArrayList<String> listNombre) {
        System.out.println(separador);

        System.out.println("Ingrese la cantidad de alumnos a crear");
        int cant = input.nextInt();
        ArrayList<Alumno> listaAlumno = new ArrayList();
        Random r = new Random();

        String dni;
        String nombre;
        int indi = 0;

        /*
        while (listaAlumno.size() < cant) {
            indi = (int) (r.nextLong(0, 500));
            dni = listDni.get(indi);
            nombre = listNombre.get(r.nextInt(0, 9));
            if (listDni.get(indi).isEmpty()) {
                continue;
            } else {
                if (!listaAlumno.contains(dni)) {
                    Alumno aluTemp = new Alumno(dni, nombre, 0);
                    listaAlumno.add(aluTemp);
                }
            }
            listDni.remove(indi);
        }

         */



            while (listaAlumno.size() < cant) {
                Long dniLong = r.nextLong(10000000, 99000000);
                dni = dniLong.toString();
                nombre = listNombre.get(r.nextInt(0, 9));
                if (!listaAlumno.contains(dni)) {
                    Alumno aluTemp = new Alumno(dni, nombre, 0);
                    listaAlumno.add(aluTemp);
                }
            }


         
        return listaAlumno;
    }

    public void mostrarAlumnos(ArrayList<Alumno> listaAlumno) {
        int i = 1, cont = 0;
        for (Alumno alumno : listaAlumno) {
            System.out.println("Alumno " + i + ": " + "DNI: " + alumno.getDni() + " - Nombre: "
                    + alumno.getNombre() + " - Votos: " + alumno.getVotos());
            i++;
            cont++;
        }

        System.out.println("Iteraciones en list: " + cont);
        i = 0;
        cont = 0;
        Alumno copia;
        String dniCopia;
        do {
            dniCopia = listaAlumno.get(i).getDni();
            for (Alumno alumno : listaAlumno) {
                if (dniCopia.equals(alumno.getDni())) {
                    cont++;
                }
            }
            i++;
        } while (i != listaAlumno.size());

        System.out.println("se repite dni: " + (cont - listaAlumno.size()));
    }

    public Votos votacion(ArrayList<Alumno> listaAlumno, Alumno alumno) {
        Random r = new Random();
        ArrayList <Alumno> votados = new ArrayList();

        int k=0;
            Votos voto = new Votos();
            voto.setAlumnoQueVota(alumno);
            for (int i = 0; i < 3; i++) {

                switch (i) {
                    case 0:
                        do {
                            k = r.nextInt(listaAlumno.size());

                        } while(alumno==listaAlumno.get(k));

                        votados.add(listaAlumno.get(k));
                        voto.setAlumnosQueVoto(votados);
                        listaAlumno.get(k).setVotos((listaAlumno.get(k).getVotos()+1));
                    break;
                    case 1:
                        do {
                            k = r.nextInt(listaAlumno.size());

                        } while((alumno==listaAlumno.get(k)) || (listaAlumno.get(k) == voto.getAlumnosQueVoto().get(0)));
                        votados.add(listaAlumno.get(k));
                        voto.setAlumnosQueVoto(votados);
                        listaAlumno.get(k).setVotos((listaAlumno.get(k).getVotos()+1));
                    break;
                    case 2:
                        do {
                            k = r.nextInt(listaAlumno.size());

                        } while((alumno==listaAlumno.get(k)) || (listaAlumno.get(k) == voto.getAlumnosQueVoto().get(0)) || (listaAlumno.get(k) == voto.getAlumnosQueVoto().get(1)));
                        votados.add(listaAlumno.get(k));
                        voto.setAlumnosQueVoto(votados);
                        listaAlumno.get(k).setVotos((listaAlumno.get(k).getVotos()+1));
                }
            }
            return voto;
    }

    public void mostrarVotos(ArrayList <Alumno> listaAlumno){
        ArrayList <Votos> listaVotacion = new ArrayList<>();

        for (Alumno aux: listaAlumno) {
            Votos voto = votacion(listaAlumno, aux);
            listaVotacion.add(voto);
        }

        for (Votos aux : listaVotacion) {
            System.out.println("el alumno " + aux.getAlumnoQueVota().getNombre() + " DNI: " +
                    "" + aux.getAlumnoQueVota().getDni() + "Votos: " + aux.getAlumnoQueVota().getVotos());
            System.out.println("Y voto :" + aux.getAlumnosQueVoto().toString());
        }

    }

}
