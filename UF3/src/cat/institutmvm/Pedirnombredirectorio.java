/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;
import java.io.*;
import java.util.Scanner;
//ejercicio 15 capu

public class Pedirnombredirectorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del directorio:");
        String directorio = sc.nextLine(); //creo un string llamado directorio donde tomo la info del scanner
        File folder = new File(directorio); //"directorio" es la ruta que nos da el usuario
        File[] archivos = folder.listFiles();
        System.out.println("Archivos en " + directorio + ":");
        for (File archivo : archivos) {
                System.out.println(archivo.getName());
            
        }
    }
}
