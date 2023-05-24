package entidades;

/**
 *
 * @author Ilich Dell
 * 
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posición 
 * actual (posición del tambor que se dispara, puede que esté el agua o no) y 
 * posición agua (la posición del tambor donde se encuentra el agua). Estas 
 * dos posiciones, se generarán aleatoriamente.
 */
public class Revolver {
    
    private Integer posicionActual, posicionCarga;
    
    public Revolver () {
    }

    public Revolver(Integer posicionActual, Integer posicionCarga) {
        this.posicionActual = posicionActual;
        this.posicionCarga = posicionCarga;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionCarga() {
        return posicionCarga;
    }

    public void setPosicionCarga(Integer posicionCarga) {
        this.posicionCarga = posicionCarga;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionCarga=" + posicionCarga + '}';
    }
    
    
}
