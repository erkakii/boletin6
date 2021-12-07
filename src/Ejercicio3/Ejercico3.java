package Ejercicio3;

import java.util.*;

public class Ejercico3 {
    //-encoding utf8
    /*Diseñar un programa que nos permita calcular áreas y volúmenes
     de distintas figuras geométricas, como conos, pirámides y cilindros, según elija el usuario.*/
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int altura, opcion;
        double acono, vcono, apiramide, vpiramide, acilindro, vcilindro;
        char continuar;

        do {
            do {
                System.out.println("""
                        Elija entre una de las operaciones:
                        1: Área de cono
                        2: Volumen de cono
                        3: Área de pirámide
                        4: Volumen pirámide
                        5: Área cilindro
                        6: Volumen cilindro
                        """);
                opcion = sc.nextInt();
            } while (opcion < 1 || opcion > 6);

            System.out.println("¿Quiere realizar otra operación?");
            continuar = sc.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');
    }
}
