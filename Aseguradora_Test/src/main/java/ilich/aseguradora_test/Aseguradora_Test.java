package ilich.aseguradora_test;

import entidades.Cliente;
import java.sql.Time;
import java.util.Date;
import java.util.Scanner;
import services.SeguroService;

/**
 *
 * @author Ilich
 */
public class Aseguradora_Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        SeguroService ss = new SeguroService();
        
        //ss.menuCliente();
        
        ss.menuPpal();
        
    }
}
