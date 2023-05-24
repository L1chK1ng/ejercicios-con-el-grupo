package entidades;

/**
 *
 * @author Ilich Dell
 */
public class Jugador {
    
    private Integer id;
    private String nombre;
    private Boolean mojado=false;
    
    public Jugador() {
    }

    public Jugador(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public void setId (Integer id) {
        this.id = id;
    }
    
    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
    
}
