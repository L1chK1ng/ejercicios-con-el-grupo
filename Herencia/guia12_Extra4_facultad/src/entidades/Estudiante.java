package entidades;

import java.util.Scanner;

public class Estudiante extends Persona{

    protected String cursoMatriculado;


    public Estudiante(String nombre, String apellido, String estadoCivil, String cursoMatriculado) {
        super(nombre, apellido, estadoCivil);
        this.cursoMatriculado = cursoMatriculado;
    }

    public String getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    public String cambioEstadoCivil() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Estado actual: " + this.estadoCivil);
        int op=0;
        do {
            System.out.println("Cambiar: \n" +
                    "1. Soltero \n" +
                    "2. Casado \n" +
                    "3. Divorciado \n" +
                    "4. Viudo \n");
            System.out.println("Seleccione su opcion");
            op = input.nextInt();

            switch (op) {
                case 1:
                    this.estadoCivil = "Soltero"; break;
                case 2:
                    this.estadoCivil = "Casado"; break;
                case 3:
                    this.estadoCivil = "Divorciado"; break;
                case 4:
                    this.estadoCivil = "Viudo"; break;
                default:
                    System.out.println("Disculpe esa opcion no esta disponible");
            }
        } while(op < 1 && op > 4);

        return this.estadoCivil;
    }


    @Override
    public String toString() {
        return "Estudiante{" +
                "cursoMatriculado='" + cursoMatriculado + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
