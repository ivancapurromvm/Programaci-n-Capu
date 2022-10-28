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
public class Ex3h { //Elevi al quadrat un nombre si és parell i al cub si és senar
    private static final String MSG_1 = "introduce un número";
    private static final String MSG_2 = "resultado al cuadrado -> ";
    private static final  String MSG_3 = "resultado al cubo -> ";

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.println(MSG_1);
        num = sc.nextInt();
            if (num % 2 == 0){ //es parell
                System.out.println(MSG_2 + Math.pow(num, 2)); //eleva al cuadrado
            }
            else { //es senar
                System.out.println(MSG_3 + Math.pow(num, 3)); //eleva al cubo
            }
        
    }
    
}
