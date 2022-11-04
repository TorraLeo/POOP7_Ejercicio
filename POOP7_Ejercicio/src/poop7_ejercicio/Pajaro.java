package poop7_ejercicio;

public class Pajaro extends AnimalAereo {
    String tipoPico;

    public Pajaro(String nombre, String lugarOrigen, String color, int numeroAlas, String tipoPico) {
        super(nombre, lugarOrigen, color, numeroAlas);
        this.tipoPico = tipoPico;
    }

    public Pajaro() {
    }

    /**
     * @return Regresa el tipo de pico del animal
     */
    public String getTipoPico() {
        return tipoPico;
    }

    /**
     * @param tipoPico Método que modifica el tipo de pico
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    public void recolectarRamas() {
        System.out.println(getNombre() + " ha recolectado una rama");
    }

    @Override
    public String toString() {
        return "Pajaro -> " + super.toString() + "[tipoPico=" + tipoPico + "]";
    }
}
