/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * capu ASIX1 ej 9
 */

public class Dadesmenu {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //pongo a repeticion el valor 1 para que pueda entrar al while
       int repeticion = 1;
    //Implementa un programa que demani per teclat les següents dades:
    while (repeticion == 1) {
      System.out.println("Id: ");
      int id = sc.nextInt();
      sc.nextLine();
      System.out.println("Nom ");
      String nom = sc.nextLine();
      System.out.println("Apellido: ");
      String apellido = sc.nextLine();
      System.out.println("Edad: ");
      int edad = sc.nextInt();
      try {
        FileWriter fw = new FileWriter("files/sorteo.txt", true);
        fw.write(id + " " + nom + " " + apellido + " " + edad);
        fw.close();
      } catch (IOException e) {
        System.out.println("ERROR");
        e.printStackTrace();
      }

      System.out.println("Si quieres introducir otro registe pulse 1. \n Si quiere finalizar pulse 0");
      repeticion = sc.nextInt();
    }

   
  }
}

