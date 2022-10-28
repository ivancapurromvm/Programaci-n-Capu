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
public class Ex9 { //Calcula la mitjana aritmètica d’un seguit de nombres que introduirà l’usuari (fins que l’usuari introdueixi un 0).

    private static final String MSG_1= "Introduce un número";
    private static final String MSG_2= "Has introducido el 0,Bye";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double suma = 0;
        int cont = 0;
        int num;
        System.out.println(MSG_1);
        num = sc.nextInt(); //El usuario introducirá un número
        while (num != 0){ //Mientras el número introducido no sea 0, se ejecutará el while
            cont++;
            suma = suma + num;
            System.out.println("La media es = " + suma/ cont); //Calculo de la media
            System.out.println(MSG_1);
            num = sc.nextInt();
        }
        System.out.println(MSG_2); //En cambio el usuario ha introducido un 0, se acaba el programa
    }
    
    
}


