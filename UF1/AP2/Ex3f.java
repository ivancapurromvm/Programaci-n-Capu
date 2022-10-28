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
public class Ex3f {//Determinar si el mòdul d'un nombre (num1) entre un altre nombre (num2) és menor que 15
    
    private static final String MSG_1= "Introduce un número";
    private static final String MSG_2= "Introduce otro número para dividir";
    private static final String MSG_3= "el módulo es menor que 15";
    private static final String MSG_4= "el módulo es mayor que 15";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        int num2;
        //pedimos los 2 numeros
        System.out.println(MSG_1); 
        num = sc.nextInt();
        System.out.println(MSG_2);
        num2 = sc.nextInt();
            if (((num)%num2)<15){ //hacemos el módulo y directamente vemos si es menor que 15
                System.out.println(MSG_3);
            }
            else{
                System.out.println(MSG_4);
            }
    }
}    
