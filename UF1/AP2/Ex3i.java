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
public class Ex3i { //Calculeu el màxim de 2 nombres donats.
    private static final String MSG_1="Introduce un número";
    private static final String MSG_2="Introduce otro número";
    private static final String MSG_3="El número más grande es -> ";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1,num2;
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        System.out.println(MSG_2);
        num2 = sc.nextInt();
        if (num1>num2){ //calcula si el primero es más grande que el segundo
            System.out.println(MSG_3 + num1);
        }
        else { // de lo contrario el segundo es más grande que el primero
            System.out.println(MSG_3 + num2);
        }
    }
    
}
