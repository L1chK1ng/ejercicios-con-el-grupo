package entidades;

public class Residencia extends ExtraHotel {

    protected Integer cantHabitacion;
    protected Boolean descGremio, campDeportivo;

    public Residencia(String nombre, String direccion, String localidad, String gerenteEnc, Boolean privado, Double superficie, Integer cantHabitacion, Boolean descGremio, Boolean campDeportivo) {
        super(nombre, direccion, localidad, gerenteEnc, privado, superficie);
        this.cantHabitacion = cantHabitacion;
        this.descGremio = descGremio;
        this.campDeportivo = campDeportivo;
    }

    public Integer getCantHabitacion() {
        return cantHabitacion;
    }

    public void setCantHabitacion(Integer cantHabitacion) {
        this.cantHabitacion = cantHabitacion;
    }

    public Boolean getDescGremio() {
        return descGremio;
    }

    public void setDescGremio(Boolean descGremio) {
        this.descGremio = descGremio;
    }

    public Boolean getCampDeportivo() {
        return campDeportivo;
    }

    public void setCampDeportivo(Boolean campDeportivo) {
        this.campDeportivo = campDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" +
                "cantHabitacion=" + cantHabitacion +
                ", descGremio=" + descGremio +
                ", campDeportivo=" + campDeportivo +
                ", privado=" + privado +
                ", superficie=" + superficie +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerenteEnc='" + gerenteEnc + '\'' +
                '}';
    }
}
