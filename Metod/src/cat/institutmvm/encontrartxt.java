/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;
/**
 *ej 18
 * @author capu
 */
public class encontrartxt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto");
        String txt = sc.nextLine();
        System.out.println("Introduce el texto que quieres buscar: ");
        String txtfound = sc.nextLine();
        if (found(txt,txtfound)){
            System.out.println("Lo que buscas está dentro del texto");
        }else {
            System.out.println("No está el texto que buscas");
        }
        
    }
    public static boolean found (String txt, String txtfound){
        return txt.contains(txtfound);
    }
}

