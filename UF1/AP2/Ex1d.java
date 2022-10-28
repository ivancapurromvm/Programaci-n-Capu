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
public class Ex1d {
 //Queremos un cuadrado de 10x10 con *
    public static void main(String[] args) {
 
        Scanner teclado = new Scanner(System.in);
        System.out.print("el cuadrado: ");
        //introducimos los lados del cuadrado (10)
        int lado = 10;
        teclado.close();
 
        System.out.println();
        for(int row=1; row<=lado; row++){
            for(int col=1; col<=lado; col++){
                if(row==1 || row==lado || col==1 || col==lado){
                    //Printará los asteriscos
                    System.out.print("*");
                }
                else{
                    //Printará espacios en blanco
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}