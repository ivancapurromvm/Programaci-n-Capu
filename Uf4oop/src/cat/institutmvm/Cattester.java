/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;

//EJERCICIO 5 TESTER
public class Cattester {
    public static void main(String[] args) {
        //creación de nuevo objeto y ya le doy valores
        Cat michu = new Cat("Michu","12","Naranja","Ratones");
        //Printo los atributos
        System.out.println(michu.Mostrardatos());
        //Printo las acciones del michu
        System.out.println("Algunas de las cosas que hace michu: ");
        michu.baño();
        michu.cazar();
        michu.comer();
        michu.jugar();
        michu.maullar();
    }
    
}
