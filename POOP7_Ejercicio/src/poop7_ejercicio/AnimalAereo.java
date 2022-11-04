package poop7_ejercicio;

public class AnimalAereo extends Animal {
    int numeroAlas;

    public AnimalAereo(String nombre, String lugarOrigen, String color, int numeroAlas) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }

    public AnimalAereo() {
    }

    /**
     * @return Regresa el numero de alas
     */
    public int getNumeroAlas() {
        return numeroAlas;
    }

    /**
     * @param numeroAlas Método que modifica el numero de alas
     */
    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }

    public void volar(){
        System.out.println(getNombre() + " esta volando");
    }

    @Override
    public String toString() {
        return "AnimalAereo -> " + super.toString()+ " [numeroAlas=" + numeroAlas + "] ";
    }
}
