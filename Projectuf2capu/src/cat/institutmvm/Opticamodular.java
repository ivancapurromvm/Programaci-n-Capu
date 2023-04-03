/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;
import cat.institutmvm.Methods;
import java.util.Scanner;
import java.lang.Math;
//LA BUEEEENA

public class Opticamodular {
    //Lo primero que haré será introducir todos los Strings (Textos
    /*que aparecerán en el programa
    */
    private static final String MSG_1="Introduce el número de clientes que registrarás";
    private static final String MSG_2="Cliente";
    private static final String MSG_3="Id del cliente: ";
    private static final String MSG_4="Edad del cliente: ";
    private static final String MSG_5="Tipos de cliente: \n(0)venta libre\n(1)pensionista\n(2)carnet joven\n(3)socio";
    private static final String MSG_6="¿Que tipo es el cliente?: ";
    private static final String MSG_7="Introduzca tan solo el importe de la compra: ";
    private static final String MSG_8="Introduzca un telefono de contacto de 9 dígitos: ";
    private static final String MSG_9="Datos erróneos";
    private static final String MSG_10="¿Desea ver un resumen estadístico de los datos introducidos?\n(1)SI-(2)NO: ";
    private static final String MSG_11="Número de clientes introducidos: ";
    private static final String MSG_12="Edad media: ";
    private static final String MSG_13="Histograma(*) de número de clientes por tipos: ";
    private static final String MSG_14="Importe total entre todos los usuarios: ";
    private static final String MSG_15="¿Desea realizar el sorteo? (1)SI-(2)NO: ";
    private static final String MSG_16="GANADOR: ";
    private static final String MSG_17="Número de clientes por tipo: ";
    
    

    public static void main(String[] args){
        int num;
        int cliente;
        int tipocliente=0;
        int cambio=0;
        int count=0;
        int total=0;
        int media=0;
        int ventalibre=0;
        int pensionista=0;
        int carnetjoven=0;
        int socio=0;
        boolean correcto;
        Scanner sc=new Scanner(System.in);
        Methods meth = new Methods();
        System.out.println(MSG_1);
        cliente = sc.nextInt();
        int[] id = new int[cliente];
        int[]edad = new int[cliente];
        int[] opcion = new int[cliente];
        int[] importetotal = new int[cliente];
        int[] telefono = new int[cliente];
        int[] sorteo = new int[cliente];
        String[] tipo = new String[cliente];
        for (int i = 0; i < cliente; i++){
            System.out.println("\nDatos del cliente " + i + ":\n");
            id[i]=meth.Datosregistros(sc, MSG_9, MSG_3, 111, 999);
            edad [i]=meth.Datosregistros(sc, MSG_9, MSG_4, 14, 120);
            do{
            System.out.println(MSG_5);
            System.out.println(MSG_6);
            correcto=sc.hasNextInt();
            if(correcto){
                opcion[1]=sc.nextInt();
                if((opcion[i]<0) || (opcion[i]>3)){
                System.out.println(MSG_9);
                correcto=false;
                count++;
                }
            switch(opcion[i]){
                        case 0:
                            tipo[i] = "Venta libre";
                            break;
                        case 1:
                            tipo[i] = "Pensionista";
                            break;
                        case 2:
                            tipo[i] = "Carnet joven";
                            break;
                        case 3:
                            tipo[i] = "Socio";
                            break;
                    }

                }else {
                sc.next();
                System.out.println(MSG_9);
                count++;
            }
            } while ((!correcto)&&(count<3));
            importetotal[i] = meth.Datosregistros(sc, MSG_9, MSG_7, 0, 1000);
            telefono[i]=meth.Datosregistros(sc, MSG_9, MSG_8, 111111111, 999999999);
            sorteo[i]=(int) (Math.random() * 5000);
        }
        //Muestro los datos:
        System.out.println("ID\t" + "EDAD\t" + "TIPO\t" + "\tIMPORTE " + "\tTELEFONO " + "\tNÚM.SORTEO");
        for (int i = 0; i < cliente; i++) { 
       System.out.println(id[i] + "\t" + edad[i] + "\t" + tipo[i] + "\t" + importetotal[i] + "\t" + telefono[i] + "\t" + sorteo[i]);
    }
        System.out.println("Número total registros: " + cliente);
        
        meth.Ordenarrecursividad(edad, id, opcion,importetotal, telefono, sorteo, 1, 0);
        for(int i = 0; i < opcion.length; i ++){
            if (opcion[i]==tipocliente){
                System.out.println(id[i] + " " + edad[i] + " " + importetotal[i] + " " + telefono[i] + "   " + sorteo[i] + "\n");
            }
        }
    System.out.println(MSG_10);
    num=sc.nextInt();
    if (num  == 1){
    System.out.println(MSG_11 + cliente);
    for (int i = 0; i < edad.length; i++) {//Para hacer la media de la edad
                    media = media + edad[i];
                }
    System.out.println(MSG_12 + media/cliente);
    System.out.println(MSG_17);
    for (int i = 0; i < tipo.length; i++) {
        if (opcion[i] == 0){
            ventalibre = ventalibre +1;
            
        }
        if(opcion[i] == 1){
            pensionista = pensionista +1;
            
        }
        if(opcion[i] == 2){
            carnetjoven = carnetjoven +1;
            
        }
        if(opcion[i] == 3){
            socio = socio +1;
        }
    }
    if (ventalibre!=0){
      System.out.println("\t" + "Venta libre: " + ventalibre);
        
    }
    if (pensionista!=0){
    System.out.println("\t" + "Pensionista: " + pensionista);
 
    }
    if (carnetjoven != 0) {
    System.out.println("\t" + "Carnet joven: " + carnetjoven);
    
    }
    if (socio != 0) {
     System.out.println("\t" + "Socio: " + socio);
    
    }
    meth.Histograma(MSG_13, ventalibre, pensionista, carnetjoven, socio);
    for (int i = 0; i < importetotal.length; i++) {
    total = total + importetotal[i];
    }
    System.out.println(MSG_14+total);
    meth.Sorteo(MSG_15, MSG_16, sc, sorteo, id);
    }else if (num==0){
    meth.Sorteo(MSG_15, MSG_16, sc, sorteo, id);
    }
    }
}
