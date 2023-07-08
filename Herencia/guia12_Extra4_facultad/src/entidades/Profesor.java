package entidades;

import java.util.Date;
import java.util.Scanner;

public class Profesor extends Empleado{

    protected String departamento;

    public Profesor(String nombre, String apellido, String estadoCivil, Date incorpFacu, Integer despacho, String departamento) {
        super(nombre, apellido, estadoCivil, incorpFacu, despacho);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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
        System.out.println("Estado civil cambiado con exito!!");

        return this.estadoCivil;
    }

    public String reasignacion() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Departamento actual: " + this.departamento);
        int op=0;
        do {
            System.out.println("Reasignar:");
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
            System.out.println("Seleccione su opcion");
            op = input.nextInt();

            switch(op) {
                case 1:
                    this.departamento = "Lenguajes"; break;
                case 2:
                    this.departamento = "Matematicas"; break;
                case 3:
                    this.departamento = "Arquitectura del computador"; break;
                case 4:
                    this.departamento = "Base de datos"; break;
                case 5:
                    this.departamento = "Algoritmos"; break;
                case 6:
                    this.departamento = "Ingles tecnico"; break;
                case 7:
                    this.departamento = "Estadisticas"; break;
                case 8:
                    this.departamento = "Logica proposicional"; break;
                case 9:
                    this.departamento = "Programacion 1"; break;
                case 10:
                    this.departamento = "Programacion 2"; break;
                default:
                    System.out.println("Disculpe esa opcion no esta en el menu");
            }
        } while (op < 1 && op > 10);

        System.out.println("Reasignacion con exito!!");

        return this.departamento;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "departamento='" + departamento + '\'' +
                ", incorpFacu=" + incorpFacu +
                ", despacho=" + despacho +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
