package Ejercicio0;

import java.util.*;

public class Ejercicio0 {
    /*Queremos un programa que lea una cadena de texto y luego la muestre en pantalla
     * Entrada: Cadena de caracteres
     * Salida: Cadena de caracteres */

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//Declarar variables
        String cadena1;
        System.out.println("Escriba la cadena que quiere imprimir");
        cadena1 = sc.next();
        System.out.println(cadena1);
    }
}
