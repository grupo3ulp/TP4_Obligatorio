package tp4_obligatorio;

import entidades.Alumno;
import entidades.Materia;

public class Colegio {

    public static void main(String[] args) {

        Materia m1 = new Materia(101, "Inglés 1", 1);
        Materia m2 = new Materia(102, "Matemática", 1);
        Materia m3 = new Materia(103, "Laboratorio 1", 1);

        Alumno n1 = new Alumno("Martín", "Lopez", 1001);
        Alumno n2 = new Alumno("Brenda", "Martinez", 1002);

        n1.agregarMateria(m1);
        n1.agregarMateria(m2);
        n1.agregarMateria(m3);

        n2.agregarMateria(m1);
        n2.agregarMateria(m2);
        n2.agregarMateria(m3);
        
        //ver que no te deje hacer esto
        n2.agregarMateria(m3);
        
        //cantidad de materias
        System.out.println(n1.cantidadMaterias());
        System.out.println(n2.cantidadMaterias());

    }

}
