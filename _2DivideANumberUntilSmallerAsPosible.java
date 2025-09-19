package loopExercices;
import java.util.Scanner;

/**
 * Se le preguntará al usuario por un número cualquiera.
 * Se le preguntará después por cuanto lo quiere dividir
 *
 * Se calculará cuantas veces tengo que dividir el número para que ya no sea divisible y cuanto es el resto
 *
 * (Obviamente, este ejercicio se puede hacer sin bucles, pero es un ejercio de prueba, así que asegúrate de usar bucles en el cálculo)
 */
public class _2DivideANumberUntilSmallerAsPosible {

    //Creamos una función para que nos de un numero cualquiera

    private static int getNumber(){

        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero cualquiera: ");
        number = sc.nextInt();

        return number;
    }

    //Creamos una función para conseguir el divisor

    private static int getDivisor (){

        int divisor;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número por el que quieres dividirlo: ");
        divisor = sc.nextInt();

        return divisor;
    }


    public static void main(String[] args) {

        //Declaración de variables e invocación de las funciones

        int number = getNumber();
        int divisor = getDivisor();
        int division;
        int isDivisibleUntil = 0;

        //Bucle para conseguir los resultados

        while ( number > divisor){

            division = number/divisor;
            number = division;

            isDivisibleUntil++;
        }


        System.out.println("El resto es "+ number);
        System.out.println("Se puede dividir " + isDivisibleUntil + " veces hasta que no sea divisible.");

    }
}
