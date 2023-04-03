/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
//Ejercicio 4
public class Bicicleta {
    private String marca;
    private int velocidadmaxenkm;
    //constructor
    public Bicicleta (String marca, int velocidadmaxenkm){
        this.marca = marca;
        this.velocidadmaxenkm = velocidadmaxenkm;
        
    }
//Getters & setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidadmaxenkm() {
        return velocidadmaxenkm;
    }

    public void setVelocidadmaxenkm(int velocidadmaxenkm) {
        this.velocidadmaxenkm = velocidadmaxenkm;
    }
    
    public void acelerar(){
        System.out.println("está acelerandoooooooooooooooo");
    }
    
    
}
    

