package entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    protected Double carga;
    public Lavadora() {
    }

    public Lavadora(Double precio, Double peso, String color, Character consumo, Double carga) {
        super(precio, peso, color, consumo);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    public Lavadora crearLavadora() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico electro = crearElectro();
        System.out.println("Ingrese de cuanto es la carga de la lavadora");
        double carga = input.nextDouble();

        return new Lavadora(electro.getPrecio(), electro.getPeso(), electro.getColor(), electro.getConsumo(), carga);
    }

    public void precioFinal(Lavadora lava) {
        super.precioFinal(lava);
        if (lava.getCarga() > 30) {
            lava.setPrecio(lava.getPrecio() + 500);
        }
    }


    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                ", precio=" + precio +
                ", peso=" + peso +
                ", color='" + color + '\'' +
                ", consumo=" + consumo +
                '}';
    }
}