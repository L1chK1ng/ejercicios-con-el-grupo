package entidades;

public class Camping extends ExtraHotel{

    protected Integer maximoCarpas, cantBanios;
    protected Boolean restaurant;

    public Camping(String nombre, String direccion, String localidad, String gerenteEnc, Boolean privado, Double superficie, Integer maximoCarpas, Integer cantBanios, Boolean restaurant) {
        super(nombre, direccion, localidad, gerenteEnc, privado, superficie);
        this.maximoCarpas = maximoCarpas;
        this.cantBanios = cantBanios;
        this.restaurant = restaurant;
    }

    public Integer getMaximoCarpas() {
        return maximoCarpas;
    }

    public void setMaximoCarpas(Integer maximoCarpas) {
        this.maximoCarpas = maximoCarpas;
    }

    public Integer getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(Integer cantBanios) {
        this.cantBanios = cantBanios;
    }

    public Boolean getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Boolean restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Camping{" +
                "maximoCarpas=" + maximoCarpas +
                ", cantBanios=" + cantBanios +
                ", restaurant=" + restaurant +
                ", privado=" + privado +
                ", superficie=" + superficie +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerenteEnc='" + gerenteEnc + '\'' +
                '}';
    }
}
