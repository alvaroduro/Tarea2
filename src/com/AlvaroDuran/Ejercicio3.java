/*Ejercicio_3*/
package com.AlvaroDuran;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;//Importamos la clase Scaner de la api de java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {

    private static boolean salir;
    private static int numero;

    public static int dameEntero() throws InputMismatchException {

        //Variables
        Scanner sc = new Scanner(System.in); //creamos un objeto tipo Scanner para el teclado

        //Implementamos un bucle para obtener el valor correcto
        do {
            //Capturamos el error con un try-catch
            try {
                System.out.println("Introduce un número entero: ");
                Ejercicio3.numero = sc.nextInt();
                salir = true;
            } catch (Exception InputMismatchException) {
                System.err.println("Error. Debes introducir un número entero");
                salir = false;
                sc.nextLine(); //Limpiamos el teclado
            }
        } while (salir == false);//Mientras se introduzca el valor equivocado reiniciamos

        //Devolvemos el número ya controlado sin fallos
        return Ejercicio3.numero;
    }
    
    public static char dameChar(char letra) {
        
        //Comprobamos 
        return letra;
    }
    
    private LocalDate fecha;
    public static LocalDate fechaValida(LocalDate fecha) throws IllegalArgumentException{
        
        if(fecha.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha no puede ser antes de la actual");
        }
        
        return fecha;
    }

    public static void main(String[] args) {

        //Declaracion de variables
        float n;
        char tipoServicio='p';

        //Variables auxiliares
        Scanner sc = new Scanner(System.in);//Nuevo Objeto Scanner para peticion de datos de entrada

        //Entrada de datos
        /*System.out.print("Introduca un número: ");
        n = sc.nextInt(); //Almacenamos en la variable n el numero por teclado

        //Proceso del programa
        /*for (int i = 0; i < n; i++) {
            for (int k = n - 1 - i; k > 0; k--) {//Creamos un bucle for para los asteriscos
                System.out.print("*");
            }
            for (int k = 0; k < i; k++) { //Creamos otro bucle for para los espacios en blanco
                System.out.print(" ");
            }
            System.out.println("");
        }*/
 /*System.out.println("Introduce un numero");
        n = sc.nextFloat();*/
 
        Ejercicio3.dameChar('p');
        
        System.out.println("ingrese tipoServicio");
        tipoServicio = sc.next().charAt(0);
 
        if(tipoServicio !='P' || tipoServicio !='p' || tipoServicio =='A' || tipoServicio =='a'
                || tipoServicio =='D' || tipoServicio =='d') {
            System.out.println("ok");
        }else {
            System.out.println("no ok");
        }
    }//Fin clase main
}//Fin ejercicio3
