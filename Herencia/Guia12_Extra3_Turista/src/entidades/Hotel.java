package entidades;

/**
 *
 * @author Ilich Dell
 */
public abstract class Hotel extends Alojamiento {

    protected Integer cantHabitaciones, numCamas, cantPisos;
    protected Double precioHab;


    public Hotel(Integer cantHabitaciones, Integer numCamas, Integer cantPisos, Double precioHab, String nombre, String direccion, String localidad, String gerenteEnc) {
        super(nombre, direccion, localidad, gerenteEnc);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHab = precioHab;
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Integer getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(Integer numCamas) {
        this.numCamas = numCamas;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Double getPrecioHab() {
        return precioHab;
    }

    public void setPrecioHab(Double precioHab) {
        this.precioHab = precioHab;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "cantHabitaciones=" + cantHabitaciones +
                ", numCamas=" + numCamas +
                ", cantPisos=" + cantPisos +
                ", precioHab=" + precioHab +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerenteEnc='" + gerenteEnc + '\'' +
                '}';
    }
}
