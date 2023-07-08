package servicios;

import entidades.Estudiante;
import entidades.Persona;
import entidades.PersonalServicio;
import entidades.Profesor;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class FacuServices {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    String separador = "------------------------------------------------------------------";
    public ArrayList <Persona> crearLista() {
        ArrayList<Persona> listaPersona = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        Date fechaIncorpProfe = new Date(2019-1900, 3-1, 22 );
        Date fechaIncorpService = new Date(2020-1900, 8-1, 10);

        Persona estudiante1 = new Estudiante("Oscar", "Ramirez", "Soltero", null);
        listaPersona.add(estudiante1);
        Persona profe1 = new Profesor("Luis", "Sera", "Casado", fechaIncorpProfe, 22, "Base de datos");
        listaPersona.add(profe1);
        Persona servicio = new PersonalServicio("Bart", "Simpson", "Soltero", fechaIncorpService, 30, "Decanato");
        listaPersona.add(servicio);

        return listaPersona;
    }

    public void matriculaEstudiante(ArrayList<Persona> listaPersona) {
        System.out.println("Asignacion de matricula");
        int op = 0;
        do {
            System.out.println("1. Lenguajes \n" +
                    "2. Matematicas \n" +
                    "3. Arquitectura del computador \n" +
                    "4. Bases de datos \n" +
                    "5. Algoritmos \n" +
                    "6. Ingles tecnico \n" +
                    "7. Estadisticas \n" +
                    "8. Logica proposicional \n" +
                    "9. Lenguaje de programacion 1 \n" +
                    "10. Lenguaje de programacion 2 \n");
            System.out.println("elegi una matricula");
            op = input.nextInt();

            switch (op) {
                case 1:
                    for (Persona aux: listaPersona) {
                        if (aux instanceof Estudiante) {
                            ((Estudiante) aux).setCursoMatriculado("Lenguaje");

                        }
                    }
                break;
                case 2:
                    for (Persona aux: listaPersona) {
                        if (aux instanceof Estudiante) {
                            ((Estudiante) aux).setCursoMatriculado("Matematicas");
                        }
                    }
                break;
                case 3:
                    for (Persona aux: listaPersona) {
                        if (aux instanceof Estudiante) {
                            ((Estudiante) aux).setCursoMatriculado("Arquitectura del computador");
                        }
                    }
                    break;
                case 4:
                    for (Persona aux: listaPersona) {
                        if (aux instanceof Estudiante) {
                            ((Estudiante) aux).setCursoMatriculado("Base de datos");
                        }
                    }
                    break;
                case 5:
                    for (Persona aux: listaPersona) {
                        if (aux instanceof Estudiante) {
                            ((Estudiante) aux).setCursoMatriculado("Algoritmos");
                        }
                    }
                    break;
                case 6:
                    for (Persona aux: listaPersona) {
                        if (aux instanceof Estudiante) {
                            ((Estudiante) aux).setCursoMatriculado("Ingles tecnico");
                        }
                    }
                    break;
                case 7:
                    for (Persona aux: listaPersona) {
                        if (aux instanceof Estudiante) {
                            ((Estudiante) aux).setCursoMatriculado("Estadistica");
                        }
                    }
                    break;
                case 8:
                    for (Persona aux: listaPersona) {
                        if (aux instanceof Estudiante) {
                            ((Estudiante) aux).setCursoMatriculado("Logica proposicional");
                        }
                    }
                    break;
                case 9:
                    for (Persona aux: listaPersona) {
                        if (aux instanceof Estudiante) {
                            ((Estudiante) aux).setCursoMatriculado("Programacion 1");
                        }
                    }
                    break;
                case 10:
                    for (Persona aux: listaPersona) {
                        if (aux instanceof Estudiante) {
                            ((Estudiante) aux).setCursoMatriculado("Programacion");
                        }
                    }
                    break;
                default:
                    System.err.println("La opcion ingresada no esta en el menu");
            }
        } while (op < 1 || op > 10);
        System.out.println("La matricula se a cargado con exito!! \n");
    }

    public void mostrarEstudiante(ArrayList<Persona> listaPersona) {
        for (Persona aux: listaPersona) {
            int i =1;
            if (aux instanceof Estudiante) {
                System.out.println(separador);
                System.out.println("Estudiante " + i);
                System.out.println("Nombre: " + aux.getNombre());
                System.out.println("Apellido: " + aux.getApellido());
                System.out.println("Estado civil: " + aux.getEstadoCivil());
                if (aux == null) {
                    System.out.println("Matricula: Vacio");
                } else {
                    System.out.println("Matricula: " + ((Estudiante) aux).getCursoMatriculado());
                }
                i++;
            }
        }
        System.out.println("");
    }
    public void menuEstudiante(ArrayList<Persona> listaPersona) {
        System.out.println("Menu estudiante");
        int op = 0;
        do {
            System.out.println("1. Cargar matricula \n" +
                    "2. Mostrar estudiantes \n" +
                    "3. Volver");
            op = input.nextInt();
            switch (op) {
                case 1:
                    matriculaEstudiante(listaPersona); break;
                case 2:
                    mostrarEstudiante(listaPersona); break;
                case 3:
                    System.out.println(""); break;
                default:
                    System.err.println("La opcion ingresada no esta en el menu");
            }
        } while (op != 3);
    }

    public void mostrarProfesor(ArrayList<Persona> listaPersona) {
        int i =1;
        for (Persona aux: listaPersona) {
            if (aux instanceof Profesor) {
                System.out.println(separador);
                System.out.println("Profesor " + i);
                System.out.println("Nombre: " + aux.getNombre());
                System.out.println("Apellido: " + aux.getApellido());
                System.out.println("Estado civil: " + aux.getEstadoCivil());
                System.out.println("Fecha de incorporacion: " + ((Profesor) aux).getIncorpFacu());
                System.out.println("Despacho: " + ((Profesor) aux).getDespacho());
                System.out.println("Departamento: " + ((Profesor) aux).getDepartamento());
                i++;
            }
        }
    }

    public void menuProfesor(ArrayList<Persona> listaPersona) {
        int op = 0;
        do {
            System.out.println(separador);
            System.out.println("Menu profesores");
            System.out.println("1. Cambio de estado civil \n" +
                    "2. Reasignacion de despacho \n" +
                    "3. Cambio de departamento \n" +
                    "4. Mostrar lista de profesores \n" +
                    "5. Volver \n");
            System.out.println("Seleccione su opcion");
            op = input.nextInt();

            switch (op) {
                case 1:
                    for (Persona aux: listaPersona) {
                        if (aux instanceof Profesor) {
                            String civil = ((Profesor) aux).cambioEstadoCivil();
                            //aux.setEstadoCivil(civil);
                        }
                    }
                break;
                case 2:
                    System.out.println("Ingrese el numero del nuevo despacho");
                    for (Persona aux: listaPersona) {
                        if (aux instanceof Profesor) {
                            ((Profesor) aux).setDespacho(input.nextInt());
                        }
                    }
                    System.out.println("Despacho modificado con exito!!");
                break;
                case 3:
                    for (Persona aux: listaPersona) {
                        if (aux instanceof Profesor) {
                            String dep = ((Profesor) aux).reasignacion();
                        }
                    }
                break;
                case 4:
                    mostrarProfesor(listaPersona); break;
                case 5:
                    System.out.println(""); break;
                default:
                    System.err.println("La opcion ingresada no esta en el menu");
            }
        } while (op != 5);


    }

    public void mostrarPersonalServicio(ArrayList<Persona> listaPersona) {
        int i =1;
        for (Persona aux: listaPersona) {
            if (aux instanceof PersonalServicio) {
                System.out.println(separador);
                System.out.println("Persona de servicio " + i);
                System.out.println("Nombre: " + aux.getNombre());
                System.out.println("Apellido: " + aux.getApellido());
                System.out.println("Estado civil: " + aux.getEstadoCivil());
                System.out.println("Fecha de incorporacion: " + ((PersonalServicio) aux).getIncorpFacu());
                System.out.println("Despacho: " + ((PersonalServicio) aux).getDespacho());
                System.out.println("Seccion de servicio: " + ((PersonalServicio) aux).getSeccion());
                i++;
            }

        }
    }

    public void menuPersonaServicio(ArrayList<Persona> listaPersona) {
        int op = 0;
        do {
            System.out.println(separador);
            System.out.println("Menu personal de servicio");
            System.out.println("1. Cambio de estado civil \n" +
                    "2. Reasignacion de despacho \n" +
                    "3. Traslado de seccion \n" +
                    "4. Mostrar lista de personal de servicio \n" +
                    "5. Volver");
            System.out.println("Seleccione su opcion");
            op = input.nextInt();

            switch(op) {
                case 1:
                    for (Persona aux: listaPersona) {
                        if (aux instanceof PersonalServicio) {
                            String civil = ((PersonalServicio) aux).cambioEstadoCivil();
                        }
                    }
                    System.out.println("Estado civil actualizado con exito!!");
                break;
                case 2:
                    for (Persona aux: listaPersona) {
                        if (aux instanceof PersonalServicio) {
                            System.out.println("Ingrese el nuevo numero de despacho");
                            ((PersonalServicio) aux).setDespacho(input.nextInt());
                        }
                    }
                    System.out.println("Despacho cambiado con exito!!");
                break;
                case 3:
                    for (Persona aux: listaPersona) {
                        if (aux instanceof PersonalServicio) {
                            String reac = ((PersonalServicio) aux).reasignacion();
                        }
                    }
                break;
                case 4:
                    mostrarPersonalServicio(listaPersona); break;
                case 5:
                    System.out.println(""); break;
                default:
                    System.err.println("La opcion ingresada no esta en el menu");
            }
        }while (op != 5);

    }

    public void menuEmpleado(ArrayList<Persona> listaPersona) {
        int op = 0;
        do {
            System.out.println(separador);
            System.out.println("Menu empleados");
            System.out.println("1. Profesores \n" +
                    "2. Personal de servicio \n" +
                    "3. Volver \n");
            System.out.println("Seleccione su opcion");
            op = input.nextInt();

            switch(op) {
                case 1:
                    menuProfesor(listaPersona); break;
                case 2:
                    menuPersonaServicio(listaPersona); break;
                case 3:
                    System.out.println(""); break;
                default:
                    System.err.println("La opcion ingresada no esta en el menu");
            }
        }while (op != 3);

    }

    public void menuGral(ArrayList<Persona> listaPersona){
        int op = 0;
        do {
            System.out.println(separador);
            System.out.println("Menu principal \n" +
                    "1. Menu empleados \n" +
                    "2. Menu estudiantes \n" +
                    "3. Salir \n");
            System.out.println("Seleccione su opcion");
            op = input.nextInt();

            switch (op) {
                case 1:
                    menuEmpleado(listaPersona); break;
                case 2:
                    menuEstudiante(listaPersona); break;
                case 3:
                    System.out.println("Adios"); break;
                default:
                    System.err.println("La opcion ingresada no esta en el menu");
            }
        }while (op != 3);

    }

}
