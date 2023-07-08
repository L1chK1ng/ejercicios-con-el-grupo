/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Diego
 */
public class Casco {
    private Sintetizador sintetizador;
    private Consola consola;

    public Casco(Sintetizador sintetizador, Consola consola) {
        this.sintetizador = sintetizador;
        this.consola = consola;
    }

    public Casco() {
    }

    public Sintetizador getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(Sintetizador sintetizador) {
        this.sintetizador = sintetizador;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    @Override
    public String toString() {
        return "Casco{" + "sintetizador=" + sintetizador + ", consola=" + consola + '}';
    }
    
    
}
