package org.example;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe una cadena:");
        String lectTeclado = scanner.nextLine();

        try {
            char resultado = CaracterEn.caracterEn(lectTeclado, 7);
            System.out.println("El carácter en la posición 7 es: " + resultado);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("No existe la posicion 7 en la cadena que ingresaste.");
        }
        scanner.close();
    }
    public class CaracterEn {
        public static char caracterEn(String cadena, int entero) {
            return cadena.charAt(entero);
        }
    }
}
