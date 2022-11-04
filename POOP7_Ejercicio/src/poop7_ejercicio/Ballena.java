package poop7_ejercicio;

public class Ballena extends AnimalAcuatico {
    int largo;

    public Ballena(int largo, String nombre, String lugarOrigen, String color, String sonido, int numeroAletas) {
        super(nombre, lugarOrigen, color, sonido, numeroAletas);
        this.largo=largo;
    }

    public Ballena() {
    }

    @Override
    public String toString() {
        return "Ballena -> " + super.toString()+ "[largo=" + largo + "] ";
    }

    /**
     * @return Regresa el largo del animal
     */
    public int getLargo() {
        return largo;
    }

    /**
     * @param largo Método que modifica el largo
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void pelearConPinocho(){
        System.out.println(getNombre() + " esta peleando con un Pinocho");
    }
}
