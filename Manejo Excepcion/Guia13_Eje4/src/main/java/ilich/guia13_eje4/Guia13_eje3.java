package ilich.guia13_eje3;

import java.util.InputMismatchException;
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
            System.out.println("Ingrese cuantas divisiones quiere realizar");
            int nDivisiones = input.nextInt();
            input.nextLine();
            int num1 = Integer.parseInt(dividendo);
            int num2 = Integer.parseInt(divisor);

            if (num2 == 0) {
                throw new ArithmeticException();
            }
            for (int i = 0; i < nDivisiones; i++) {
                double result = (double) num1 / num2;
                System.out.println("division = " + result);
            }

        } catch (InputMismatchException i) {
            System.out.println("La cantidad de veces que se desea dividir tiene que ser un entero");
        } catch (NumberFormatException a) {
            System.out.println("Alguno de los valores ingresados NO es un numero");
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        }
    }
}
