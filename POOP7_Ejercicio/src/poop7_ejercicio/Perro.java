package poop7_ejercicio;

public class Perro extends AnimalTerrestre {
    String colorCollar;
    
    public Perro(String nombre, String lugarOrigen, String color, int numeroPatas, String colorCollar) {
        super(nombre, lugarOrigen, color, numeroPatas);
        this.colorCollar=colorCollar;
    }
    
    public Perro() {
    }

    /**
     * @return Regresa el color del collar del perro
     */
    public String getColorCollar() {
        return colorCollar;
    }
    /**
     * @param colorCollar Método que modifica el color del collar
     */
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }

    public void hacerTruco(){
        System.out.println(getNombre()+"truco");
    }

    @Override
    public String toString() {
        return "Perro -> " + super.toString()+ " [colorCollar=" + colorCollar + "] ";
    }
}
