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
public class Ex3k { //pedir 2 numeros e indicar si es múltiple, EL PRIMERO SERÁ EL MÁS GRANDE
    private static final String MSG_1="Introduce un número";
    private static final String MSG_2="Introduce otro número";
    private static final String MSG_3="Es múltiplo";
    private static final String MSG_4="NO es múltiplo";
    private static final String MSG_5= "Cambia de orden";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1,num2;
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        System.out.println(MSG_2);
        num2 = sc.nextInt();
        if (num1>num2){ //validar si el primero es el más grande
            if (num1 % num2 == 0){ //es multiplo
                System.out.println(MSG_3);
            }else { //no es múltiplo
                System.out.println(MSG_4);
            }
        }else { //cambia el orden de los numeros
            System.out.println(MSG_5);
        }
    }
    
}
