/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Enums.Signos;
import Enums.Valores;
import java.util.HashMap;

/**
 *
 * @author toto_
 */
public class Cartas {
    private Valores valor;
    private Signos signo;

    public Cartas() {
    }

    public Cartas(Valores valor, Signos signo) {
        this.valor = valor;
        this.signo = signo;
    }

    public Valores getValor() {
        return valor;
    }

    public void setValor(Valores valor) {
        this.valor = valor;
    }

    public Signos getSigno() {
        return signo;
    }

    public void setSigno(Signos signo) {
        this.signo = signo;
    }

    
    @Override
    public String toString() {
        return "Carta: " +  valor+ " de "+signo;
    }
    
    
}
