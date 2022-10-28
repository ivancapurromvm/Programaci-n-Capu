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
public class Ex4a { //A partir d’un nombre comprès entre 1 i 12, el programa cal que retorni el nom del mes. En cas de que el nombre no es trobi entre 1 i 12 cal que mostri un missatge d’error.

    private static final String MSG_1="Introduce un número";
    
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num=sc.nextInt(); //recibiremos el número del mes
        if (num == 1){ //con else if relacionamos el número del mes con el nombre del mes
               System.out.println("Enero");
            }else if (num == 2){
                System.out.println("Febrero");
            }else if (num == 3){
                System.out.println("Marzo");
            }else if (num == 4){
                System.out.println("Abril");
            }else if (num == 5){
                System.out.println("Mayo");
            }else if (num == 6){
                System.out.println("Junio");
            }else if (num == 7){
                System.out.println("Julio");
            }else if (num == 8){
                System.out.println("Agosto");
            }else if (num == 9){
                System.out.println("Septiembre");
            }else if (num == 10){
                System.out.println("Octubre");
            }else if (num == 11){
                System.out.println("Noviembre");
            }else if (num == 12){
                System.out.println("Diciembre");
            }else { //Si no es ninguno de los anteriores devolverá error
                System.out.println("Error");
            }
                
    } 
}
