/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ilich.cine_extra;

import entidades.Espectador;
import service.CineService;

/**
 *
 * @author Ilich Dell
 */
public class Cine_Extra {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String[][] sala = new String[8][6];
        
        CineService cs = new CineService();
        
        for (int f = 0; f < 8; f++) {
            for (int c = 0; c < 6; c++) {
                System.out.print((f+1));
                switch (c) {
                    case 0:
                        System.out.print("A  "); break;
                    case 1:
                        System.out.print("B  "); break;
                    case 2:
                        System.out.print("C  "); break;
                    case 3:
                        System.out.print("D  "); break;
                    case 4:
                        System.out.print("E  "); break;
                    case 5:
                        System.out.print("F  "); break;
                }
            }
            System.out.println("");
        }
        
        System.out.println("\n");
        
        for (int f = 0; f < 8; f++) {
            for (int c = 0; c < 6; c++) {
                switch (c) {
                    case 0:
                        sala[f][c] = (f+1) + "A "; break;
                    case 1:
                        sala[f][c] = (f+1) + "B "; break;
                    case 2:
                        sala[f][c] = (f+1) + "C "; break;
                    case 3:
                        sala[f][c] = (f+1) + "D "; break;
                    case 4:
                        sala[f][c] = (f+1) + "E "; break;
                    case 5:
                        sala[f][c] = (f+1) + "F "; break;
                        
            }
                
                }
            
            
        }
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(sala[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("\n");
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                sala[i][j] += "[X] ";
            }
        }
        
        System.out.println("\n");
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(sala[i][j] + " ");
            }
            System.out.println("");
        }
        
        cs.boleteria();
        
    }
}
