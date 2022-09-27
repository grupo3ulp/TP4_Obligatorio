package entidades;

import java.util.ArrayList;

public class Alumno {

    private String nombre;
    private String apellido;
    private int legajo;
    private ArrayList<Materia> materias = new ArrayList();

    public Alumno(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public Alumno(String nombre, String apellido, int legajo, ArrayList materias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.materias = materias;
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

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
    
    //Se le pasa una materia por parámetro y se agrega al ArrayList
    public void agregarMateria(Materia m) {
        materias.add(m);
    }

    //Devuelve la cantidad de materias en la que está inscripto el alumno
    public int cantidadMaterias() {
        return materias.size();
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", legajo=" + legajo + ", materias=" + materias + '}';
    }
    

}
