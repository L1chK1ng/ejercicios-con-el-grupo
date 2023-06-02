package entidades;

public final class Caballo extends Animal {

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("Me alimento de " + alimento);
    }
}
