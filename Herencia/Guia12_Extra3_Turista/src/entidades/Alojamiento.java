package entidades;

/**
 *
 * @author Ilich Dell
 */
public class Alojamiento {
    
    protected String nombre, direccion, localidad, gerenteEnc;

    public Alojamiento() {

    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerenteEnc) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerenteEnc = gerenteEnc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerenteEnc() {
        return gerenteEnc;
    }

    public void setGerenteEnc(String gerenteEnc) {
        this.gerenteEnc = gerenteEnc;
    }

    @Override
    public String toString() {
        return "Alojamiento{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerenteEnc='" + gerenteEnc + '\'' +
                '}';
    }
    
}
