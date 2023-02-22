/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package cat.institutmvm;

/**
 *
 * @author capu
 */
public class Hanoi {

 public void hanoiTower(int n, char from_disc, char to_disc, char aux){
 if(n == 1){
 System.out.format("Mou el disc 1 des de %c fins a %c\n",from_disc, to_disc);
 }

 else{
 hanoiTower(n - 1, from_disc, aux, to_disc);
 System.out.format("Mou el disc %d des de %c fins a %c\n", n, from_disc, to_disc);
 hanoiTower(n - 1, aux, to_disc, from_disc);
 }
}

public static void main(String[] args) {
 int n=3;
 Hanoi met = new Hanoi();
 met.hanoiTower(n, 'A', 'C', 'B');
} 
}
