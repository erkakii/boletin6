package Ejercicio3;

import java.util.*;

public class Ejercico3 {
    //-encoding utf8
    /*Diseñar un programa que nos permita calcular áreas y volúmenes
     de distintas figuras geométricas, como conos, pirámides y cilindros, según elija el usuario.
     Precondición: Las pirámides son pirámides de base cuadrangular*/
    //Iniciar escáner
    public static Scanner sc = new Scanner(System.in);
    //Declarar variables
    public static float altura, generatriz, radio, lado;
    public static double acono, vcono, apiramide, vpiramide, acilindro, vcilindro;
    public static void main(String[] args) {
        //declarar variables
        int opcion;
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
            switch (opcion){
                case 1 -> areaCono();
                case 2 -> volumenCono();
                case 3 -> areaPiramide();
                case 4 -> volumenPiramide();
                case 5 -> areaCilindro();
                case 6 -> volumenCilindro();
            }
            System.out.println("¿Quiere realizar otra operación?");
            continuar = sc.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');
    }

    /**
     * Calcula el volumen de un cilindro
     */
    private static void volumenCilindro() {
        System.out.println("Diga el radio del cilindro");
        radio = sc.nextFloat();
        System.out.println("Diga la altura del cilindro");
        altura = sc.nextFloat();
        vcilindro = Math.PI * Math.pow(radio, 2) * altura;
        System.out.println("El volumen del cilindro es " + vcilindro);
    }

    /**
     * Calcula el área de un cilindro
     */
    private static void areaCilindro() {
        System.out.println("Diga el radio del cilindro");
        radio = sc.nextFloat();
        System.out.println("Diga la altura del cilindro");
        altura = sc.nextFloat();
        acilindro = 2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2);
        System.out.println("El área del cilindro es " + acilindro);
    }

    /**
     * Calcula el volumen de un pirámide
     */
    private static void volumenPiramide() {
        System.out.println("Diga el lado de la pirámide");
        lado = sc.nextFloat();
        System.out.println("Diga la altura de la pirámide");
        altura = sc.nextFloat();
        vpiramide = (Math.pow(lado, 2) * altura) / 3;
        System.out.println("El volumen de la pirámide es " + vpiramide);
    }

    /**
     * Calcula el área de una pirámide
     */
    private static void areaPiramide() {
        System.out.println("Diga el lado de la pirámide");
        lado = sc.nextFloat();
        System.out.println("Diga la altura de la pirámide");
        altura = sc.nextFloat();
        apiramide = (lado * altura) / 2;
    }

    /**
     * Calcula el volumen del cono
     */
    private static void volumenCono() {
        System.out.println("Diga el radio del cono");
        radio = sc.nextFloat();
        System.out.println("Diga la altura del cono");
        altura = sc.nextFloat();
        vcono = (Math.PI * Math.pow(radio, 2) * altura) / 3;
        System.out.println("El volumen del cono es " + vcono);
    }

    /**
     * Calcula el área del cono
     */
    private static void areaCono() {
        System.out.println("Diga el radio del cono");
        radio = sc.nextFloat();
        System.out.println("Diga la generatriz del cono");
        generatriz = sc.nextFloat();
        acono = Math.PI * radio * (radio + generatriz);
        System.out.println("El área del cono es " + acono);
    }
}
