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
public class Ex5 { //Donat un any qualsevol, el programa ha d’informar si és un any de traspàs o no
    private static final String MSG_1 = "Introduce un año";
    private static final String MSG_2 = "Es Bisiesto";
    private static final String MSG_3 = "NO es bisiesto";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int año;
        System.out.println(MSG_1);
        año = sc.nextInt(); //Leeremos el año
        if (año % 100 != 0){
            if (año % 4 == 0) //Si cumple esta condición es bisiesto
                System.out.println(MSG_2);
            else 
                System.out.println(MSG_3);  //Si cumple esta condición NO es bisiesto
            
        }else if ( año % 400 == 0)
            System.out.println(MSG_2); //Si cumple esta condición es bisiesto
        else 
            System.out.println(MSG_3); //Si cumple esta condición NO es bisiesto
    }
    
}
