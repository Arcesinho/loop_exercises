package loopExercices;

import java.util.Objects;
import java.util.Scanner;

/**
 * Crea una calculadora que pueda recibir varias operaciones seguidas,
 * la calculadora no tendrá en cuenta la prioridad de operadores.
 * <p>
 * La operación terminará cuando el usuario introduzca la opcion =
 */

public class _6CalculatorWithMultipleOperations {


    public static double getNumber() {

        System.out.println("Introduce un número entero o decimal: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public static char getOperation() {

        System.out.println("Introduce la operación (+, -, *, =): ");
        Scanner sc = new Scanner(System.in);
        String operation = sc.nextLine();

        return operation.charAt(0);
    }

    public static double doOperation(char operator, double operand1, double operand2){
        double result = operand1;

        if (operator == '+'){
            result = operand1 + operand2;
        }
        if (operator == '-'){
            result = operand1 - operand2;
        }
        if (operator == '*'){
            result = operand1 * operand2;
        }
        if (operator == '/'){
            result = operand1 / operand2;
        }
        return result;
    }

    public static void main(String[] args) {

        char operator = '+';
        double total = 0.0;

        while (operator != '='){
            
            double operand1 = getNumber();

            if(total == 0.0){
                total = operand1;
            }else {
                total = doOperation(operator, total, operand1);
            }
            operator = getOperation();

        }

        System.out.println("El valor final es: "+total);

    }
}




