package entidades;

/**
 *
 * @author Ilich Dell
 */
public class Hotel5Estrellas extends Hotel4Estrellas {

    protected Integer cantSalonesConf, cantSuites, cantLimosina;

    public Hotel5Estrellas(String nombre, String direccion, String localidad, String gerenteEnc, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, Double precioHab, Boolean gym, String tipoGym, String nombRestaurant, Integer capRestaurant, Integer cantSalonesConf, Integer cantSuites, Integer cantLimosina) {
        super(nombre, direccion, localidad, gerenteEnc, cantHabitaciones, numCamas, cantPisos, precioHab, gym, tipoGym="Tipo A", nombRestaurant, capRestaurant);
        this.cantSalonesConf = cantSalonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosina = cantLimosina;
    }

    public Integer getCantSalonesConf() {
        return cantSalonesConf;
    }

    public void setCantSalonesConf(Integer cantSalonesConf) {
        this.cantSalonesConf = cantSalonesConf;
    }

    public Integer getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(Integer cantSuites) {
        this.cantSuites = cantSuites;
    }

    public Integer getCantLimosina() {
        return cantLimosina;
    }

    public void setCantLimosina(Integer cantLimosina) {
        this.cantLimosina = cantLimosina;
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
        int valorLimosina = this.cantLimosina * 15;
        this.precioHab += capHotel + valorRestaurant + 50 + valorLimosina;
        return this.precioHab;
    }

    @Override
    public String toString() {
        return "Hotel5Estrellas{" +
                "cantSalonesConf=" + cantSalonesConf +
                ", cantSuites=" + cantSuites +
                ", cantLimosina=" + cantLimosina +
                ", TipoGym='" + TipoGym + '\'' +
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
