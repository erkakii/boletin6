package Ejercicio4;

import java.util.*;

public class Ejercicio4B {
    /*Queremos un programa que calcule la longitud, el área, el volumen o la resta de dos áreas según elija el usuario
     * Entrada: radio
     * Salida: longitud, área, volumen, resta*/

    public static Scanner sc = new Scanner(System.in);
    public static float radio1, radio2;
    public static double longitud, area1, area2, resta, volumen;

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
                        4: Resta de dos areas
                        """);
                opcion = sc.nextInt();
            } while (opcion < 1 || opcion > 4);
            System.out.println("Diga el radio de la circunferencia");
            radio1 = sc.nextInt();
            //Realizar opción
            switch (opcion) {
                case 1 -> longitudCircunferencia();
                case 2 -> {
                    area1 = areaCincunferencia(radio1, area1);
                    System.out.println("El area de la circunferencia es " + area1);
                }
                case 3 -> volumenCircunferencia();
                case 4 -> {
                    System.out.println("Diga el radio de la segunda circunferencia");
                    radio2 = sc.nextFloat();
                    area1 = areaCincunferencia(radio1, area1);
                    area2 = areaCincunferencia(radio2, area2);
                    resta = area1 - area2;
                    System.out.println("El área de la resta de las dos circunferencias es " + resta);
                }
            }
            System.out.println("¿Quiere realizar otra operación?");
            continuar = sc.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');
    }

    /**
     *
     * @param A radio de la circunferencia
     * @param B área de la circunferencia
     * @return el área de la circunferencia
     */
    private static double areaCincunferencia(float A, double B) {
        B = Math.PI * Math.pow(A, 2);
        return B;
    }

    private static void volumenCircunferencia() {
        volumen = 1.33 * Math.PI * Math.pow(radio1, 3);
        System.out.println("El volumen de la esfera es " + volumen);
    }


    private static void longitudCircunferencia() {
        longitud = Math.PI * 2 * radio1;
        System.out.println("La longitud de la circunferencia es " + longitud);
    }
}
