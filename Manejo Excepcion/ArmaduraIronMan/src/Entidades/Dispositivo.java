/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Excepciones.DispositivoDaniado;

/**
 *
 * @author Diego
 */
public class Dispositivo {
    protected float consumoEnergia;
    protected boolean daniado;

    public Dispositivo(float consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public Dispositivo() {
    }

    public float getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(float consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }
    
    public float usarDispositivo(int segundos,int intensidad) throws DispositivoDaniado{
        try {
            if(daniado){
            throw new DispositivoDaniado("Error: Dispositivo Dañado \nNo se realizo la acción");
        }
        float probDanio=(float) Math.random();
        daniado=(probDanio<0.3); 
        return consumoEnergia*intensidad*segundos;
        } catch (DispositivoDaniado e) {
            System.out.println(e.getMessage());
            return 0;
        } 
    }

    public boolean isDaniado() {
        return daniado;
    }

    public void setDaniado(boolean daniado) {
        this.daniado = daniado;
    }
    
    @Override
    public String toString() {
        return (daniado)? "Dañado":"Sin Daños";
    }
    
}
