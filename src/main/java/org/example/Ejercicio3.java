package org.example;
import java.util.Scanner;

public class Ejercicio3 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresa un número: ");
            double numero = scanner.nextDouble();

            try {
                if (numero < 0) {
                    throw new NumeroNegativoExcepcion();
                } else {
                    double raizCuadrada = Math.sqrt(numero);
                    System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
                }
            } catch (NumeroNegativoExcepcion e) {
                System.out.println("Excepción: " + e.getMessage());
            }
            scanner.close();
        }
}
    class NumeroNegativoExcepcion extends Exception {

        public NumeroNegativoExcepcion() {
            super("El número es negativo, ingresa un numero positivo.");
        }

        public NumeroNegativoExcepcion(String mensaje) {
            super(mensaje);
        }
    }

