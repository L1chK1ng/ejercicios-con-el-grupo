package entidades;

/**
 *
 * @author Ilich Dell
 */
public class Hotel4Estrellas extends Hotel {
    
    protected String TipoGym;
    protected String nombRestaurant;
    protected Integer capRestaurant;

    public Hotel4Estrellas(String nombre, String direccion, String localidad, String gerenteEnc, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, Double precioHab, Boolean gym, String tipoGym, String nombRestaurant, Integer capRestaurant) {
        super(nombre, direccion, localidad, gerenteEnc, cantHabitaciones, numCamas, cantPisos, precioHab, gym);
        TipoGym = "Tipo B";
        this.nombRestaurant = nombRestaurant;
        this.capRestaurant = capRestaurant;
    }

    public String getNombRestaurant() {
        return nombRestaurant;
    }

    public void setNombRestaurant(String nombRestaurant) {
        this.nombRestaurant = nombRestaurant;
    }

    public Integer getCapRestaurant() {
        return capRestaurant;
    }

    public void setCapRestaurant(Integer capRestaurant) {
        this.capRestaurant = capRestaurant;
    }

    public String getTipoGym() {
        return TipoGym;
    }

    @Override
    public double precioFinal() {
        int capHotel = this.cantPisos * this.cantHabitaciones;
        double valorRestaurant=0d;
        if (this.capRestaurant < 30) {
            valorRestaurant = 10;
        } else if (this.capRestaurant >= 30 || this.capRestaurant <= 50) {
            valorRestaurant = 30;
        } else {
            valorRestaurant = 50;
        }
        this.precioHab += capHotel + valorRestaurant + 30;
        return this.precioHab;
    }

    @Override
    public String toString() {
        return "Hotel4Estrellas{" +
                "TipoGym='" + TipoGym + '\'' +
                ", nombRestaurant='" + nombRestaurant + '\'' +
                ", capRestaurant=" + capRestaurant +
                ", cantHabitaciones=" + cantHabitaciones +
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
