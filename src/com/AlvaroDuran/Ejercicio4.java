/*Ejercicio_4*/
package com.AlvaroDuran;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        //Declaracion de variables
        int numero;
        char numeroPrimero, numeroUltimo; //Declaramos nuestros caraceres 

        //Variables auxiliares
        //Objeto Scanner para peticion de datos de entrada
        Scanner sc = new Scanner(System.in);

        //Entrada de datos y Proceso del programa
        
        //Con este bucle d-while obligamos a que introduzca un numero de 3 cifras
        do {
            System.out.print("Ingrese un número de 3 cifras: ");
            numero = sc.nextInt();
        } while (numero < 100 || numero > 999);

        //Convertimos nuestro numero a String cadena
        String cadena = String.valueOf(numero);
        
        //Almacenamos en nuestras variables el primer numero y el ultimo de la cadena
        numeroPrimero = cadena.charAt(0);
        numeroUltimo = cadena.charAt(cadena.length() - 1);

        //Con el condicional if ponemos las 2 opciones
        if (numeroPrimero == numeroUltimo) {
            System.out.println("El numero " + numero + " es un palíndromo.");
        } else {
            System.out.println("El numero " + numero + " no es un palíndromo.");
        }

        
    }
}
