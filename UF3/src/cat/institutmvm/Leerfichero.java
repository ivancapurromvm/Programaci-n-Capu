/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Leerfichero {

    /**EJ 1 CAPU
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File file = new File("files/document.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error ocurred: ");
            e.printStackTrace();
        }
    }
}    
    
