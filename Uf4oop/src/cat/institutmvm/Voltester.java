/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;
import cat.institutmvm.Vol;
/**
 *
 * @author alexj
 */
public class Voltester {

    public static void main(String[] args) {
        //nuevo objeto y le pasamos todos los valores de los argumentos
      Vol v = new Vol("Iberia","Barcelona","Madrid","Juan",1233);
      System.out.println("La compañia " + v.getcompania() + " iniciará su vuelo " + v.getid() + " con salida desde " + v.getsalida() + " hacia " + v.getdestino() + " con " + v.getpiloto() + " de piloto");
      
      Vol vuelo = new Vol ("Ryanair","Barcelona","Madrid","Pepo", 1212);
      System.out.println(vuelo.printinfo());
     
      
     

    }
}

