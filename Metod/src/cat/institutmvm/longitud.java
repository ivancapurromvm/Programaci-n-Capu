/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;
/**
 * ej 17
 * @author capu
 */
public class longitud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto: ");
        String txt = sc.nextLine();
        length(txt);
        System.out.println("Longitud de texto:" + longitud.length(txt));
    }
    public static int length (String txt){
        return txt.length();
    }
}

