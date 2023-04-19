package Colletions;

public class Curso {


    private String nombre;
    private int tiempo;

    public Curso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
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


    //Se sobre escribe el método toString a fin de que no arroje las direcciones de memoria, sino su nombre
    @Override
    public String toString(){
        return this.nombre;
    }

}
