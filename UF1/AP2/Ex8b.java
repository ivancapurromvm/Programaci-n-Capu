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
public class Ex8b { //Pedir primeramente al usuario la cantidad de números, y después los números
    private static final String MSG_1 = "Ingrese el número de números";
    private static final String MSG_2 = "Introduce un número";
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int num;
     int counter = 0;
     int num2;
     System.out.println(MSG_1);
     num2 = sc.nextInt(); //Aqui el usuario escribirá la cantidad de números
     while (counter<num2){ //Mientras el contador sea más pequeño que el número que introdujo al principio el usuario indicando la cantidad de números,seguirá pidiendo
         System.out.println(MSG_2);
         num = sc.nextInt(); //Estos son los números que irá introduciendo el usuario
         counter++;
     }
     
     
    }   
    
}
