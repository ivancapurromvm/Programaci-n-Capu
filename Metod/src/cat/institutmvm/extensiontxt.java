/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;
/**
 *
 * @author capu
 */
public class extensiontxt {
    
    // Función para validar y modificar la extensión del archivo
    public static String validarExtension(String nombreArchivo) {
        // Si el nombre del archivo es nulo, devolver null
        if (nombreArchivo == null) {
            return null;
        }
        
        // Si el nombre del archivo no contiene ninguna extensión, añadir .txt
        if (!nombreArchivo.contains(".")) {
            nombreArchivo += ".txt";
        }
        // Si el nombre del archivo ya tiene una extensión, sobrescribirla por .txt
        else {
            nombreArchivo = nombreArchivo.substring(0, nombreArchivo.lastIndexOf(".")) + ".txt";
        }
        
        // Devolver el nombre del archivo con la extensión .txt
        return nombreArchivo;
    }
    
    // Función para solicitar y mostrar el nombre del archivo al usuario
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Solicitar al usuario el nombre del archivo
        System.out.print("Ingrese el nombre del archivo: ");
        String nombreArchivo = sc.nextLine();
        
        // Validar y modificar la extensión del archivo
        String nombreArchivoModificado = validarExtension(nombreArchivo);
        
        // Mostrar el resultado por pantalla
        System.out.println("El nombre del archivo modificado es: " + nombreArchivoModificado);
       
    }
}
