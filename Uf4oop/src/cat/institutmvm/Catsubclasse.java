/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
import cat.institutmvm.Mascotasuperclase;
//EJERCICIO 7 HEREDA DE SUPERCLASSE MASCOTA


public class Catsubclasse extends Mascotasuperclase{
    private String raza;

    public Catsubclasse(String color,int patas,String raza) {
        super(color,patas);
        this.raza = raza;
    }
    
    public void mostrardatos(){
        System.out.println("Es de color: " + this.getColor() + " Tiene " + this.getPatas() + " patas" + " y su raza es: " + this.raza);
    }
    
    
    
}
