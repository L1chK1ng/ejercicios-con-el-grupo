package entidades;

/**
 *
 * @author Ilich Dell
 */
public abstract class Hotel extends Alojamiento {

    protected Integer cantHabitaciones, numCamas, cantPisos;
    protected Double precioHab;
    protected Boolean gym;


    public Hotel(String nombre, String direccion, String localidad, String gerenteEnc, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, Double precioHab, Boolean gym) {
        super(nombre, direccion, localidad, gerenteEnc);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHab = precioHab;
        this.gym = gym;
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

    public Boolean getGym() {
        return gym;
    }

    public void setGym(Boolean gym) {
        this.gym = gym;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "cantHabitaciones=" + cantHabitaciones +
                ", numCamas=" + numCamas +
                ", cantPisos=" + cantPisos +
                ", precioHab=" + precioHab +
                ", gym=" + gym +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerenteEnc='" + gerenteEnc + '\'' +
                '}';
    }
}
