import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

public class animalesMain {
    public static void main(String[] args) {
        Animal perro1 = new Perro("Stich", "Carne", 15, "Doberman");
        Animal perro2 = new Perro("Teddy", "croquetas", 10, "Chihuahua");
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "fino");

        perro1.alimentarse();
        perro2.alimentarse();
        gato1.alimentarse();
        caballo1.alimentarse();
    }
}
