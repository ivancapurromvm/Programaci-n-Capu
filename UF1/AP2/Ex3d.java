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
public class Ex3d { //Determinar si un nombre per pertany a l'interval [-3,27].
    private static final String MSG_1= "Introduce un número";
    private static final String MSG_2= "Cumple las condiciones (está entre -3 y 27)";
    private static final String MSG_3= "No cumple las condiciones (está entre -3 y 50)";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.println(MSG_1);
        num = sc.nextInt();
            if ((num>(-3)) && (num<27)){ //está dentro de el intervalo
            System.out.println(MSG_2); 
            }
        else {
            System.out.println(MSG_3); //no está dentro de el intervalo
        }
    }
}


