package ilich.guia13_eje3;

import java.util.Scanner;

/**
 *
 * @author Ilich Dell
 */
public class Guia13_eje3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el dividendo:");
        String dividendo = input.next();

        System.out.println("Ingrese el divisor:");
        String divisor = input.next();

        try {
            int num1 = Integer.parseInt(dividendo);
            int num2 = Integer.parseInt(divisor);
            try {
                if (num2 == 0) {
                    throw new ArithmeticException();
                }
                double result = (double) num1 / num2;
                System.out.println("division = " + result);
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir por cero");
            }
        } catch (NumberFormatException a) {
            System.out.println("Alguno de los valores ingresados NO es un numero");
        }
    }
}
