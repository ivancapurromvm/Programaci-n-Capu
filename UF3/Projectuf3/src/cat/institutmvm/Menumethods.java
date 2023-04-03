/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.*;

/**
 *
 * @author capu
 */
public class Menumethods { //Este es el programa donde se ejecutan los métodos

    public static void opcion1() { //El usuario tiene que introducir el nombre de su fichero y el programa validará si contiene .txt en caso de no ser asi se le añadirá. Después se mostrará el contenido del archivo
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de tu archivo(Tiene que estar dentro de la carpeta files): "); //Pedimos el nombre del archivo
        String nombrearchivo = sc.nextLine(); //Y lo convertimos a un String llamado nombrearchivo
        if (!nombrearchivo.endsWith(".txt")) { //En el caso de que no acabe con .txt ...
            System.out.print("tu archivo no es .txt\nconvirtiendo tu archivo a .txt ->"); //Se convertirá el archivo en .txt
            nombrearchivo = nombrearchivo + ".txt"; //Aquí es donde se le añadirá el ".txt"
            System.out.println(nombrearchivo); //Le mostramos el nombre del archivo final
        }
        try ( Scanner fileScanner = new Scanner(nombrearchivo)) { 
            System.out.println("Código articulo, Nombre articulo, Tipo articulo, cantidad, precio"); //Introducimos la cabezera
            while (fileScanner.hasNextLine()) { //Y ejecutamos el FileScanner
                String registro = sc.nextLine(); //Convertimos a String la siguiente linea
                String[] linea = registro.split(","); //Y con el split dividimos el string 
                System.out.println("%s\t%s\t%s\t%s%n" + linea[0] + linea[1] + linea[2] + linea[3]); //Y printamos el resultado
            }

        }
    }

    public static void opcion2() { //Pedir datos y pedir si quiere introducirlos en un documento  existente o uno nuevo
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Los datos que introducirá, ¿Desea guardarlos en su documento habitual o prefiere crear un documento nuevo?");
            System.out.println("Escoja una opción:");
            System.out.println();
            System.out.println("1. Documento habitual");
            System.out.println("2. Documento nuevo");
            int opcion = Integer.parseInt(br.readLine()); //con el int opción el usuario debe teclear 1 o 2 y nosotros lo leeremos
            String fileName; //Añado el String donde variará depende la opción que pida el usuario
            switch (opcion) { //con un switch case he puesto las 2 opciones aunque también podría haberlo hecho con un if else
                case 1:
                    System.out.println("Ingrese SOLO el nombre del documento habitual:");
                    fileName = br.readLine() + ".txt"; 
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del nuevo documento (sin la extensión):");
                    fileName = br.readLine() + ".txt";
                    File file = new File("files/" + fileName); //Como pide un archivo nuevo con el new File lo creo
                    break;
                default:
                    System.out.println("ERROR (Utiliza solo el 1 o el 2) ");
                    return;
            }
            //Aqui pediremos todos los datos
            FileWriter fw = new FileWriter("files/" + fileName, true);
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Ingrese el código del artículo:");
            String codigoArticulo = sc2.nextLine();
            System.out.println(",");
            System.out.println("Ingrese el nombre del artículo:");
            String nombreArticulo = sc2.nextLine();
            System.out.println(",");
            System.out.println("Ingrese el tipo:");
            String tipo = sc2.nextLine();
            System.out.println(",");
            System.out.println("Ingrese la cantidad:");
            String cantidad = sc2.nextLine();
            System.out.println(",");
            System.out.println("Ingrese el precio:");
            String precio = sc2.nextLine();
            BufferedReader bf3 = new BufferedReader(new FileReader("files/" + fileName));
            //en esta parte veremos si la primera linea está vacía se le agregará la cabezera
            if (bf3.readLine() == null) {
                System.out.println("Código articulo, Nombre articulo, Tipo articulo, cantidad, precio");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void opcion3() { //Mostrar el total de registros
        // Pediremos el nombre del archivo al usuario
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Ingrese el nombre del archivo (Tiene que estar dentro de la carpeta /files: ");
        String nombrearchivo = sc3.nextLine(); //creo un String con el nombre del fichero

        // Y con otro string llamado rutaArchivo le añado el string nombrearchivo 
        String rutaArchivo = "files/" + nombrearchivo;

        try {
            Scanner sc4 = new Scanner(new File(rutaArchivo));

            int numregistros = 0; //Ponemos el contador a 0

            // Contará el número de líneas en el archivo 
            while (sc4.hasNextLine()) {
                sc4.nextLine();
                numregistros++;
            }

            
            System.out.println("Total de registros en tu documento " + rutaArchivo + ":" + numregistros);

        } catch (FileNotFoundException e) {
            System.out.printf("El archivo %s no existe.%n", nombrearchivo);
            e.printStackTrace();
        }
    }

    public static void opcion4() { //Fin de programa porqué así lo quiere el usuario
        System.out.println("Seleccionaste la opción 4: \n SORTIR");
        return;
    }

}
