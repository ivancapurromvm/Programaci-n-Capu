/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AP2;

import java.util.Scanner;

/**
 *
 * @author alexj
 */
public class Ex7c { //Mostraremos los 100 primeros números pares
    private static final String MSG_1="Numeros del 0 al 100";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int num = 0;
        System.out.println(MSG_1);
        while (num<=100){
            if (num%2==0){ //Esta es la condición para enseñar tan solo los pares
            System.out.println(num);
            }
            num++;
        }    
    }
}