/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

/**
 *
 * @author capu asix
 */
public class Vol {
    //atributos
    private String compania, salida,destino,piloto;
    private int id;
   
    //constructor
    public Vol (String compania, String salida, String destino, String piloto, int id){
        this.compania = compania;
        this.salida = salida;
        this.destino = destino;
        this.piloto = piloto;
        this.id = id;
        
    }
    
    //getters y setters
    public int getid(){
        return id;
    }
    
    public void setid(int id){
        this.id = id;
    }
    
    public String getcompania() {
        return compania;
    }

    public void setcompania(String compania) {
        this.compania = compania;
    }

    public String getsalida() {
        return salida;
    }

    public void setsalida(String salida) {
        this.salida = salida;
    }
    
    public String getdestino() {
        return destino;
    }
    
    public void setdestino (String destino){
        this.destino = destino;
    }
    
    public String getpiloto() {
        return piloto;
    }
    
    public void setpiloto(String piloto){
        this.piloto = piloto;
    }
    
    
    //metodo para printar la información
    
    public String printinfo() {
        return (this.getcompania() + " Iniciará su vuelo " + this.getid()+ "\nSalida: " + this.getsalida() + " -> Llegada: " + this.getdestino() + "\na manos de: " + this.getpiloto());
    }
}