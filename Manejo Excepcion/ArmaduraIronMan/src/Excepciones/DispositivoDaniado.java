package Excepciones;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */


/**
 *
 * @author Diego
 */
public class DispositivoDaniado extends Exception{

    /**
     * Creates a new instance of <code>DispositivoDaniado</code> without detail
     * message.
     */
    public DispositivoDaniado() {
        
    }

    /**
     * Constructs an instance of <code>DispositivoDaniado</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DispositivoDaniado(String msg) {
        super(msg);
    }
}
