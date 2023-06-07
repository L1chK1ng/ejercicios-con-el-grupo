package entidades;

/**
 *
 * @author Ilich Dell
 */
public class Hotel4Estrellas extends Hotel {
    
    protected Boolean gimnasio;
    protected String nombRestaurant;
    protected Integer capRestaurant;
    
    public Hotel4Estrellas(Boolean gimnasio, String nombRestaurant, Integer capRestaurant, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, Double precioHab, String nombre, String direccion, String localidad, String gerenteEnc) {
        super(cantHabitaciones, numCamas, cantPisos, precioHab, nombre, direccion, localidad, gerenteEnc);
        this.gimnasio = gimnasio;
        this.nombRestaurant = nombRestaurant;
        this.capRestaurant = capRestaurant;
    }

    public Boolean getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Boolean gimnasio) {
        this.gimnasio = gimnasio;
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

    @Override
    public String toString() {
        return "Hotel4Estrellas{" + "gimnasio=" + gimnasio + ", nombRestaurant=" + nombRestaurant + ", capRestaurant=" + capRestaurant + '}';
    }
    
}
