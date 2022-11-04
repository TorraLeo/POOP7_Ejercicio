/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7_ejercicio;

/**
 *
 * @author darwi
 */
public class POOP7_Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Perro
        System.out.println("Perro-----------------------------------------------------------");
        Perro cino = new Perro("Cino", "Mexico", "Gris", 4, "Azul");
        cino.setSonido("Wauf");
        System.out.println(cino);
        System.out.println(cino.getSonido());
        cino.comer();
        cino.correr();
        cino.hacerTruco();

        // Ballena
        System.out.println("Ballena---------------------------------------------------------");
        Ballena bal = new Ballena();
        bal.setNombre("Luisa");
        bal.setLargo(132);
        bal.setLugarOrigen("Mexico");
        bal.setSonido("aaaaaaaaaaaaaaa");
        bal.setNumeroAletas(4);
        System.out.println(bal.getSonido());
        System.out.println(bal);
        bal.comer();
        bal.pelearConPinocho();
    }
    
}
