package entidades;

public class Animal {

    protected String nombre, alimento;
    protected  Integer edad;
    protected String raza;

    public Animal() {
    }

    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public void alimentarse() {
        System.out.println("Me alimento de " + this.alimento);
    }
}
