package poop7_ejercicio;

public class AnimalTerrestre extends Animal {
    int numeroPatas;

    
    public AnimalTerrestre() {
    }

    public AnimalTerrestre(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public AnimalTerrestre(String nombre, String lugarOrigen, String color, int numeroPatas) {
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }

    /**
     * @return Regresa el número de patas del animal
     */
    public int getNumeroPatas() {
        return numeroPatas;
    }

    /**
     * @param numeroPatas Método que modifica el número de patas del animal
     */
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }


    public void correr(){
        System.out.println(getNombre() + " Esta corriendo :3");
    }

    @Override
    public String toString() {
        return "AnimalTerrestre -> " + super.toString() + "[numeroPatas=" + numeroPatas + "] ";
    }
}
