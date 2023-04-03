/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
//EJERCICIO 3
public class Llum {
//Atributos
    private String bombilla, color;
   
    //constructor
    public Llum (String bombilla, String color){
        this.bombilla = bombilla;
        this.color = color;
    }
    //getters & setters
    public String getbombilla() {
        return bombilla;
    }

    public void setbombilla(String bombilla) {
        this.bombilla = bombilla;
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    
}