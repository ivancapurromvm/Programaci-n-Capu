/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;
//ej 6
/**
 *
 * @author capu
 */
public class rangusuari {

    private static final String MSG_1 = "Introduce un número natural: ";
    private static final String MSG_2 = "Introduce un número natural mayor que el anterior: ";
    private static final String MSG_3 = "Introduce un número para comprobar que esté dentro del rango: ";
    private static final String MSG_4 = "Tu número está dentro del rango ";
    private static final String MSG_5 = "Tu número no está dentro del rango";
    private static final String MSG_6 = "fin de programa has hecho todos los intentos";

    public static void main(String[] args) {
        int num1, num2, num3;
        int error = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        System.out.println(MSG_2);
        num2 = sc.nextInt();

        while (error < 3) {
            System.out.println(MSG_3);
            num3 = sc.nextInt();
            if (validarRang(num1, num2, num3)) {
                System.out.println(MSG_4);
            } else {
                error++;
                System.out.println(MSG_5 + "N· DE ERRORES:" + error);
            }
        }
        if (error == 3) {
            System.out.println(MSG_6);
        }
    }

    public static boolean validarRang(int num1, int num2, int num3) {
        if ((num3 > num1) && (num3 < num2)) {
            return true;
        } else {
            return false;
        }
    }
}


