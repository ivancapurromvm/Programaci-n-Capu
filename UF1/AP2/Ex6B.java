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
public class Ex6B {
    private static final String MSG_1="El número de días del mes son -> ";
    private static final String MSG_2="Introduce el número del mes";
    private static final String MSG_3="Introduce el número del año";
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int mes,año,diasdelmes;
    System.out.println(MSG_2); //Pedimos al usuario el número del mes
    mes = sc.nextInt();
    System.out.println(MSG_3); //Pedimos al usuario el número del año
    año = sc.nextInt();
    switch (mes){ //Con el Switch-case pondremos diferentes casos
        case 1: //Enero
        case 3: //Marzo
        case 5: //Mayo
        case 7: //Julio
        case 8: //Agosto
        case 10: //Octubre
        case 12: //Diciembre
            diasdelmes=31; //Si el número del mes es uno de estos, el mes tendrá 31 dias
            System.out.println(MSG_1 + diasdelmes);
            break;
        case 4: //Abril
        case 6: //Junio
        case 9: //Septiembre
        case 11: //Noviembre
            diasdelmes=30; //Si el número del mes es uno de estos, el mes tendrá 30 dias
            System.out.println(MSG_1 + diasdelmes);
            break;
        case 2: //febrero  (Determinar si es año bisiesto o no
            if (((año%100 == 0) && (año%400 == 0)) ||
                    ((año%100 != 0) && (año%4 == 0) ))
                diasdelmes=29;
            else {
                diasdelmes=28;
                System.out.println(MSG_1 + diasdelmes);
            }
    }
    }
    
}
