/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

//EJERCICIO 5

public class Cat {
    //Atributos
    private String name, age, breed, favouritefood;
    //Constructor
    public Cat (String name, String age, String breed, String favouritefood){
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.favouritefood = favouritefood;
    }
    //Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getFavouritefood() {
        return favouritefood;
    }

    public void setFavouritefood(String favouritefood) {
        this.favouritefood = favouritefood;
    }
    
    //Acciones del gato
    public void maullar(){
        System.out.println("Meow");
    }
    
    public void jugar(){
        
        System.out.println("está jugando");
    }
    
    public void baño(){
        System.out.println("A " + this.name + " no le gusta bañarse :(");
    }
    
    public void comer(){
        System.out.println("Está comiendo " + this.favouritefood);
    }
    
    public void cazar(){
        System.out.println("Está cazando");

    }
    
    //metodo para mostrar los datos
    public String Mostrardatos(){
        return (this.name + " es de raza: " + this.breed + "\naños: " + this.age + "\ncomida favorita: " + this.favouritefood);
    }
}
