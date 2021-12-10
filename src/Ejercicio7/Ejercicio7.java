package Ejercicio7;

import java.util.*;

public class Ejercicio7 {
    /*Queremos pedir una fecha y validar si es correcta
     * Entrada: día, mes y año
     * Salida: si la fecha es válida o no*/
    public static Scanner sc = new Scanner(System.in);
    public static int dia, mes, anio;
    public static boolean bisiesto;

    public static void main(String[] args) {
        do {
            System.out.println("Diga el año de la fecha");
            anio = sc.nextInt();
        } while (anio <= 0);
        comprobarBisiesto(anio);
        mes = conseguirMes(mes);
        dia = conseguirdia(mes, dia);
        System.out.println("La fecha es " + dia + "/" + mes + "/" + anio);

    }

    private static int conseguirdia(int mes, int dia) {
        if (bisiesto && mes == 2) {
            do {
                System.out.println("Diga el día");
                dia = sc.nextInt();
            } while (dia < 1 || dia > 29);
        } else {
            if (mes == 2) {
                do {
                    System.out.println("Diga el día");
                    dia = sc.nextInt();
                } while (dia < 1 || dia > 28);
            } else {
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    do {
                        System.out.println("Diga el día");
                        dia = sc.nextInt();
                    } while (dia < 1 || dia > 31);
                } else {
                    do {
                        System.out.println("Diga el día");
                        dia = sc.nextInt();
                    } while (dia < 1 || dia > 30);
                }
            }
        }
        return dia;
    }
    private static int conseguirMes(int mes) {
        do {
            System.out.println("Diga el numero del mes");
            mes = sc.nextInt();
        } while (mes < 1 || mes > 12);

        return mes;
    }

    private static boolean comprobarBisiesto(int anio) {
        bisiesto = anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0);
        return bisiesto;
    }
}

