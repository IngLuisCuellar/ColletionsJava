package Colletions;

import java.util.*;
import java.util.stream.Collectors;

public class Ejemplo1ArrayList {
    public static void main(String[] args) {
        String variable1 = "Ejemplo 1";
        String variable2 = "Ejemplo 2";
        String variable3 = "Ejemplo 3";
        String variable4 = "Ejemplo 4";

        //Implemntacion de un array vacio de strings
        ArrayList<String> lista = new ArrayList<>();

        //Añadir
        lista.add(variable4);
        lista.add(variable2);
        lista.add(variable3);
        lista.add(variable1);
        lista.add(variable2);

        System.out.println(lista);

        //Eliminar
        lista.remove(2);
        System.out.println(lista);

        //Modificar
        lista.set(2,"Ejemplo alterado");
        System.out.println(lista);

        //Ver tamaño de lista
        System.out.println(lista.size());

        //Leer Arrays-List

        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        //forEach
        for (String ejemplo: lista) {
            System.out.println(ejemplo);
        }

        //forEach recurso de lambdas
        lista.forEach(ejemplo ->{
            System.out.println(ejemplo);
        });

        //Ordenar lista de Ascendente
        Collections.sort(lista);
        System.out.println(lista);

        //Ordenar lista de Descendente
        Collections.sort(lista, Collections.reverseOrder());
        System.out.println(lista);

        //Ordenar sin la librería Colletions
        //Forma Ascendente
        lista.sort(Comparator.naturalOrder());
        System.out.println(lista);

        //Forma Descendente
        lista.sort(Comparator.reverseOrder());
        System.out.println(lista);

        //Ordenar por medio de Stream
        //Stream crea una nueva lista
        //Forma Ascendente
        List<String> listaAsce = lista.stream().sorted().collect(Collectors.toList());
        System.out.println(listaAsce);

        //Forma Descendente
        List<String> listaDesc = lista.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(listaDesc);


    }
}
