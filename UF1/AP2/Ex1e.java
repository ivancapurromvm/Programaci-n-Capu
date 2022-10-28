/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AP2;
/**Iván
 * Capurro Delgado
 * INS MANUEL VÁZQUEZ MONTALBÁN
 * Data d'edició: 26-10-2022
 * ASIX 1
 * Programació estructurada
 */
public class Ex1e {
private static final String MSG_1="Triangulo";
    public static void main(String[] args) {
        System.out.println(MSG_1);
        System.out.println(""); 
            //Altura 
        for(int altura = 1; altura<=5; altura++){
            //Espacios en blanco
                for(int blancs = 1; blancs<=5-altura; blancs++){
                    System.out.print(" ");
                }
 
            //Asteriscos
                for(int asteriscs=1; asteriscs<=(altura*2); asteriscs++){
                    System.out.print("*");
                }
            System.out.println();
    }
  } 
}
   