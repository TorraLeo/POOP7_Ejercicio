package poop7_ejercicio;

public class AnimalAcuatico extends Animal {
    int numeroAletas;
    String sonido;

    public AnimalAcuatico(){

    }
    
    public AnimalAcuatico(String nombre, String lugarOrigen, String color, String sonido, int numeroAletas) {
        super(nombre, lugarOrigen, color);
        this.sonido=sonido;
        this.numeroAletas=numeroAletas;

    }
    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido=sonido;
    }


    public int getNumeroAletas() {
        return numeroAletas;
    }

    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
    
    public void nadar(){
        System.out.println(getNombre() + "esta nadando");
    }

    @Override
    public String toString() {
        return "AnimalAcuatico -> " + super.toString()+ "[numeroAletas=" + numeroAletas + "] ";
    }
}
