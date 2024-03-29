package Colletions.model;

import Colletions.model.Clase;

import java.util.List;

public class Curso{


    private String nombre;
    private int tiempo;
    private List<Clase> claseList;

    public Curso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public Curso(String nombre, int tiempo, List<Clase> claseList) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.claseList = claseList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public List<Clase> getClaseList() {
        return claseList;
    }

    public void setClaseList(List<Clase> claseList) {
        this.claseList = claseList;
    }

    public void addClase(Clase clase){
        this.claseList.add(clase);
    }

    //Se sobre escribe el método toString a fin de que no arroje las direcciones de memoria, sino su nombre
    @Override
    public String toString(){
        return this.nombre;
    }
}
