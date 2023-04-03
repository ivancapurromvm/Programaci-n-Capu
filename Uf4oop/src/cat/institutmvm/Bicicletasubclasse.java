/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
//EJERCICIO 7 ESTÁ ES UNA SUBCLASSE DE LA SUPERCLASSE CICLOS

public class Bicicletasubclasse extends Ciclossuperclasse {

    private String tamanorueda;

//constructor
    public Bicicletasubclasse(String marca, String color, String tamanorueda){
        super(marca, color);
        this.tamanorueda = tamanorueda;
    }
    
    public void mostrardatos(){
        System.out.println("La bici es de marca: " + this.getmarca()+ "Tiene color: " + this.getcolor() + "Tamaño de rueda: " + tamanorueda);
    }
}
