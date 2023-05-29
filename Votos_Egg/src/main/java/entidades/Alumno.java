package entidades;

/**
 *
 * @author Ilich
 * 
 * El sistema de votación de Egg tiene una clase llamada Alumno con los siguientes atributos:
nombre completo, DNI y cantidad de votos. Además, crearemos una clase Simulador que va a
tener los métodos para manejar los alumnos y sus votaciones. Estos métodos serán llamados
desde el main.
 */
public class Alumno {
    
    private String dni, nombre;
    private Integer votos;
    
    public Alumno() {
        
    }

    public Alumno(String dni, String nombre, Integer votos) {
        this.dni = dni;
        this.nombre = nombre;
        this.votos = votos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "dni=" + dni + ", nombre=" + nombre + ", votos=" + votos + '}';
    }
    
    
    
}
