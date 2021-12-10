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
            //Mostrar menú
                do {
                    System.out.println("""
                            ¿Qué operación quiere realizar?
                            1: División
                            2: Multiplicación
                            """);
                    opcion = sc.nextInt();
                } while (opcion < 1 || opcion > 2);


            //Pedir valores
            num1 = pedirValores(num1);
            num2 = pedirValores(num2);
            //Realizar operaciones
            if (opcion == 1) {
                hacerDivision();
            } else {
                hacerMultiplicacion();
            }


            System.out.println("¿Quiere realizar otra operación?");
            continuar = sc.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');
    }

    /**
     * Calcula la multiplicación por sucesión de sumas
     */
    private static void hacerMultiplicacion() {
        //Iniciar variables
        resultado = 0;
        //Realizar cálculos
        for (int i = 0; i < num2; i++) {
            resultado = resultado + num1;
        }
        System.out.println("El resultado es " + resultado);
    }

    /**
     * Calcula la division mediante sucesión de restas
     */
    private static void hacerDivision() {
        while (num1 > num2) {
            resultado++;
            num1 = num1 - num2;
        }
        System.out.println("La división es " + resultado + " y el resto es " + num1);
    }

    /**
     * @param A el numero
     * @return el operador en cada caso
     */
    private static int pedirValores(int A) {
        System.out.println("Diga el valor del numero a dividir");
        A = sc.nextInt();
        return A;
    }
}
