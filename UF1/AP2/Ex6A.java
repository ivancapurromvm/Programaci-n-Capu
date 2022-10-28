/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AP2;
import java.util.Scanner;

//Pre: Demanar a l'usuari un any i un mes

public class Ex6A {

    
       private static final String MSG_1 = "Introduce un año y el mes";
       private static final String MSG_2 = "año->";
       private static final String MSG_3 = " ERROR";
       private static final String MSG_4 = " mes->";
        
       
       
       public static void main(String[] args) {
       
        //Dado un año y el mes indicaremos cuantos días tiene
        int any,mes,diasfeb,diasmeses;
        System.out.println(MSG_1);
        Scanner sc = new Scanner(System.in);
        any= sc.nextInt();
        mes= sc.nextInt();
        // Operación año de traspaso
        if ((any%4==0)&&(any%100 != 0)||(any%400 == 0)){
            diasfeb=29;
        }else{
            diasfeb=28;
        // Operación meses 30 o 31 dias
        }
        if ((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)){
            diasmeses=31;
            
        }else{
         
             diasmeses=30;  
        }
        //if else
        if(mes==2){
            System.out.println(MSG_2+any+MSG_4+mes+" resultado="+diasfeb);
        }else{
             if((mes>0)&&(mes<=12)){
                    System.out.println(MSG_2+any+MSG_4+mes+" resultado="+ diasmeses);
             }else{
                    System.out.println(MSG_3);   
             }        
        }
       }
}       