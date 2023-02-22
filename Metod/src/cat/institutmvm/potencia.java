/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;
/** ej 8
 *
 * @author capu
 */
public class potencia {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        potencia metodo = new potencia(); 
        System.out.println("El resultado de la potencia introducida es: " + metodo.Potencia());
    }
    public int Potencia(){
        int num, elevado; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un num entero."); 
        num = sc.nextInt(); 
        System.out.println("Introduzca a cuánto quiere elevar el número introducido.");
        elevado = sc.nextInt(); 
        num = (int)Math.pow(num, elevado); //Utilizamos el método Math.pow y retornamos el valor de num.
        return num;
    }
    
}
