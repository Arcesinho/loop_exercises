package loopExercices;
import java.util.Random;

/**
 * Muestra N numeros random del 0 al 100 al usuario.
 * La salida debería ser algo similar a:
 *  1: 73
 *  2: 32
 *  3: 12
 *  .
 *  .
 *  .
 *
 *  Tantas veces como la constante N indique
 */

public class _1ShowNRandomNumbers {


    public static void main(String[] args) {

        // Creamos un objeto random para que nos de un numero random

        Random random = new Random();

        // Declaramos la constante N, el mínimo y máximo para randomizar números, el contador y num_position

        final int REPETITION_NUMBER = 9;
        int count = 0;
        final int MIN = 0;
        final int MAX = 100;
        int num_position = 1;

        //Ahora creamos el bucle

        while (count <= REPETITION_NUMBER){

            int number = random.nextInt(MAX - MIN + 1) + MIN;

            System.out.println(num_position + ": " +number);

            count++;
            num_position = num_position +1;
        }


    }




}
