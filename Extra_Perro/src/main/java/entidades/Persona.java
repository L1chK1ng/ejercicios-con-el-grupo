package entidades;

public class Persona {

    private String nombre, apellido, doc;
    private Integer edad;
    private Perro perro;


    public Persona() {

    }

    public Persona(String nombre, String apellido, String doc, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.doc = doc;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", doc='" + doc + '\'' +
                ", edad=" + edad +
                ", \n y su perro=" + perro +
                '}';
    }
}
