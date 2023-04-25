package Colletions;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

//Set no permite duplicados

public class ClassSet {

    public static void main(String[] args) {
        String alumno1 = "Hector";
        String alumno2 = "Javier";
        String alumno3 = "Xavi";
        String alumno4 = "Rodolfo";
        String alumno5 = "Andres";
        String alumno6 = "Felipe";
        String alumno7 = "Miguel";

        Set<String> listaAlumn = new HashSet<>();

        listaAlumn.add(alumno1);
        listaAlumn.add(alumno2);
        listaAlumn.add(alumno3);
        listaAlumn.add(alumno4);
        listaAlumn.add(alumno5);
        listaAlumn.add(alumno6);
        listaAlumn.add(alumno7);

        System.out.println(listaAlumn);

        for (String alumno:listaAlumn) {
            System.out.println(alumno);
        }

        boolean presente = listaAlumn.contains("Xavi");
        System.out.println(presente);

        String max =listaAlumn.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(max);

        listaAlumn.removeIf(alumno -> "Xavi".equalsIgnoreCase(alumno));
        System.out.println(listaAlumn);

        

    }

}
