package Colletions;

import Colletions.model.Clase;
import Colletions.model.Curso;

import java.util.ArrayList;

public class ClaseUsingType {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Geometria", 10);
        curso1.addClase(new Clase("ArrayList"));
        curso1.addClase(new Clase("Linkedlist"));
        curso1.addClase(new Clase("List"));

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);

        System.out.println(cursos.get(0).getClaseList());
    }
}
