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
public class Ex8a { // Demanar números enters a l’usuari fins que aquest escrigui el número 0.
    private static final String MSG_1 = "Ingrese un número";
    private static final String MSG_2 = "Has introducido el número 0";
    
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        
        while (num != 0){ //Mientras el número escrito por el usuario no sea 0 seguirá pidiendo
            System.out.println(MSG_1);
            num = sc.nextInt();
        }
        System.out.println(MSG_2); //En caso que el usuario escriba 0, se acabó el programa
    }   
    
}
