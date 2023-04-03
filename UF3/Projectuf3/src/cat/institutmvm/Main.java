/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;
import cat.institutmvm.Menumethods;
/**
 *
 * @author capu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion; //variable para que el usuario introduzca un número (la cual será su opción)
        
do { //Mostramos el menú de opciones
            System.out.println("****************************************************************************************************");
            System.out.println("******************************************** GESTIÓ D'ARTICLES *************************************");
            System.out.println("****************************************************************************************************");
            System.out.println();
            System.out.println("Escull una opció:");
            System.out.println("1. Veure articles");
            System.out.println("2. Enregistrar un nou article");
            System.out.println("3. Mostrar total d'articles");
            System.out.println("4. Sortir");
            System.out.println();
            System.out.print("Quina opció vols?: ");
            
            opcion = sc.nextInt(); //con el Scanner leeremos la opción del cliente
            
            switch (opcion) { //con un Switch invocaremos a los 4 métodos
                case 1:
                    Menumethods.opcion1(); //Opción 1
                    break;
                case 2:
                    Menumethods.opcion2(); //Opción 2
                    break;
                case 3:
                    Menumethods.opcion3(); //Opción 3
                    break;
                case 4:
                    Menumethods.opcion4(); //Opción 4
                    System.out.println("Adiós!");
                    break;    
                default: //Default
                    System.out.println("Vuelve a intentarlo");
                    break;
            }
            
        } while (opcion != 0); 
        
        ;
    }
    
}

        
  


        
        
