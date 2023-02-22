/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

/** ej 13
 * Iván Capurro Delgado INS MANUEL VÁZQUEZ MONTALBÁN Data d'edició: 26-10-2022
 * ASIX 1 Programació estructurada
 */
public class Rangomespetit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pedimos al usuario que ingrese valores
        System.out.print("Ingresa un valor: ");
        int num = sc.nextInt();
        System.out.print("Ingresa el límit inferior: ");
        int limiteInf = sc.nextInt();
        System.out.print("Ingresa el límite superior: ");
        int limiteSup = sc.nextInt();

        //Llamamos al método para validar si el valor es menor que el límite inferior o está dentro del rango
        boolean esValid = validar(num, limiteInf, limiteSup);

        //Imprimimos el resultado
        if (esValid) {
            System.out.println("Valor válido (El valor es inferior al limite inferior o está dentro del rango.)");
        } else {
            System.out.println("El valor no es válido (Es superior a los limites.)");
        }
    }

    public static boolean validar(int num, int limiteInf, int limiteSup){
        return num < limiteInf || (num >= limiteInf && num <= limiteSup);
    }
}
