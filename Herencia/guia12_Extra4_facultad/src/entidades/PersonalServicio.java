package entidades;

import java.util.Date;
import java.util.Scanner;

public class PersonalServicio extends Empleado{

    protected String seccion;

    public PersonalServicio(String nombre, String apellido, String estadoCivil, Date incorpFacu, Integer despacho, String seccion) {
        super(nombre, apellido, estadoCivil, incorpFacu, despacho);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
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

    public String reasignacion() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Seccion asignada actual: " + this.seccion);
        int op=0;
        do {
            System.out.println("Cambiar:");
            System.out.println("1. Biblioteca \n" +
                    "2. Decanato \n" +
                    "3. Secretaría \n" +
                    "4. Pasillos \n" +
                    "5. Sala general \n" +
                    "6. Exteriores \n" +
                    "7. Baños");
            System.out.println("Ingrese la opcion");
            op = input.nextInt();
            switch(op){
                case 1:
                    this.seccion = "Biblioteca"; break;
                case 2:
                    this.seccion = "Decanato"; break;
                case 3:
                    this.seccion = "Secretaría"; break;
                case 4:
                    this.seccion = "Pasillos"; break;
                case 5:
                    this.seccion = "Sala general"; break;
                case 6:
                    this.seccion = "Exteriores"; break;
                case 7:
                    this.seccion = "Baños"; break;
                default:
                    System.out.println("Disculpe esa opcion no esta disponible");
            }
        } while (op < 1 && op > 7);
        System.out.println("Reasignacion exitosa!!");
        return this.seccion;
    }

    @Override
    public String toString() {
        return "PersonalServicio{" +
                "seccion='" + seccion + '\'' +
                ", incorpFacu=" + incorpFacu +
                ", despacho=" + despacho +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
