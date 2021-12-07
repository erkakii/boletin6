package Ejercicio2;

import java.util.*;

public class Ejercicio2 {
    /*Queremos un programa que según elija el usuario y dado el radio calcule
     * la longitud, el área o el volumen
     * Entrada: Radio de la circunferencia
     * Salida: Longitud, área o volumen */
    //Iniciar escáner
    public static Scanner sc = new Scanner(System.in);
    //Declarar variables
    public static int radio;
    public static double volumen, area, longitud;

    public static void main(String[] args) {
        //Declarar variables
        int opcion;
        char continuar;
        do {
            //Pedir operación
            do {
                System.out.println("""
                        ¿Qué operación quiere hacer?
                        1: Longitud de la circunferencia
                        2: Área de la circunferencia
                        3: Volumen de circunferencia
                        """);
                opcion = sc.nextInt();
            } while (opcion < 1 || opcion > 3);
            //Pedir radio de la circunferencia
            System.out.println("Diga el radio de la circunferencia");
            radio = sc.nextInt();
            //Realizar opción
            switch (opcion) {
                case 1 -> longitudCircunferencia();
                case 2 -> areaCincunferencia();
                case 3 -> volumenCircunferencia();
            }
            System.out.println("¿Quiere realizar otra operación?");
            continuar = sc.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

    }

    /**
     * Cálculo del volumen de una esfera
     */
    private static void volumenCircunferencia() {
        volumen = 4 / 3 * Math.PI * Math.pow(radio, 3);
    }

    /**
     * Cálculo del área de una circunferencia
     */
    private static void areaCincunferencia() {
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es " + area);
    }

    /**
     * Cálculo de la longitud de una circunferencia
     */
    private static void longitudCircunferencia() {
        longitud = Math.PI * 2 * radio;
        System.out.println("La longitud de la circunferencia es " + longitud);
    }
}
