/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;
import java.util.Random;
/** ej 11
 *
 * @author capu 
 */
public class Aleatorio256 {

      public static void main(String[] args) {
        // Llamar al método para obtener un número aleatorio
        Aleatorio256 numAleatorio = new Aleatorio256();
        System.out.println("Número aleatorio: " + numAleatorio.obtenerNumero());
    }

    public int obtenerNumero() {
        Random rand = new Random();
        return rand.nextInt(256);
    }
}
