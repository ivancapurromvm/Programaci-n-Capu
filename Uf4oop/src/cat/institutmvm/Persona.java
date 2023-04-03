/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;
//EJERCICIO 2
public class Persona {
    //Atributos
   private String name, surname;
   //Constructor
   public Persona(String name,String surname){
       this.name = name;
       this.surname = surname;
   }
//Getters & setters
   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public String getSurname() {
       return surname;
   }

   public void setSurname(String surname) {
       this.surname = surname;
   }

   //metodo para printar el nombre completo
   public String getFullName(){
       return (this.getName() +" " + this.getSurname());
   }
}


