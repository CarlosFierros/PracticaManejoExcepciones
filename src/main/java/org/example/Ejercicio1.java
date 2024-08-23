package org.example;

public class Ejercicio1 {
    public static void main(String[] args) {
        String cadena ="Hola mundo";
        int entero = 5;

        int resultado = caracterEn(cadena, entero);
    }

    public static int caracterEn(String cadena, int entero) {
        try {
            if (entero >= 0 && entero < cadena.length()) {
                char caracter = cadena.charAt(entero);
                System.out.println("El carácter en la posición " + entero + " es: " + caracter);
                return 0;
            }else {
                throw new Exception("La posición " + entero + " está fuera del rango de la cadena.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }
}