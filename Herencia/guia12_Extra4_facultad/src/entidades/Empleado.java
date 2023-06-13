package entidades;

import java.util.Date;
import java.util.Scanner;

public abstract class Empleado extends Persona{

    protected Date incorpFacu;
    protected Integer despacho;

    public Empleado(String nombre, String apellido, String estadoCivil, Date incorpFacu, Integer despacho) {
        super(nombre, apellido, estadoCivil);
        this.incorpFacu = incorpFacu;
        this.despacho = despacho;
    }

    public Date getIncorpFacu() {
        return incorpFacu;
    }

    public void setIncorpFacu(Date incorpFacu) {
        this.incorpFacu = incorpFacu;
    }

    public Integer getDespacho() {
        return despacho;
    }

    public void setDespacho(Integer despacho) {
        this.despacho = despacho;
    }

    protected abstract String cambioEstadoCivil();
    protected abstract String reasignacion();

    @Override
    public String toString() {
        return "Empleado{" +
                "incorpFacu=" + incorpFacu +
                ", despacho=" + despacho +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
