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
public class Ex7b { //Mostraremos los números del 0 al 100
    private static final String MSG_1="Numeros del 0 al 100";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int i = 0;
        System.out.println(MSG_1);
        while (i <= 100) { //Mientras el contador no llegue a 100 printaremos los números
            System.out.println(i);
            i++; //sumaremos 1 al contador 
        }
    }
    
}
