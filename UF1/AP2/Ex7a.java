/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AP2;
import java.util.Scanner;
/**Iván
 * Capurro Delgado
 * INS MANUEL VÁZQUEZ MONTALBÁN
 * Data d'edició: 26-10-2022
 * ASIX 1
 * Programació estructurada
 */
public class Ex7a { //Escribir los números del 0 al 10 con un while
    private static final String MSG_1="Numeros del 0 al 10";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int i = 0;
        System.out.println(MSG_1);
        while (i <= 10) { //Mientras el contador sea 0 escribiremos los número
            System.out.println(i);
            i++; //Le sumamos 1 al contador
        }
    }
    
}
