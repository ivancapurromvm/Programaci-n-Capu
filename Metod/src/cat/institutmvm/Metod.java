/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

public class Metod {

    private static final String MSG_1 = "Introduce un número";
    private static final String MSG_4 = "Tu número:";

    public static void main(String[] args) {
        int num;
        Metod method = new Metod();
        num = method.natural();
        System.out.println(MSG_4 + num);

    }

    public int natural() {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(MSG_1);
            num = sc.nextInt();
        } while (num < 1);
        return num;
    }

}
