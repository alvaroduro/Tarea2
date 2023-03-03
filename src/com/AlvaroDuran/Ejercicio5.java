/*Ejercicio_5*/
package com.AlvaroDuran;

import java.text.DecimalFormat;
import java.util.Scanner; //Importamos la api de la clase Scanner

public class Ejercicio5 {

    public static void main(String[] args) {

        //Declaracion de variables
        float articulo1 = 239.99f, articulo2 = 129.75f, articulo3 = 99.95f, articulo4 = 350.89f;
        float sumaTotal, ingresoTotal;
        int n, a1 = 0, a2 = 0, a3 = 0, a4 = 0;

        //Variables auxiliares
        Scanner sc = new Scanner(System.in);

        //Entrada de datos
        System.out.println("Lista de artículos");
        System.out.println("-------------------------------");
        System.out.println("Articulo\tValor");
        System.out.println(" 1\t\t239,99€\n 2\t\t129,75€\n 3\t\t99,95€\n 4\t\t350,89€");

        System.out.print("\nIntroduzca las ventas del artículo 1: ");
        a1 = sc.nextInt();
        System.out.print("Introduzca las ventas del artículo 2: ");
        a2 = sc.nextInt();
        System.out.print("Introduzca las ventas del artículo 3: ");
        a3 = sc.nextInt();
        System.out.print("Introduzca las ventas del artículo 4: ");
        a4 = sc.nextInt();

        //Proceso del programa
        //Sumamos la cantidad de articulos por su precio
        sumaTotal = (a1 * articulo1) + (a2 * articulo2) + (a3 * articulo3) + (a4 * articulo4);

        //Sumamos el 9% del total asi como su importe + el salario 
        ingresoTotal = (sumaTotal * 9) / 100 + 200;

        DecimalFormat formato = new DecimalFormat("#.00");

        System.out.println(formato.format(ingresoTotal));
        System.out.println("El ingreso total del vendedor es " + ingresoTotal + " euros");
    }
}
