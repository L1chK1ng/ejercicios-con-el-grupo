package entidades;

public abstract class Edificio {

    protected  Double ancho, largo, alto;

    public Edificio(Double ancho, Double largo, Double alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public abstract double calcularSuperficie();
    public abstract double calcularVolumen();

    @Override
    public String toString() {
        return "Edificio{" +
                "ancho=" + ancho +
                ", largo=" + largo +
                ", alto=" + alto +
                '}';
    }
}
