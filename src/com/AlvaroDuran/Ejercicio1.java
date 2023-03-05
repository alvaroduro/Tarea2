/*Ejercicio_1*/

package com.AlvaroDuran;

import java.util.Scanner;//Importamos en la api de java la clase Scanner

/**
 * Clase para el ejercicio 1 de la clase de DAW semi de programación
 * @author Alvaro Duran <adurama436@g.educaand.es>
 */
public class Ejercicio1 {

    public static void main(String[] args, boolean SeguridadPrueba) {
       
        //Declaracion de variables
        int a, b, c;
        char eleccionElegida;
        boolean salir = false; //Creamos e iniciamos una variable para salir del bucle del menu
        
        //Variables auxiliares
        
        //Objeto Scanner para peticion de datos de entrada
        Scanner sc = new Scanner(System.in); //Declaramos un objeto Scanner
        
        //Creamos nuestro bucle para volver a elegir o terminar segun la opcion elegida
        
       do {
        
            menu();
        
        //Pedimos al usuario introduzca un caracter
        System.out.println("Introduzca una letra del menú.");
        eleccionElegida = sc.next().charAt(0);//Lee el primer caracter del string introducido por teclado        
        
                //Proceso del programa
        
        //Utilizamos la estructura switch para el programa debido a la elección de opciones
        switch(eleccionElegida) {
            
            case 'A':
            case 'a':
                
                salir = ActualizaSistema(sc);
            break;
               
            case 'C':
            case 'c':
                
                salir = SeguridadPrueba;
            break;
               
            case 'R': 
            case 'r':
                
                salir = CopiaSeguridadRestaurar(sc);
            break;
               
            case 'B': 
            case 'b':
                
                salir = BuscarActualizaciones(sc);
            break;
            
            case 'S': 
            case 's':
                
                salir = Salir(sc);
            break;
               
            default:
                salir = false;//Con esta condicion nos aseguramos de repetir el bucle y volver al principio
                System.out.println("Valor ingresado erróneo, por favor vuelva a introducir el valor correcto.\n");
                
        }//Fin switch
        
      } while(salir == false);//Fin while
        
    }//Fin class principal

    private static boolean Salir(Scanner sc) {
        boolean salir;
        System.out.println("Has elegido salir. \n"
                + "Adiós.\n\n"
                + "Pulse cualquier tecla para continuar.");
        sc.next();
        salir = true;
        return salir;
    }

    private static boolean BuscarActualizaciones(Scanner sc) {
        boolean salir;
        System.out.println("Buscando actualizaciones..\n"
                + "Asegúrese de estar conectado a una red wifi. \n"
                + "Pulse cualquier tecla para continuar.");
        sc.next();
        System.out.println("Fin del programa, adiós.");
        salir = true;
        return salir;
    }

    private static boolean CopiaSeguridadRestaurar(Scanner sc) {
        boolean salir;
        System.out.println("Restaurando copia de seguridad..\n\n"
                + "Pulse cualquier tecla para continuar.");
        sc.next();
        System.out.println("Fin del programa, adiós.");
        salir = true;
        return salir;
    }

    private static boolean CopiaSeguridad(Scanner sc) {
        boolean salir;
        System.out.println("Creando copia de seguridad..\n\n"
                + "Pulse cualquier tecla para continuar.");
        sc.next();
        System.out.println("Fin del programa, adiós.");
        salir = true;
        return salir;
    }

    private static boolean ActualizaSistema(Scanner sc) {
        boolean salir;
        System.out.println("Actualizando el sistema...\n"
                + "La operación puede durar varios minutos..\n\n"
                + "Pulse cualquier tecla para continuar.");
        sc.next(); //Utilizamos el método next de la clase Scanner para leer por teclado cualquier tecla
        System.out.println("Fin del programa, adiós.");
        salir = true;
        return salir;
    }

    private static void menu() {
        //Utilizamos el bucle por si se introduce cualquier tecla diferente a las opciones dadas
        
        //Entrada de datos
        
        System.out.println("~~~~~~~~~~~~~~|MENÚ PRINCIPAL|~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "| A - Actualizar el sistema.                          |\n"
                + "| C - Crear copia de seguridad.                       |\n"
                + "| R - Restaurar copia de seguridad.                   |\n"
                + "| B - Buscar actualizaciones.                         |\n"
                + "| S - Salir del programa.                             |\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
}//Fin class Ejercicio1
