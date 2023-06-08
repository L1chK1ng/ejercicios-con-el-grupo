package entidades;

public abstract class ExtraHotel extends Alojamiento {

    protected Boolean privado;
    protected Double superficie;

    public ExtraHotel(String nombre, String direccion, String localidad, String gerenteEnc, Boolean privado, Double superficie) {
        super(nombre, direccion, localidad, gerenteEnc);
        this.privado = privado;
        this.superficie = superficie;
    }

    public Boolean isPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "ExtraHotel{" +
                "privado=" + privado +
                ", superficie=" + superficie +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerenteEnc='" + gerenteEnc + '\'' +
                '}';
    }
}
