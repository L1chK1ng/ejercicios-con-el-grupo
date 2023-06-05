package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*
Se necesita un programa que permitan al usuario elegir el barco que
quiera alquilar y mostrarle el precio final de su alquiler
 */
public class Alquiler {
    public Scanner input = new Scanner(System.in).useDelimiter("\n");

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String nombre, dni;
    private Date fechaAlquiler, fechaDevolucion;
    private Double moduloBarco;
    private Barco embarcacion;
    private Integer posicionEmbarque;

    public Alquiler () {

    }

    public Alquiler( String nombre, String dni, Date fechaAlquiler, Date fechaDevolucion, Double moduloBarco, Barco embarcacion, Integer posicionEmbarque) {
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.moduloBarco = moduloBarco;
        this.embarcacion = embarcacion;
        this.nombre = nombre;
        this.dni = dni;
        this.posicionEmbarque = posicionEmbarque;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Double getModuloBarco() {
        return moduloBarco;
    }

    public void setModuloBarco(Double moduloBarco) {
        this.moduloBarco = moduloBarco;
    }

    public Barco getEmbarcacion() {
        return embarcacion;
    }

    public void setEmbarcacion(Barco embarcacion) {
        this.embarcacion = embarcacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getPosicionEmbarque() {
        return posicionEmbarque;
    }

    public void setPosicionEmbarque(Integer posicionEmbarque) {
        this.posicionEmbarque = posicionEmbarque;
    }

    public Alquiler nuevoAlquiler() {
        System.out.println("----------------------------------------------");
        System.out.println("Ingrese nombre cliente");
        String nombreCliente = input.next();
        System.out.println("Ingrese el numero de documento del cliente");
        String dni = input.next();
        System.out.println("Primero se pedira el dia, mes y año de cuando Alquilara la embarcacion");
        System.out.println("Ingrese el dia de alquiler");
        int diaAlquiler = input.nextInt();
        System.out.println("Ingrese el mes de alquiler");
        int mesAlquiler = input.nextInt();
        System.out.println("Ingrese el año de alquiler");
        int anioAlquiler = input.nextInt();
        Date fechaAlquiler = new Date(anioAlquiler-1900, mesAlquiler-1, diaAlquiler);
        System.out.println("----------------------------------------------");
        System.out.println("Ahora se pedira el dia en que devolvera la embarcacion");
        System.out.println("Ingrese el dia de devolucion");
        int diaDevolucion = input.nextInt();
        System.out.println("Ingrese mes de devolucion");
        int mesDevolcuion = input.nextInt();
        System.out.println("Ingrese año de devolucion");
        int anioDevolucion = input.nextInt();
        Date fechaDevolucion = new Date(anioDevolucion-1900, mesDevolcuion-1, diaDevolucion);

        System.out.println("----------------------------------------------");
        int op=0;
        double modulo =0;
        Barco embarcacion = null;

        do {
            System.out.println("Ahora seleccione tipo de barco a alquilar");
            System.out.println("1. Barco comun (remos) \n" +
                    "2. Velero \n" +
                    "3. Barco a motor \n" +
                    "4. Yate de lujo \n");
            op = input.nextInt();

            switch (op) {
                case 1:
                    embarcacion = new Barco().crearBarco();
                    modulo = embarcacion.moduloBarco(); break;
                case 2:
                    embarcacion = new Velero().crearVelero();
                    modulo = embarcacion.moduloBarco(); break;
                case 3:
                    embarcacion = new BarcoAMotor().crearBM();
                    modulo = embarcacion.moduloBarco(); break;
                case 4:
                    embarcacion = new YateDeLujo().crearYate();
                    modulo = embarcacion.moduloBarco(); break;
                default:
                    System.out.println("Disculpe, esa opcion no esta disponible");
            }
        } while (op < 1 && op > 4);

        System.out.println("Ingrese el lugar donde esta embarcado la embarcacion");
        int posicionBarco = input.nextInt();

        return new Alquiler(nombreCliente, dni, fechaAlquiler, fechaDevolucion, modulo, embarcacion, posicionBarco);
    }

    public void mostrarFechaAlquiler() {
        System.out.println("Fecha de alquiler: " + sdf.format(this.fechaAlquiler));
    }

    public void mostrarFechaDevolucion() {
        System.out.println("Fecha de devolucion: " + sdf.format(this.fechaDevolucion));
    }

    /*
    calculo de dias de ocupacion, guardo la diferencia del Tiempo en milisegundos de las fechas
     en una variable long (da un numero muy grande en milisegundos), luego convierto esos milisegundos a dias
     defino una unidad de tiempo en dias con TimeUnit, y luego esa unidad de tiempo la uso para convertir la
     unidad de tiempo que tengo en milisegundos

     */
    public double diasOcupacion() {
        long diferencia = this.fechaDevolucion.getTime() - this.fechaAlquiler.getTime();
        TimeUnit transcurrido = TimeUnit.DAYS;
        long diferenciaDias = transcurrido.convert(diferencia, TimeUnit.MILLISECONDS);
        double dOcupacion = (double) diferenciaDias;
        return dOcupacion;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "fechaAlquiler=" + fechaAlquiler +
                ", fechaDevolucion=" + fechaDevolucion +
                ", moduloBarco=" + moduloBarco +
                '}';
    }
}
