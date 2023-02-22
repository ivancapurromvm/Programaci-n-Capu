/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;
// ej 3
//Iván Capurro Delgado INS MANUEL VÁZQUEZ MONTALBÁN Data d'edició: 26-10-2022
//ASIX 1 Programació estructurada
public class Litres {

    private static final int quota = 6;
    private static final String MSG_1 = "El precio final de tu quota es de: ";

    public static void main(String[] args) {

        Litres met = new Litres();
        System.out.println(MSG_1 + met.litrosmet());

    }

    public int litrosmet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce número de litros gastados");
        int litros = sc.nextInt();
        if (litros <= 50) {

        } else {
            if (litros > 50 && litros < 200) {
                litros = litros * 2 + quota;

            } else {
                if (litros > 200) {
                    litros = litros * 3 + quota;

                }
            }

        }
        return litros;
    }
}
    

