/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebapractica1;

import java.util.Scanner;

/**
 *
 * @author Yaqui
 */
public class Pruebapractica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        
       int exi = 1;
        int cont = 0;
        //Este es el menu principal el el cual contiene un contador para saber cuantas veces lo usamos
        //Ingresar un numero del uno al tres para indicar cual queremos usar
        while (exi == 1) {
            int opt;
            System.out.println("_____Bienvenido al menu_____");
            System.out.println("1) Repetir mi nombre");
            System.out.println("2) Submenu de mensajes");
            System.out.println("3) Salir");
            opt = sc.nextInt();
            switch (opt) {
                case 1: {
                    //En este programa ingresamos nuestro nombre y la cantidad de veces que queremos que se repita
                    System.out.println("Usted escogio el programa repetir mi nombre");
                    System.out.println("Escriba su nombre: ");
                    String nombre = sc.nextLine();
                    nombre = sc.nextLine();
                    System.out.println("Ingrese la cantidad de veces que quiere que se repita: ");
                    int cant = sc.nextInt();
                    for (int i = 0; i < cant; i++) {
                        System.out.println("Hola mi nombre es " + nombre + " y miren mi prueba");
                    }
                    break;
                }
                case 2: {
                    //Este programa esta disenado para mandarle un mensaje ya sea de bienvenida o despedida 
                    System.out.println("Usted selecciono submenu de mensajes");
                    int exi1 = 1;
                    while (exi1 == 1) {
                        System.out.println("...Bienvenido al submenu...");
                        System.out.println("1. Bienvenida");
                        System.out.println("2. Despedida");
                        int opc = sc.nextInt();
                        if (opc == 1) {
                            System.out.println("Bienvenido a mi programa");
                        } else if (opc == 2) {
                            System.out.println("Hasta luego, gracias por usar mi programa");
                        } else {
                            System.out.println("Opcion no valida");
                        }
                        System.out.println("Desea continuar (1)Continuar y (0) salir: ");
                        exi1 = sc.nextInt();
                    }
                    break;
                }
                case 3: {
                    // y el numero 3 es para salir
                    System.out.println("Adios esta fue mi prueba");
                    System.out.println("El programa se repitio: " + cont);
                    exi++;
                }
                default: {
                    System.out.println("Opcion no valida");
                    break;
                }
            }
            cont++;
        }
    }

}
   
 
