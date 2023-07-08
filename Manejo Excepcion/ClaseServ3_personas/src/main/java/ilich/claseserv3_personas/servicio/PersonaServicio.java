
package ilich.claseserv3_personas.servicio;

import ilich.claseserv3_personas.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Ilich Dell
 */
public class PersonaServicio {
    
    Persona p1 = new Persona();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public boolean mayorEdad(Persona p1) {
        boolean mayor=false;
        if (p1.getEdad() >= 18) {
            mayor = true;
        }
        
        return mayor;
    }
    
    public void crearPersona() {
        System.out.print("Ingrese el nombre: ");
        p1.setNombre(leer.next());
        System.out.print("Ingrese la edad: ");
        p1.setEdad(leer.nextInt());
        //leer.next();
        
        String sexo;
        do {
           System.out.println("Ingrese el sexo Masculino 'M' Femenino 'F' Otros 'O");
           sexo = leer.next();
        } while (!sexo.equals("m") && !sexo.equals("f") && !sexo.equals("o"));
        p1.setSexo(sexo);

        System.out.print("Ingrese el peso: ");
        p1.setPeso(leer.nextFloat());
        System.out.print("Ingrese la altura: ");
        p1.setAltura(leer.nextFloat());
    }
    
    public int calcularIMC() {
        double total;
        int imc;
        
        total =  p1.getPeso()/Math.pow(p1.getAltura(), 2);
        
        if (total < 20) {
            imc = -1;
        } else if (total >= 20 && total <= 25) {
            imc = 0;
        } else imc=1;
        
        return imc;
    }
    
    public void porcen(int imc, boolean sexo) {
        
    }
    
}
