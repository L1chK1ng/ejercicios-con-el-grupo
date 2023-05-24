/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author toto_
 */
public enum Valores {
    UNO("1"),DOS("2"),TRES("3"),CUATRO("4"),CINCO("5"),SEIS("6"),SIETE("7"),SOTA("Sota"),CABALLO("Caballo"),REY("Rey");
    
    private String nombre;

    private Valores(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
