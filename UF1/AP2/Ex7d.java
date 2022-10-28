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
public class Ex7d { //Mostraremos los número del 0 al 100 de forma descendente
    private static final String MSG_1="Números del 100 al 0";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 100; //el contador empezará en el 100
        while(i >= 0){
            System.out.println(i);
            i--; //Por cada numero se le restará 1 al contador
        }
       
    }
    
}

