package Ejercicio9;

import java.util.*;

public class Ejercicio9 {
    /*Programa que escriba un cuadrado y verifique los números introducidos por el usuario*/
    public static Scanner sc = new Scanner(System.in);
    public static int lado;
    public static void main(String[] args) {
        char caracter;
        do {
            System.out.println("Diga el lado del cuadrado");
            lado = sc.nextInt();
        } while (lado < 2 || lado > 9);
        System.out.println("Diga con que carácter quiere llenar los huecos");
        caracter = sc.next().charAt(0);
        System.out.println("En construcción");
    }
}
