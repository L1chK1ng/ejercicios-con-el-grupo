package entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    protected Double pulgada;
    protected Boolean TDT;

    public Televisor() {
    }

    public Televisor(Double precio, Double peso, String color, Character consumo, Double pulgada, Boolean TDT) {
        super(precio, peso, color, consumo);
        this.pulgada = pulgada;
        this.TDT = TDT;
    }

    public Double getPulgada() {
        return pulgada;
    }

    public void setPulgada(Double pulgada) {
        this.pulgada = pulgada;
    }

    public Boolean getTDT() {
        return TDT;
    }

    public void setTDT(Boolean TDT) {
        this.TDT = TDT;
    }

    /*
    Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
     */
    public Televisor crearTele() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico electro = crearElectro();
        System.out.println("Ingrese las pulgadas del TV");
        double pulgadas = input.nextDouble();

        Character tieneTDT = 'n';
        boolean TDT = false;
           do {
               if (!(tieneTDT == 's' || tieneTDT == 'S' || tieneTDT == 'N' || tieneTDT == 'n')) {
                   System.out.println("Disculpe, esta limitado a S/N");
               }
               System.out.println("Tiene sintonizador TDT ? S/N");
                tieneTDT = input.next().charAt(0);

               if (tieneTDT == 's' || tieneTDT == 'S') {
                   TDT = true;
               }
           } while (!(tieneTDT == 's' || tieneTDT == 'S' || tieneTDT == 'N' || tieneTDT == 'n'));

        return new Televisor(electro.getPrecio(), electro.getPeso(), electro.getColor(), electro.getConsumo(), pulgadas, TDT);
    }

    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
     */

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.pulgada > 40) {
            this.precio = this.precio * 1.30;
        }

        if (this.TDT) {
            this.precio = this.precio + 500;
        }
    }


    @Override
    public String toString() {
        return "Televisor{" +
                "pulgada=" + pulgada +
                ", TDT=" + TDT +
                ", precio=" + precio +
                ", peso=" + peso +
                ", color='" + color + '\'' +
                ", consumo=" + consumo +
                '}';
    }
}
