/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;
//EJERCICIO 4 TESTER
public class Bicicletatester {

    public static void main(String[] args) {
        //nueva bicicleta 
        Bicicleta or = new Bicicleta("Orbea",30);
        System.out.println("La bicicleta es de marca: " + or.getMarca());
        System.out.println("Puede llegar a una velocidad de: " + or.getVelocidadmaxenkm());
        or.acelerar();
        
    }
    
}
