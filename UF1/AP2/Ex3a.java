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

public class Ex3a {// Determinar si un nombre és negatiu.
    private static final String MSG_1 = "Introduce un número";
    private static final String MSG_2 = "és negatiu";
    private static final String MSG_3 = "és 0";
    private static final String MSG_4 = "és positiu";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(MSG_1);
        int num = sc.nextInt();
        if (num < 0 ){ //Si se cumple esto es negativo
            System.out.println(MSG_2); 
        }
        else {
            if (num == 0){ //es 0, ni negativo ni positivo
                System.out.println(MSG_3);
            }
            else{ //de lo contrario,positivo
                System.out.println(MSG_4);
            }
        }
    }
    
}

