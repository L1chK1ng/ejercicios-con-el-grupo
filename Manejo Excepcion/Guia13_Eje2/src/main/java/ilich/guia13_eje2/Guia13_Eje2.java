package ilich.guia13_eje2;

import java.util.Scanner;

/**
 *
 * @author Ilich Dell
 */
public class Guia13_Eje2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String[] letras = new String[5];
        int num = 0;
        
        try {
            System.out.println("Ingrese cuantas letras");
            num = input.nextInt();
            for (int i = 0; i < num; i++) {
                letras[i] = "a";
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se desbordo el arreglo");
            main(args);
           
        }
    }
}
