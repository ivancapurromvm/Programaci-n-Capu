/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;
import java.util.Random;
import java.util.Scanner;
// capu ej 14
public class Aleatorio200 {
  public static void main(String[] args) {
    // Generamos la lista de 10 valores aleatorios
    Random random = new Random();
    int[] lista = new int[10];
    for (int i = 0; i < lista.length; i++) {
      lista[i] = random.nextInt(186) + 15;
    }

    // Pedimos al usuario que ingrese un valor
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa un valor: ");
    int valor = scanner.nextInt();

    // Buscamos el valor en la lista
    boolean encontrado = false;
    for (int i = 0; i < lista.length; i++) {
      if (lista[i] == valor) {
        encontrado = true;
        break;
      }
    }

    // Imprimimos el resultado
    if (encontrado) {
      System.out.println("El valor está en la lista.");
    } else {
      System.out.println("El valor no está en la lista.");
    }
  }
}
