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
public class Ex3e { //Determinar si un nombre no pertany al interval [25,50].
    private static final String MSG_1= "Introduce un número";
    private static final String MSG_2= "No pertenece al intervalo de entre 25 y 50";
    private static final String MSG_3= "pertenece al intervalo de entre 25 y 50";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.println(MSG_1); //pedimos el numero
        num = sc.nextInt();
            if ((num>25) && (num<50)){ //está dentro del intervalo
            System.out.println(MSG_3); 
            }
        else { //no está dentro del intervalo
            System.out.println(MSG_2);
        }
    }
}
