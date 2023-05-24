/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author toto_
 */
public enum Signos {
    ESPADAS("Espadas"),ORO("Oro"),BASTO("Basto"),COPAS("Copas");
    
    private String signo;

    private Signos(String signo) {
        this.signo = signo;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    
    
}
