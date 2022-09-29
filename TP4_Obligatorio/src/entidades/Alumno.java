package entidades;

import java.util.HashSet;

public class Alumno {

    private String nombre;
    private String apellido;
    private int legajo;
    private HashSet<Materia> materias = new HashSet();

    public Alumno(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public Alumno() {
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(HashSet<Materia> materias) {
        this.materias = materias;
    }

    //Se le pasa una materia por parámetro y se agrega al HashSet
    public boolean agregarMateria(Materia m) {
        boolean done = false;
        int size1 = materias.size();
        materias.add(m);
        int size2 = materias.size();

        if (size2 > size1) {
            done = true;
        }
        return done;
    }

    //Devuelve la cantidad de materias en la que está inscripto el alumno
    public int cantidadMaterias() {
        return materias.size();
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }

    public String mostrarAlumno() {
        return "Nombre: " + nombre + "\n"
                + "Apellido: " + apellido + "\n"
                + "Legajo: " + legajo + "\n"
                + "Materias: " + materias + "\n";
    }

}
