/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;
/** ej 7
 *
 * @author capu
 */
public class valorabsolut {

    public static void main(String[] args) {
       valorabsolut metodo = new valorabsolut(); 
        System.out.println("El valor absoluto del número entero introducido es: " + metodo.Absoluto());
    }
    public int Absoluto(){
        int num; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un valor entero.");
        num = sc.nextInt(); 
        num = Math.abs(num); //⇽⇽⇽
        return num; 
    }

}