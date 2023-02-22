/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;
//ej 1
/**
 *
 * @author capu
 */
public class Negatiu1 {

    private static final String MSG_1 = "Introduce un nombre";
    private static final String MSG_2 = "El nombre es negatiu";

    public static void main(String args[]) {

        Negatiu1 met = new Negatiu1();

        System.out.println(MSG_2 + met.valida());
    }

    public int valida() {
        int num;
        Scanner sc = new Scanner (System.in);
        do {
            System.out.println(MSG_1);
            num = sc.nextInt();
        } while (num > 1);
        return num;
    }
}
