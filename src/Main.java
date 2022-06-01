import java.util.Arrays;

import static java.util.Arrays.*;

public class Main {

    public static void main(String[]args) {
        System.out.println("---PARTE 1---");
        int[] numeros = {12, 56, 3, 24, 18, 9};
        System.out.println("La diferencia entre el valor máximo y el mínimo del array es: " + diferencia(numeros) + "\n");
        System.out.println("---PARTE 2---");
        int[] minimos = minimos(numeros);
        System.out.println("Los mínimos del array son: " + minimos[0] + " y " + minimos[1] + "\n");
        System.out.println("---PARTE 3---");
        System.out.println("El resultado de la ecuación es: " + ecuacion(5, 6.3));
    }

    public static int diferencia(int[] numeros) {
        int max = numeros[0];
        int min = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max)
                max = numeros[i];
            else if (numeros[i] < min)
                min = numeros[i];
        }
        return max-min;
    }


    public static int[] minimos(int[] numeros){

        int[] minimos = {numeros[0], numeros[1]};

        for (int i = 2; i < numeros.length; i++) {
            Arrays.sort(minimos);
            int maximoLocal = minimos[1];
            if (numeros[i] < maximoLocal) {
                minimos[1] = numeros[i];
            }
        }
        return minimos;


        /* Podríamos usar estas lineas de codigo sin usar bucles para averiguar los dos mínimos con este método:

        Arrays.sort(numeros);
        System.out.println("Los mínimos del array son: " + numeros[0] + " y " + numeros[1]);*/

    }



        public static double ecuacion(double x, double y) {
            return Math.pow(x, 2) + Math.pow((((4 * y) / 5) - x), 2);
        }







    }

