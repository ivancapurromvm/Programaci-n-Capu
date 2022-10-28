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

public class Ex3b { //Determinar si un nombre és més gran que 35.
    private static final String MSG_1 = "Introduce un número";
    private static final String MSG_2 = "es más grande";
    private static final String MSG_3 = "és 35";
    private static final String MSG_4 = "es más pequeño";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(MSG_1);
        int num = sc.nextInt();
        if (num > 35 ){//si se cumple,es mas grande
            System.out.println(MSG_2); 
        }
        else {
            if (num == 35){//es igual que 35
                System.out.println(MSG_3);
            }
            else{//de lo contrario,es mas pequeño
                System.out.println(MSG_4);
            }
        }
    }
    
}
