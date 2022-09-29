package tp4_obligatorio;

import GUI.GuiMain;
import entidades.Alumno;
import entidades.Materia;
import java.util.Collections;
import java.util.HashSet;

public class Colegio {
    private static HashSet<Alumno>alumnos=new HashSet<>();
    private static HashSet<Materia> materias = new HashSet();

    public static HashSet<Materia> getMaterias() {
        return materias;
    }
        
    public static HashSet<Alumno> getAlumnos() {
        return alumnos;
    }
    
    public static void main(String[] args) {
        Materia m1 = new Materia(101, "Inglés 1", 1);
        Materia m2 = new Materia(102, "Matemática", 1);
        Materia m3 = new Materia(103, "Laboratorio 1", 1);

        Alumno n1 = new Alumno("Martín", "Lopez", 1001);
        Alumno n2 = new Alumno("Brenda", "Martinez", 1002);
        Collections.addAll(alumnos, n1,n2);
        Collections.addAll(materias, m1,m2,m3);
        
        //añadimos las 3 materias a ambos alumnos
        n1.agregarMateria(m1);
        n1.agregarMateria(m2);
        n1.agregarMateria(m3);

        n2.agregarMateria(m1);
        n2.agregarMateria(m2);
        n2.agregarMateria(m3);
        
        //no se puede añadir Lab por segunda vez ya que cada alumno tiene 
        //un HashSet de materias y no acepta elementos repetidos.
        n2.agregarMateria(m3);
        
        //cantidad de materias por alumno
        System.out.println("El alumno " + n1.getNombre() + " " + n1.getApellido() + " está inscriptó en " + n1.cantidadMaterias() + " materias.");
        System.out.println("El alumno " + n2.getNombre() + " " + n2.getApellido() + " está inscriptó en " + n1.cantidadMaterias() + " materias.");

        GuiMain main=new GuiMain();
        main.setVisible(true);
        main.setLocationRelativeTo(null);
        
        
        
    }
   

}
