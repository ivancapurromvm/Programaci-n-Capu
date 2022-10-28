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
public class Ex3c {// Determinar si un nombre és positiu i menor que 100.
    private static final String MSG_1= "Introduce un número";
    private static final String MSG_2= "Cumple las condiciones (positivo y menor que 100)";
    private static final String MSG_3= "No cumple las condiciones (positivo y menor que 100)";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.println(MSG_1);
        num = sc.nextInt();
            if ((num>0) && (num<100)){ //si se cumplen las  condiciones
            System.out.println(MSG_2); 
            }
        else {
            System.out.println(MSG_3);//no se cumplen las condiciones
        }
    }
}
