package entidades;

import enums.Coche;
import enums.Moto;

/**
 *
 * @author Ilich
 */
public class Vehiculo {
    
    private String marca, modelo;
    private Integer anio;
    private String serialMotor, chasis;
    private String color;
    private Moto tipoMoto;
    private Coche tipoCoche;
    
    public Vehiculo () {
    }

    public Vehiculo(String marca, String modelo, Integer anio, String serialMotor, String chasis, String color, Moto tipoMoto) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.serialMotor = serialMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipoMoto = tipoMoto;
    }
    
    public Vehiculo(String marca, String modelo, Integer anio, String serialMotor, String chasis, String color, Coche tipoCoche) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.serialMotor = serialMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipoCoche = tipoCoche;
    }
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getSerialMotor() {
        return serialMotor;
    }

    public void setSerialMotor(String serialMotor) {
        this.serialMotor = serialMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Moto getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(Moto tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    public Coche getTipoCoche() {
        return tipoCoche;
    }

    public void setTipoCoche(Coche tipoCoche) {
        this.tipoCoche = tipoCoche;
    }

    @Override
    public String toString() {
        return "Vehiculo{ " + "marca: " + marca + "\n modelo: " + modelo + "\n año: " + anio + "\n Serial de motor: " + serialMotor + "\n Casis: " + chasis + "\n Color: " + color + "\n TipoMoto: " + tipoMoto + "\n tipoCoche: " + tipoCoche + '}';
    }
    
}
