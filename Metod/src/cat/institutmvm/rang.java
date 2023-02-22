/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;
//ejercicio 5
public class rang {

    public static final String MSG_1 = "Introduce un número natural: ";
    public static final String MSG_2 = "Valido";
    public static final String MSG_3 = "NO VALIDO";
    public static final String MSG_4 = "Se te acabaron los intentos";

   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        int intentos = 0;
       

        while (intentos < 3) {
            System.out.print("Ingrese un número natural: ");
            numero = sc.nextInt();
            if (validarNumero(numero)) {
                System.out.println("El número es válido.");
            } else {
                intentos++;
                System.out.println("El número no es válido.");
            }
        }

        if (intentos == 3) {
            System.out.println("Se han agotado los intentos. Fin del programa.");
        }

    }

    public static boolean validarNumero(int numero) {
        if ((numero > 1)&& (numero <10)) {
            return true;
        } else {
            return false;
        }
    }

}
