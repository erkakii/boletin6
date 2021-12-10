package Ejercicio5;

import java.util.*;

public class Ejercicio5 {
    /*Buscamos un subprograma con el que podamos validar un número que estará entre un número mínimo y un número máximo*/
    public static Scanner sc = new Scanner(System.in);
    public static int max , min, num3;

    public static void main(String[] args) {
        //Iniciar variables
        min = 0;
        max = 99;
        //Crear método
        comprobarNumero(min, max);
        //Mostrar resultado
        System.out.println("EL número entero es " + num3);
    }

    private static int comprobarNumero(int min, int max) {
        //Comprobación del número introducido por el usuario
        do {
            System.out.println("Escriba el número entero");
            num3 = sc.nextInt();
        } while (num3 < min || num3 > max);
        return num3;
    }

}
