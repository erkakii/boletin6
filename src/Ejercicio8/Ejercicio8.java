package Ejercicio8;

import java.util.*;

public class Ejercicio8 {
    /*Un programa que realice division con restas sucesivas o multiplicación mediante sumas sucesivas
     * Entrada: números para operar
     * Salida: resultado
     * Precondición: los números deben ser números enteros*/
    //Iniciar escáner y variables globales
    public static Scanner sc = new Scanner(System.in);
    public static int num1, num2;
    public static double resultado;

    public static void main(String[] args) {
        //Iniciar variables
        int opcion;
        char continuar;
        do {
            do {
                System.out.println("""
                        ¿Qué operación quiere realizar?
                        1: División
                        2: Multiplicación
                        """);
                opcion = sc.nextInt();
            } while (opcion < 1 || opcion > 2);
            if (opcion == 1) {
                num1 = pedirValores(num1);
                num2 = pedirValores(num2);
                hacerDivision();
            } else {
                num1 = pedirValores(num1);
                num2 = pedirValores(num2);
                hacerMultiplicacion();
            }


            System.out.println("¿Quiere realizar otra operación?");
            continuar = sc.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');
    }

    private static void hacerMultiplicacion() {
        resultado = 0;
        for (int i = 0; i < num2; i++){
            resultado = resultado + num1;
        }
        System.out.println("El resultado es " + resultado);
    }

    private static void hacerDivision() {
        while (num1 > 0) {
            resultado++;
            num1 = num1 - num2;
        }
        System.out.println("La división es " + resultado);
    }

    private static int pedirValores(int A) {
        System.out.println("Diga el valor del numero a dividir");
        A = sc.nextInt();
        return A;
    }
}
