/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;

import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
//capu ASIX 1 ej 3
public class Contarcaracteres {

	
	public static void main (String[] args) {
	try{
        String data = new String(Files.readAllBytes(Paths.get("files/document.txt")));
	System.out.println(data);
	System.out.println();
	System.out.println("Num de carcateres= " + data.length());
	
	}catch (IOException e) {
		e.printStackTrace();
	}
    }
}

