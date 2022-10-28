package AP2;
import java.util.Scanner;

/**Iván
 * Capurro Delgado
 * INS MANUEL VÁZQUEZ MONTALBÁN
 * Data d'edició: 26-10-2022
 * ASIX 1
 * Programació estructurada
 */
public class Ex3g {//Determinar si un enter és senar
    
    private static final String MSG_1= "Introduce un número";
    private static final String MSG_2= "es senar";
    private static final String MSG_3= "no es senar";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.println(MSG_1);
        num = sc.nextInt();
            if (num % 2 == 0){//es parell porqué el residuo es 0
                System.out.println(MSG_3);
            }
            else{ // es senar porqué el residuo no es 0
                System.out.println(MSG_2);
            }
    }
}    
