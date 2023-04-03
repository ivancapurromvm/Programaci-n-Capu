/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;
import cat.institutmvm.Llum;

//EJERCICIO 3
public class Llumtester {

    public static void main(String[] args) {
        //Creación de nuevo objeto y valor a atributos
      Llum l = new Llum("Toshiba","Roja");
      System.out.println("La lampara tiene una bombilla de la marca " + l.getbombilla());
      System.out.println("La lampara es de color " + l.getcolor());
      
     
    }
}

