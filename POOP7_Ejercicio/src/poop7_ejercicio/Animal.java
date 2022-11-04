package poop7_ejercicio;

public class Animal {
    String nombre;
    String lugarOrigen;
    String color;
    String sonido;
    
    public Animal(){

    }
    
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }

    /**
     * @return Regresa el nombre del animal
     * 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return Regresa el lugar de origen
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }

    /**
     * @return Regresa el color del animal
     */
    public String getColor() {
        return color;
    }

    /**
     * @param nombre Método que modifica el nombre del animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param lugarOrigen Método que modifica el lugar de origen
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    /**
     * @param color Método que modifica el color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public void comer(){
        System.out.println(getNombre() + " esta comiendo");
    }

    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + "] ";
    }

    /**
     * @return Regresa el sonido del animal
     */
    public String getSonido() {
        return sonido;
    }

    /**
     * @param sonido Método que modifica el sonido del animal
     */
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public void sonido(){
        System.out.println(getSonido());
    }

}
