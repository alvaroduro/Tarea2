/*Ejercicio_2*/

package com.AlvaroDuran;

import java.util.Scanner; //Importamos la clase Scanner

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        //Declaracion de variables
        byte numero; //Utilizamos la variable byte para gestinar mejor la memoria
        
        //Variables auxiliares
        
        //Objeto Scanner para peticion de datos de entrada
        Scanner sc = new Scanner (System.in);
            
                //Entrada de datos y Proceso del programa 

            System.out.println("Introduzca un número entre 1 y 7, correspondrá a un día de la semana");
            numero = sc.nextByte(); //Almacenamos la entrada por teclado
            
            switch(numero){
                
                case 1:
                    System.out.println("El día elegido es Lunes");
                    break;
                case 2:
                    System.out.println("El día elegido es Martes");
                    break;
                case 3:
                    System.out.println("El día elegido es Miércoles");
                    break;
                case 4:
                    System.out.println("El día elegido es Jueves");
                    break;
                case 5:
                    System.out.println("El día elegido es Viernes");
                    break;
                case 6:
                    System.out.println("El día elegido es Sábado");
                    break;
                case 7:
                    System.out.println("El día elegido es Domingo");
                    break; 
                default:
                    System.out.println("** El número introducido no es válido, por favor ingrese un número entre 1 y 7 **\n");
                    
            }//Fin switch             
    }//Fin clase principal
}//Fin clase Ejercicio2
