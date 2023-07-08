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
public class ArmaduraIron extends Armadura{
    private float energia; //amperio*hora
    private String colorPrim, colorSec;
    private Bota botaDer, botaIzq;
    private Guante guanteDer,guanteIzq;
    private Casco casco;

    public ArmaduraIron(float energia, String colorPrim, String colorSec, Bota botaDer, Bota botaIzq, Guante guanteDer, Guante guanteIzq, Casco casco) {
        this.energia = energia;
        this.colorPrim = colorPrim;
        this.colorSec = colorSec;
        this.botaDer = botaDer;
        this.botaIzq = botaIzq;
        this.guanteDer = guanteDer;
        this.guanteIzq = guanteIzq;
        this.casco = casco;
    }

    public ArmaduraIron(float energia, String colorPrim, String colorSec, Bota botaDer, Bota botaIzq, Guante guanteDer, Guante guanteIzq, Casco casco, float salud, int dureza) {
        super(salud, dureza);
        this.energia = energia;
        this.colorPrim = colorPrim;
        this.colorSec = colorSec;
        this.botaDer = botaDer;
        this.botaIzq = botaIzq;
        this.guanteDer = guanteDer;
        this.guanteIzq = guanteIzq;
        this.casco = casco;
    }

    public ArmaduraIron() {
    }


    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }


    public String mostrarInformacionArmadura() {
        String mensaje="Estado del traje:\n";
        
        String porcentajeEnergia= estadoBateria();
        
        mensaje+="Energía del traje: " + porcentajeEnergia;
        mensaje+="Consola: " + casco.getConsola().toString()+"\n";
        mensaje+="Sintetizador: " + casco.getSintetizador().toString()+"\n";
        mensaje+="Guante Derecho: " + guanteDer.toString()+"\n";
        mensaje+="Guante Izquierdo: " + guanteIzq.toString()+"\n";
        mensaje+="Bota Derecho: " + botaDer.toString()+"\n";
        mensaje+="Bota Izquierdo: " + botaIzq.toString()+"\n";
        mensaje+="-----------------";
        return mensaje;
    }
    
    public String estadoBateria(){
        return "Energía del traje: "+((energia/Float.MAX_VALUE)*100)+"%";
    }
    
    public String estadoReactor(){
        String mensaje="Carga del reactor:\n";
        mensaje+=energia+" Amper por hora\n";
        mensaje+=(energia*1000)+" Mili Amper por hora\n";
        mensaje+=(energia/3600)+" Columbio\n";
        return mensaje;
        
    }
    
    
    public float caminar(int segundos) throws DispositivoDaniado{
        return botaIzq.usarDispositivo(segundos,1)+botaDer.usarDispositivo(segundos,1);
    }
    
    public float correr(int segundos) throws DispositivoDaniado{
        return botaIzq.usarDispositivo(segundos,2)+botaDer.usarDispositivo(segundos,2);
    }
    
    public float propulsarse(int segundos) throws DispositivoDaniado{
        return botaIzq.usarDispositivo(segundos,3)+botaDer.usarDispositivo(segundos,3);
    }
    
    public float volar(int segundos) throws DispositivoDaniado {
        float consumoBotas=botaIzq.usarDispositivo(segundos,3)+botaDer.usarDispositivo(segundos,3);
        float consumoGuantes=guanteDer.usarDispositivo(segundos,2)+guanteIzq.usarDispositivo(segundos,2);
        return consumoBotas+consumoGuantes;
    }
    
    public float dispararIzq(int segundos) throws DispositivoDaniado{
        return guanteIzq.usarDispositivo(segundos, 3);
    }
    public float dispararDer(int segundos) throws DispositivoDaniado{
        return guanteDer.usarDispositivo(segundos, 3);
    }
    public float dispararAmbos(int segundos) throws DispositivoDaniado{
        return (dispararIzq(segundos)+dispararDer(segundos));
    }
    
    public float escribir() throws DispositivoDaniado{
        return casco.getConsola().usarDispositivo(1,1);
    }
    public float escuchar() throws DispositivoDaniado{
        return casco.getSintetizador().usarDispositivo(1,1);
    }
    
   
}
