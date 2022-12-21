/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package institutmvm.cat;
import java.util.Scanner;
/*
IVÁN CAPURRO
ASIX
PG UF1
DATA Y FECHA FINAL: 21-12-22 (3:50 a.m)
*/

public class Project2 {
private static final String MSG_1="Indica el número de clientes a registrar: "; //Declaramos todos los mensajes que mostraremos al usuario.
private static final String MSG_2="ID del cliente: ";
private static final String MSG_3="ERROR EN TUS DATOS. \t 3 intentos por dato.";
private static final String MSG_4="Edad del cliente: ";
private static final String MSG_5="TIPOS DE VENTA:";
private static final String MSG_6="Venta libre (0)";
private static final String MSG_7="Pensionista (1)";
private static final String MSG_8="Carnet Joven (2)";
private static final String MSG_9="Socio (3)";
private static final String MSG_10="Indica el NÚMERO de tipo de venta: ";
private static final String MSG_11="Indica el NÚMERO del importe total de la compra: ";
private static final String MSG_12="Indica el teléfono (del cliente): ";
private static final String MSG_13="ID" + "\t" + "EDAD" + "\t" + "TIPO" + "\t" + "IMPORTE" + "\t" + "TELÉFONO";
private static final String MSG_14="Cantidad de registros de clientes: ";
private static final String MSG_15="¿Desea consultar por tipo de cliente? (si: 1 | no: 0).";
private static final String MSG_16="¿Tipo de cliente? (Venta Libre: (0) | Pensionista: (1) | Carnet Joven: (2) | Socio: (3))";
private static final String MSG_17="ERROR(indica los datos correctos).";
private static final String MSG_18="Desea mostrar un resumen estadístico de los datos introducido? (si: 1 | no: 0).";
private static final String MSG_24="VENTA LIBRE: ";
private static final String MSG_25="PENSIONISTA: ";
private static final String MSG_26="CARNET JOVE: ";
private static final String MSG_27="SOCIO: ";
private static final String MSG_19="Número de clientes por tipo: ";
private static final String MSG_20="Histograma (*número de clientes por tipo*): ";
private static final String MSG_21="Total import: ";
private static final String MSG_23="La edad media de los clientes es: ";
private static final String TXT_VL="Venta Libre"; //Declaramos los txt (me servirá para el switch-case)
private static final String TXT_PN="Pensionista";
private static final String TXT_CJ="Carnet Joven";
private static final String TXT_SC="Socio";
private static final String MSG_22="-----------------------------";
    
public static void main(String[] args) {
    //VARIABLES
    // ↓ Aqui declaramos las variables de tipo int (donde la mayoria son contadores(de errores))
    int numclientes,
    err = 0,
    err2=0,
    j = 1,
    consult = 0,
    tipocl = 0,
    numventalibre = 0,
    numpensionista = 0,
    numcarnetjove = 0,
    numsocio = 0,
    suma = 0,
    cambio = 0; 
    // ↓ Introducimos una variable de tipo booleana=true para poder comprobar que los datos introducidos són de tipo entero con el sc.hasNextInt()
    boolean correcte = true; 
    Scanner sc = new Scanner(System.in);
    // ↓ Le pedimos al usuario el numero de clientes que quiere registrar
    System.out.println(MSG_1);
    numclientes = sc.nextInt();
    //ARRAYS
    // ↓ Declaramos arrays para poner el ID,la edad y las ventas. Y con una longitud de [clientes] que la obtendrá de la variable clientes que introduce el usuario
    int[] id = new int[numclientes]; 
    int[] edad = new int[numclientes];
    int[] ventas = new int[numclientes];
    int[] importeCompra = new int[numclientes];
    int[] telefono = new int[numclientes];
    // ↓ array para el histograma.
    int[] histograma = new int[4]; 
    // ↓ También declaramos un array STRING para el tipo de venta para al final poder mostrarlo por pantalla 
    String[] ventasString = new String[numclientes]; 
    //codigo
    for (int i = 0; i < id.length; i++, j++) {
        err = 0;
        err2 = 0;
        System.out.println("DATOS DEL CLIENTE N* " + j); // ← Mostramos el número del cliente del cual estamos introduciéndo los datos en ese momento.   
          do {
              System.out.println(MSG_2);
              correcte = sc.hasNextInt();
              if (correcte) {
                  id[i] = sc.nextInt();
                    if ((id[i] < 111) || (id[i] > 999)) { // ← Le pedimos al usuario que inserte la ID (que tiene que estar entre 111 y 999
                        correcte = false;
                        System.out.println(MSG_3); //MSG DE ERROR
                        // ↓ En el caso que no cumpla esa condición,el contador de errores incrementará
                        err2++;
                    }
               } else {
                        sc.next();
                        System.out.println(MSG_3); //MSG DE ERROR
                        // ↓ En el caso también de que la ID no sea de tipo Int, el contador de errores incrementará
                        err2++;
                }
            err++;
            } while ((!correcte) && (err < 3));// ← Esta repetición se hará mientras el booleano sea incorrecto y el contador de errores no sea 3 ← 
            
            err = 0; // ← Los errores se restablecen,por lo tanto el contador de error lo volvemos a poner en 0
          
          if (err < 3 && correcte) {
              err2 = 0; // ← También volvemos a restablecer el otro contador de errores a 0
                do {
                    System.out.println(MSG_4);
                    correcte = sc.hasNextInt(); 
                    if (correcte) { //← Valoramos que la edad sea de tipo INT con el sc.hasNextInt() (en la linea anterior)
                             edad[i] = sc.nextInt(); 
                            if ((edad[i] < 14) || (edad[i] > 120)) { // ← El usuario deberá introducir la edad del cliente cumpliendo la condición (mayor que 14 y menor que 120 años)
                                correcte = false; 
                                System.out.println(MSG_3); //MSG DE ERROR
                                //↓ En el caso que no cumpla esa condición,el contador de errores incrementará
                                err2++;
                            }
                    } 
                    else {
                        sc.next();
                        System.out.println(MSG_3); //MSG DE ERROR
                        // ↓ En el caso que no cumpla esa condición,el contador de errores incrementará
                        err2++;
                    }
                    err++;
                } while ((!correcte) && (err < 3)); //← Esta repetición se hará mientras el booleano sea incorrecto y el contador de errores no sea 3 
            }
          
            err = 0;
            
            // ↓ El programa se ejecutará si el contador de errores es menor a 3 y valorCorrecto = true.
            if (err < 3 && correcte) { 
                err2 = 0;
                do { // ↓ Printaremos todos los tipos de venta disponibles
                    System.out.println(MSG_5); 
                    System.out.println(MSG_6); //venta libre
                    System.out.println(MSG_7); //pensionista
                    System.out.println(MSG_8); //carnet joven
                    System.out.println(MSG_9); //socio
                    System.out.println(MSG_10); //mensaje para introducir el valor
                    correcte = sc.hasNextInt();
                    if (correcte) {
                        ventas[i] = sc.nextInt();
                        if ((ventas[i] < 0) || (ventas[i] > 3)) { // ← El usuario debe introducir el tipo de venta cumpliendo la condición de que sea uno de estos numeros {0,1,2,3}
                            correcte = false;
                            System.out.println(MSG_3); //MSG DE ERROR
                           //↓ En el caso que no cumpla esa condición,el contador de errores incrementará
                            err2++;
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_3); //MSG DE ERROR
                        //↓ En el caso que no cumpla esa condición,el contador de errores incrementará
                        err2++;
                    }
                    err++;
                } while ((!correcte) && (err < 3)); //← Esta repetición se hará mientras el booleano sea incorrecto y el contador de errores no sea 3 
            }
            err = 0;
            // ↓ El programa se ejecutará si el contador de errores es menor a 3 y valorCorrecto = true.
            if (err < 3 && correcte) {
                err2 = 0;
                do {
                    System.out.println(MSG_11); //importe compra (sin $ ni euros) !borrar!
                    correcte = sc.hasNextInt();
                    if (correcte) {
                        importeCompra[i] = sc.nextInt();
                        if ((importeCompra[i] < 0) || (importeCompra[i] > 1000)) { // ← el usuario debe introducir el importe de la compra (sin decimales y entre 0 y 1000 euros)
                            correcte = false;
                            System.out.println(MSG_3); //MSG DE ERROR
                          //↓ En el caso que no cumpla esa condición,el contador de errores incrementará
                            err2++;
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_3); //MSG DE ERROR
                       //↓ En el caso que no cumpla esa condición,el contador de errores incrementará
                        err2++;
                    }
                    err++;
                } while ((!correcte) && (err< 3)); //← Esta repetición se hará mientras el booleano sea incorrecto y el contador de errores no sea 3
            }
            err = 0;
            // ↓ El programa se ejecutará si el contador de errores es menor a 3 y valorCorrecto = true.
            if (err < 3 && correcte) {
                err2 = 0;
                do {
                    System.out.println(MSG_12); //pedir tlf
                    correcte = sc.hasNextInt();
                    if (correcte) {
                        telefono[i] = sc.nextInt();
                        if ((telefono[i] < 111111111) || (telefono[i] > 999999999)) { // ← El usuario debe introducir el num. de tlf. que tiene que estar entre 111111111 y 999999999
                            correcte = false;
                            System.out.println(MSG_3); //MSG DE ERROR
                            //↓ En el caso que no cumpla esa condición,el contador de errores incrementará
                            err2++; 
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_3); //MSG DE ERROR
                        //↓ En el caso que no cumpla esa condición,el contador de errores incrementará
                        err2++;
                    }
                    err++;
                } while ((!correcte) && (err < 3)); //← Esta repetición se hará mientras el booleano sea incorrecto y el contador de errores no sea 3
            }
            /*
            esta condición hará que en caso de que el usuario haya hecho 3 errores volverá a pedir el mismo gracias a que restamos las variables
            */
                if (err2 >= 3) { 
                    i = i - 1;   
                    j = j - 1;
                }
        }
        /*Con estos ciclos for se comparan posiciones de el array edad,si un valor es más grande que el otro,se intercambian.
        */
        for (int i = 0; i < edad.length - 1; i++) { 
                for (int l = i + 1; l < edad.length; l++) { 
                    if (edad[i] > edad[l]) {
                        
                        //ordenar id
                        cambio = id[i];
                        id[i] = id[l];
                        id[l] = cambio;
                        
                        //ordenar edad
                        cambio = edad[i];
                        edad[i] = edad[l];
                        edad[l] = cambio;
                        
                        //ordenar ventas
                        cambio = ventas[i];
                         ventas[i] = ventas[l];
                        ventas[l] = cambio;
                        
                        //ordenar importe de la compra
                        cambio = importeCompra[i];
                        importeCompra[i] = importeCompra[l];
                        importeCompra[l] = cambio;
                        //ordenar tlf
                        
                        cambio = telefono[i];
                        telefono[i] = telefono[l];
                        telefono[l] = cambio;
                    }
                }
        }
        //Aqui con un Switch-Caase indicamos los tipos de venda a un texto ↓
        for (int i = 0; i < ventas.length; i++) { 
            switch (ventas[i]) {                  
                case 0:
                    
                    ventasString[i] = TXT_VL;
                    break;
                    
                case 1:
                    
                    ventasString[i] = TXT_PN;
                    break;
                    
                case 2:
                    
                    ventasString[i] = TXT_CJ;
                    break;
                    
                case 3:
                    
                    ventasString[i] = TXT_SC;
                    break;
                    
            }
        }
         // ↓ El programa se ejecutará si el contador de errores es menor a 3 y valorCorrecto = true.
        if (err < 3 && correcte) {
            System.out.println("");
            //↓ Con este codigo mostraremos la tabla final con todos los valores de los clientes que nos ha dado el usuario
            System.out.println(MSG_13); 
            for (int i = 0; i < numclientes; i++) {
            System.out.print(id[i]);
            System.out.print("\t");
            System.out.print("|");
            System.out.print(edad[i]);
            System.out.print("\t");
            System.out.print("|");
            System.out.print(ventasString[i]);
            System.out.print("\t");
            System.out.print("|");
            System.out.print(importeCompra[i] + "$");
            System.out.print("\t");
            System.out.print("|");
            System.out.print(telefono[i]);
            System.out.println();
            System.out.print("|");
            }
        }
        //PARTE 2: PEDIR AL CLIENTE SI QUIERE CONSULTAR LOS REGISTROS POR TIPO DE VENTA
        // ↓ El programa se ejecutará si el contador de errores es menor a 3 y valorCorrecto = true.
        if (err < 3 && correcte) {
                System.out.println("");
                System.out.println(MSG_14 + numclientes);
                System.out.println("");
                do {
                    System.out.println(MSG_15);
                    correcte = sc.hasNextInt();
                        if (correcte) {
                        consult = sc.nextInt();
                        // ↓ El usuario deberá introducir un 0 o un 1 dependiendo de si quiere o no 
                            if ((consult < 0) || (consult > 1)) { 
                            correcte = false;
                            System.out.println(MSG_17); //error
                            }
                        } else {
                        sc.next();
                        System.out.println(MSG_17); //error
                        }
                } while ((!correcte)); // ← Lo hará siempre que escriba 0 o 1.
                
                
                if (consult == 1) { //← En caso de que El usuario ha dicho SI(1) 
                do {          
                    System.out.println(MSG_16);
                    correcte = sc.hasNextInt();
                    if (correcte) {
                        tipocl = sc.nextInt();
                        if ((tipocl < 0) || (tipocl > 3)) { //el valor que introduzca tiene que estar dentro de tipocliente {0,1,2,3,ç
                            correcte = false;
                            System.out.println(MSG_17); //error
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_17); //error
                    }
                } while ((!correcte)); // ← Se ejecutará mientras que escriba {0, 1, 2 o 3}
                
                
                if (tipocl == 0) { // ← El usuario decide hacerlo por venta libre
                    System.out.println(MSG_13);
                    for (int i = 0; i < ventas.length; i++) {
                        // ↓mediante este if solo se mostrarán las posiciones en la cuál la array ventas[i] sea igual a 0
                        if (ventas[i] == 0) { 
                            //Con este codigo mostraremos la tabla final con todos los valores de los clientes que nos ha dado el usuario y la condición anterior
                            System.out.print(id[i]);
                            System.out.print("\t");
                            System.out.print(edad[i]);
                            System.out.print("\t");
                            System.out.print(ventasString[i]);
                            System.out.print("\t");
                            System.out.print(importeCompra[i] + "$");
                            System.out.print("\t");
                            System.out.print(telefono[i]);
                            System.out.println();
                        }
                    }
                }
                
                
                // ↓  El usuario decide hacerlo por pensionista
                if (tipocl == 1) { 
                    System.out.println(MSG_13);
                    for (int i = 0; i < ventas.length; i++) {
                        // ↓mediante este if solo se mostrarán las posiciones en la cuál la array ventas[i] sea igual a 1
                        if (ventas[i] == 1) { 
                            //Con este codigo mostraremos la tabla final con todos los valores de los clientes que nos ha dado el usuario y la condición anterior
                            System.out.print(id[i]);
                            System.out.print("\t");
                            System.out.print(edad[i]);
                            System.out.print("\t");
                            System.out.print(ventasString[i]);
                            System.out.print("\t");
                            System.out.print(importeCompra[i] + "$");
                            System.out.print("\t");
                            System.out.print(telefono[i]);
                            System.out.println();
                        }
                    }
                }
                
                
                // ↓ El usuario decide hacerlo por carnet joven
                if (tipocl == 2) { 
                    System.out.println(MSG_13);
                    for (int i = 0; i < ventas.length; i++) {
                        // mediante este if solo se mostrarán las posiciones en la cuál la array ventas[i] sea igual a 2
                        if (ventas[i] == 2) { 
                            //Con este codigo mostraremos la tabla final con todos los valores de los clientes que nos ha dado el usuario y la condición anterior
                            System.out.print(id[i]);
                            System.out.print("\t");
                            System.out.print(edad[i]);
                            System.out.print("\t");
                            System.out.print(ventasString[i]);
                            System.out.print("\t");
                            System.out.print(importeCompra[i] + "$");
                            System.out.print("\t");
                            System.out.print(telefono[i]);
                            System.out.println();
                        }
                    }
                }
                
                
                // El usuario decide hacerlo por socio
                if (tipocl == 3) { 
                    System.out.println(MSG_13);
                    for (int i = 0; i < ventas.length; i++) {
                        // mediante este if solo se mostrarán las posiciones en la cuál la array ventas[i] sea igual a 2
                        if (ventas[i] == 3) { 
                            //Con este codigo mostraremos la tabla final con todos los valores de los clientes que nos ha dado el usuario y la condición anterior
                            System.out.print(id[i]);
                            System.out.print("\t");
                            System.out.print(edad[i]);
                            System.out.print("\t");
                            System.out.print(ventasString[i]);
                            System.out.print("\t");
                            System.out.print(importeCompra[i] + "$");
                            System.out.print("\t");
                            System.out.print(telefono[i]);
                            System.out.println();
                        }
                    }
                }
            }
            
                
            //PARTE 3: RESUMEN ESTADISTICA CLIENTES
            //// ↓preguntamos al usuario si quiere consultar un resumen estadístico (1=yes;2=n0)
            System.out.println("");
            System.out.println(MSG_18);
            consult = sc.nextInt();
                if (consult == 1) { //el cliente dijo SI
                    System.out.println("");
                    System.out.println(MSG_14 + j);
                    System.out.println("");
                    // ↓ Mediante este bucle almacenamos todas las edades en la variable total.
                    for (int i = 0; i < edad.length; i++) { 
                        suma = suma + edad[i];
                    }
                    // ↓ media
                    System.out.println(MSG_23 + (float) suma / numclientes + "años"); 
                    System.out.println("");
                    System.out.println(MSG_19);
                    System.out.println("");
                    // ↓ Con este bucle recorreremos el array ventas y a cada número le pondremos un contador para saber la cantidad de tipos de clientes 
                    for (int i = 0; i < ventas.length; i++) { 
                        if (ventas[i] == 0) { //por ejemplo si encuentra uno de tipo ventalibre se le sumará 1 al contador de tipolibre                
                            numventalibre = numventalibre + 1;        
                        }
                        if (ventas[i] == 1) {
                            numpensionista = numpensionista + 1;
                        }
                        if (ventas[i] == 2) {
                            numcarnetjove = numcarnetjove + 1;
                        }
                        if (ventas[i] == 3) {
                            numsocio = numsocio + 1;
                        }
                    }
                    
                // ↓ Mostramos el número de cliente por tipo
                
                    System.out.println(MSG_24 + numventalibre);
                    System.out.println("");
                    System.out.println(MSG_25 + numpensionista);
                    System.out.println("");
                    System.out.println(MSG_26 + numcarnetjove);
                    System.out.println("");
                    System.out.println(MSG_27 + numsocio);
                    System.out.println("");
                
                //*****HISTOGRAMA*****
                //↓Conectamos o asociamos la array de las barras con las diferentes array de los contadores
                histograma[0] = numventalibre; 
                histograma[1] = numpensionista;
                histograma[2] = numcarnetjove;
                histograma[3] = numsocio;
                System.out.println(MSG_20);
                System.out.println(MSG_22);
                    for (int i = 0; i < histograma.length; i++) {
                        switch (i) {
                            case 0:
                                if (histograma[i] > 0) { // ← Con este if solo printaremos las mayores que 0, es decir las que han sido introducidas solo por el usuario,las demás no 
                                    System.out.print(MSG_24);
                                    break;
                                }
                            case 1:
                                if (histograma[i] > 0) {
                                    System.out.print(MSG_25);
                                    break;
                                }
                            case 2:
                                if (histograma[i] > 0) {
                                    System.out.print(MSG_26);
                                    break;
                                }
                            case 3:
                                if (histograma[i] > 0) {
                                    System.out.print(MSG_27);
                                    break;
                                }
                        }
                    // ↓ Recorremos el array de barras y printamos "*"
                     for (int c = 0; c < histograma[i]; c++) {
                        System.out.print("*");
                        }
                     
                    System.out.println();
                }
                    
                suma = 0;
                
                //para el importe de la compra
                     // ↓ Con la variable total recorremos todo el array importecompra y le vamos sumando los valores 
                     
                        for (int i = 0; i < importeCompra.length; i++) { 
                            suma = suma + importeCompra[i];
                    }
                    //mostramos el total de importe compra
                System.out.println("");
                System.out.println(MSG_21 + suma + "€");
                System.out.print("");
            }
        }

    }
    //FIN DEL PROGRAMA :)
}
