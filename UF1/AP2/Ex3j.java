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

public class Ex3j { //Calcular el maximo de 3 nombres
    private static final String MSG_1="Introduce un número";
    private static final String MSG_2="Introduce otro número";
    private static final String MSG_3="Introduce un último número";
    private static final String MSG_4="El número mas grande de los 3 es el -> ";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1,num2,num3;
        //pedimos todos los numeros
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        System.out.println(MSG_2);
        num2 = sc.nextInt();
        System.out.println(MSG_3);
        num3 = sc.nextInt();
        if (num1>num2){
            if (num1>num3){
                System.out.println(MSG_4 + num1); //si se cumplen estas condiciones el primero será el mas grande
            }else {
                System.out.println(MSG_4 + num3); //si se cumplen estas condiciones el tercero será el mas grande
            }
        }else if (num2>num3){
            System.out.println(MSG_4 + num2); //si se cumplen estas condiciones el segundo será el mas grande
        }else {
            System.out.println(MSG_4 + num3); //si se cumplen estas condiciones el tercero será el mas grande
        }
        
    }
    
}
