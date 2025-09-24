package loopExercices;


/**
 * Deberá mostrar por consola el teclado de una calculadora
 * <p>
 * 7 8 9
 * 4 5 6
 * 1 2 3
 * <p>
 * Extensión añade el 0
 * 7 8 9
 * 4 5 6
 * 1 2 3
 * 0
 */

public class _5ShowNumbersOfCalculator {


    public static void main(String[] args) {

        for (int fila = 0; fila < 3; fila++) {
            // Empezamos con 7 y vamos bajando filas (7,4,1)
            int start = 7 - fila * 3;
            for (int col = 0; col < 3; col++) {
                System.out.print((start + col) + " ");
            }
            System.out.println();

        }
    }


}
