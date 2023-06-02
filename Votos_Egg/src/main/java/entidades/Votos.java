package entidades;

import java.util.ArrayList;

public class Votos {

    private Alumno alumnoQueVota;
    private ArrayList<Alumno> alumnosQueVoto;

    public Votos() {

    }

    public Votos(Alumno alumnoQueVota, ArrayList<Alumno> alumnosQueVoto) {
        this.alumnoQueVota = alumnoQueVota;
        this.alumnosQueVoto = alumnosQueVoto;
    }

    public Alumno getAlumnoQueVota() {
        return alumnoQueVota;
    }

    public void setAlumnoQueVota(Alumno alumnoQueVota) {
        this.alumnoQueVota = alumnoQueVota;
    }

    public ArrayList<Alumno> getAlumnosQueVoto() {
        return alumnosQueVoto;
    }

    public void setAlumnosQueVoto(ArrayList<Alumno> alumnosQueVoto) {
        this.alumnosQueVoto = alumnosQueVoto;
    }

    @Override
    public String toString() {
        return "Votos{" +
                "alumnoQueVota=" + alumnoQueVota +
                "\n alumnosQueVoto=" + alumnosQueVoto.iterator().next().getDni() + " \n Nombre:" +
                " " + alumnosQueVoto.iterator().next().getNombre() +
                '}';
    }
}
