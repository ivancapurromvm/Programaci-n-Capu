/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * capu ASIX1
 */
public class Extensiontxt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de tu archivo: ");
        String nombrearchivo = sc.nextLine();
        if (!nombrearchivo.endsWith(".txt")) {
            System.out.print("tu archivo no es .txt\nconvirtiendo tu archivo a .txt ->");
            nombrearchivo = nombrearchivo + ".txt";
            System.out.println(nombrearchivo);
        }
        try (Scanner fileScanner = new Scanner(nombrearchivo)) {
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
    }

}
