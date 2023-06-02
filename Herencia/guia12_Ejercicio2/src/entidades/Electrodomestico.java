package entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected Double precio, peso;
    protected String color;
    protected Character consumo;

    public Electrodomestico() {

    }

    public Electrodomestico(Double precio, Double peso, String color, Character consumo) {
        this.precio = precio;
        this.peso = peso;
        this.color = comprobarColor(color);
        this.consumo = comprobarConsumo(consumo);
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumo() {
        return consumo;
    }

    public void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    /*
    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
     */
    private Character comprobarConsumo(Character a) {
        if (a >= 'a' && a <= 'f') {
            a = a;
        } else {
            a = 'f';
        }

        return a;
    }

    /*
    Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
     */
    private String comprobarColor(String c) {
        if ((c.equalsIgnoreCase("blanco")) || (c.equalsIgnoreCase("negro")) || (c.equalsIgnoreCase("rojo")) || (c.equalsIgnoreCase("azul")) || (c.equalsIgnoreCase("gris"))) {
            c = c;
        } else {
            c = "Blanco";
        }

        return c;
    }

    /*
    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
     */
    public Electrodomestico crearElectro() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
    }
}
