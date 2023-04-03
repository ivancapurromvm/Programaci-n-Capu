/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
import java.util.Scanner;
/**
 *
 * @author capu
 * EN ESTA CLASE CREARÉ ALGUNOS METODOS DEL PROGRAMA
 */
public class Methods {
    /**El primer método que crearé será principalmente para establecer un mínimo
    *y un máximo, y para controlar el número de errores de los registros id,edad
    * importe y telefono 
    * ⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩
    */
    public int Datosregistros(Scanner sc, String MSG_Error, String MSG_Datos, int min, int max){ //estas son las variables del main
        //Añadimos las variables para el contador,para los datos y un boleano que nos dirá si los datos son los correctos
        int count = 0;   
        int datos;
        boolean correcte;
        do{
            System.out.println(MSG_Datos);
            correcte = sc.hasNextInt();//comprobamos si el dato introducido es del mismo tipo que int
            if(correcte){ //en caso de que sea correcto ⇩⇩⇩
            datos = sc.nextInt();
            if((datos < min) || (datos > max)) {//El registro tiene que estar entre el minimo y el maximo que hemos exstablecido sino...⇩⇩⇩
            //Printaremos el mensaje de error, el boleano será falso y el contador sumará
            System.out.println(MSG_Error);
            correcte = false;
            count++;
            }else{
            return datos;
            }
            }else {
            //Printaremos el mensaje de error, el boleano será falso y el contador sumará
            sc.next();
            System.out.println(MSG_Error);
            count++;
            }
        } while ((!correcte) && (count < 3));
        return count;
    }
    //método para ordenar los datos con recursividad ⇩⇩
    public void Ordenarrecursividad(int[] edad, int[] id, int[] opcion, int[] importe, int[] telefono, int[] sorteo, int j, int i) { //estas son las variables del main
        if (i < edad.length - 1) {
            if (j < edad.length) {
                if (edad[i] > edad[j]) {
                    int cambio = id[i];
                    id[i] = id[j];
                    id[j] = cambio;
                    cambio = edad[i];
                    edad[i] = edad[j];
                    edad[j] = cambio;
                    cambio = opcion[i];
                    opcion[i] = opcion[j];
                    opcion[j] = cambio;
                    cambio = importe[i];
                    importe[i] = importe[j];
                    importe[j] = cambio;
                    cambio = telefono[i];
                    telefono[i] = telefono[j];
                    telefono[j] = cambio;
                    cambio = sorteo[i];
                    sorteo[i] = sorteo[j];
                    sorteo[j] = cambio;
                }
                Ordenarrecursividad(edad, id, opcion, importe, telefono, sorteo, j + 1, i + 1);
            } else {
                j = 0;
                Ordenarrecursividad(edad, id, opcion, importe, telefono, sorteo, j, i + 1);
            }
        }
    }
    //Metodo para sacar un número premiado (Sorteo)
    public void Sorteo(String MSG, String MSG_1, Scanner sc, int[] sorteo, int[] id) { //estas son las variables del main
        System.out.println(MSG);
        int numsorteo = sc.nextInt();
        if (numsorteo == 1) {
            int premio = (int) (Math.random() * 5000); //con el match.random se genera un número aleatorio entre el 1 y 5000
            System.out.println("El número ganador es " + premio); //Muestro un mensaje con el número ganador
            for (int i = 0; i < sorteo.length; i++) {
                if (premio == sorteo[i]) {
                    System.out.println(MSG_1 + id[i]);
                }
            }
            System.out.println("Ningun usuario ha salido premiado");
        }
    }
    
    //Método para hacer histograma con *****
    public void Histograma(String MSG, int ventalibre, int pensionista, int carnetjoven, int socio) { //estas son las variables del main
        System.out.println("\n" + MSG + "\n");
        System.out.print("-------------------------------------" + "\n");
        if (ventalibre != 0) {//El histograma no se hará si no tiene ningún registro
            System.out.print("\t" + "libre: ");
            for (int i = 0; i < ventalibre; i++) {//por cada registro muestra un asterisco (*)
                System.out.print("* ");//*
            }

        }
        if (pensionista != 0) {//El histograma no se hará si no tiene ningún registro
            System.out.print("\n" + "\t" + "pensionista: ");
            for (int i = 0; i < pensionista; i++) {//por cada registro muestra un asterisco (*)
                System.out.print("* ");//*
            }

        }
        if (carnetjoven != 0) {//El histograma no se hará si no tiene ningún registro
            System.out.print("\n" + "\t" + "joven: ");
            for (int i = 0; i < carnetjoven; i++) {//por cada registro muestra un asterisco (*)
                System.out.print("* ");//*
            }

        }
        if (socio != 0) {//El histograma no se hará si no tiene ningún registro
            System.out.print("\n" + "\t" + "socio: ");
            for (int i = 0; i < socio; i++) {//por cada registro muestra un asterisco (*)
                System.out.print("* ");//*
            }
        }
        System.out.println("\n");
    }
    
}    
    

