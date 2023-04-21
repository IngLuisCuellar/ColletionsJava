package Colletions;

import java.util.*;
import java.util.stream.Collectors;

public class Clases {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Geometria", 20);
        Curso curso2 = new Curso("Fisica", 30);
        Curso curso3 = new Curso("Quimica", 30);
        Curso curso4 = new Curso("Matematicas", 35);
        Curso curso5 = new Curso("Hisotoria", 20);

        //Implemntacion de un array vacio de tipo Curso
        ArrayList<Curso> cursos = new ArrayList<>();

        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        cursos.add(curso5);

        System.out.println(cursos);

        //Se debe implementar Comparable en la clase
        Collections.sort(cursos);
        //cursos.sort(Collections.reverseOrder());

        System.out.println(cursos);

    }
}
