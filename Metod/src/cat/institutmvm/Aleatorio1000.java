/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;
import java.util.Random;
import java.util.Scanner;
/** ej 12
 *
 * @author Capu
 */
public class Aleatorio1000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numAleatorio = obtenerNumeroAleatorio();
        int intento = 0;
        boolean acertado = false;

        while (intento < 3 && !acertado) {
            System.out.print("Adivina el número entre 0 y 1000: ");
            int numIngresado = input.nextInt();
            intento++;

            if (numIngresado == numAleatorio) {
                acertado = true;
                System.out.println("muy bien");
            } else {
                if (numIngresado < numAleatorio) {
                    System.out.println("tira hacia arriba");
                } else {
                    System.out.println("tira hacia abajo");
                }
            }
        }
        if (!acertado) {
            System.out.println("Se acabaron los intentos. El número premiado era " + numAleatorio);
        }
    }

    public static int obtenerNumeroAleatorio() {
        Random rand = new Random();
        return rand.nextInt(1001);
    }
    
}
