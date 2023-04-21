package Colletions;

import java.util.*;
import java.util.stream.Collectors;

public class Clases {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Geometria", 10);
        Curso curso2 = new Curso("Fisica", 30);
        Curso curso3 = new Curso("Quimica", 50);
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

        //Método 1
        cursos.sort(Comparator.comparing(Curso::getNombre));
        System.out.println(cursos);


        //Método 2 usando Colletions
        Collections.sort(cursos,Comparator.comparing(Curso::getNombre).reversed());
        System.out.println(cursos);

        //Método 3 Streams --> Requiere usar el método collect(Colletors.toList()) y la interfaz List<> de Java.util
        List<Curso> cursoList = cursos.stream().sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
        System.out.println(cursoList);

        //Implementando un  filtro usando lamnda y streams
        List<Curso> cursoListFilter = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Quimica")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
        System.out.println(cursoListFilter);
    }
}
