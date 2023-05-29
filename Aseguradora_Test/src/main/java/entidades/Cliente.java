package entidades;

import java.util.ArrayList;

/**
 *
 * @author Ilich
 */
public class Cliente {
    
    private String documento;
    private String nombre, apellido, mail, domicilio, telefono;
    private ArrayList <Vehiculo> vehiculos;
    
    public Cliente() {
    }

    public Cliente(String documento, String nombre, String apellido, String mail, String domicilio, String telefono, ArrayList<Vehiculo> vehiculos) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.vehiculos = vehiculos;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", domicilio=" + domicilio + ", telefono=" + telefono + ", vehiculos=" + vehiculos + '}';
    }

    
}
