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
public class Ex4b {
    private static final String MSG_1="Introdueix un número";
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num=sc.nextInt(); //Recibiremos el número del mes dado por el usuario
        switch (num){ //Con el switch case pondremos 13 casos distintos 1 por cada mes del año, y 1 en caso de números contarios a (1-12)
            case 1: System.out.println("Enero");
                    break;
            case 2: System.out.println("Febrero");
                    break;
            case 3: System.out.println("Marzo");
                    break;
            case 4: System.out.println("Abril");
                    break;
            case 5: System.out.println("Mayo");
                    break;
            case 6: System.out.println("Junio");
                    break;
            case 7: System.out.println("Julio");
                    break;
            case 8: System.out.println("Agosto");
                    break;
            case 9: System.out.println("Septiembre");
                    break;
            case 10: System.out.println("Octubre");
                    break;
            case 11: System.out.println("Noviembre");
                    break;
            case 12: System.out.println("Diciembre");
                    break;
            default: System.out.println("Error"); //Si el número no está entre 12 devolverá un error
        }
    }
    
}
