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

public class Ex3l{

    private static final int quota = 6;

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce número de litros gastados");
        double llitres = sc.nextInt(); //pedimos número de litros
        if (llitres <= 50) {
            System.out.println("La factura tiene un total de " + quota + "€"); //quota fija de 6 euros
        } else {
            if (llitres > 50 && llitres < 200) {
                llitres = llitres * 0.1 + quota;
                System.out.println("La factura tiene un total de " + llitres + "€"); //a la quota se le añade 0.1 por L
            } else {
                if (llitres > 200) {
                    llitres = llitres * 0.3 + quota;
                    System.out.println("La factura tiene un total de " + llitres + "€"); //a la quota se le añade 0.3 por L
                }
            }
        }
    }
}    