/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;
//ej 2
/**
 *
 * @author capu
 */
public class Positiumenorque100 {
        
    private static final String MSG_1="Introduce un número";
    private static final String MSG_2="Está en el intervalo";
    
    public static void main(String args[]) {
        
        Positiumenorque100 met = new Positiumenorque100();
        
        System.out.println(MSG_2 + met.interval());
        
    }
    
    public int interval(){
        int num;
        Scanner sc = new Scanner (System.in);
        num = sc.nextInt();
        
        if ((num>0) && (num<100)){
            System.out.println(MSG_2);
        }
        return num;
    } 
}
