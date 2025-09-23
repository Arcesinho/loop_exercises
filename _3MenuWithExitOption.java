package loopExercices;
import java.util.Scanner;


/**
 * Recrea el menu de frases de peliculas y permite solicitar multiples frases hasta que se selecciones Sahyonara Baby!!!
 */
public class _3MenuWithExitOption {


    public static void main(String[] args) {

        enum MovieSentences {
            LORD_OF_THE_RINGS, STAR_WARS, NINJA_TURTLES, TERMINATOR
        }

        MovieSentences movSentence = MovieSentences.LORD_OF_THE_RINGS;

        int userInput = -1;

        while (userInput != 3){

            //Le muestro el menu al usuario para que sepa cual escoger
            System.out.println("Escoge una de las opciones siguientes\n" +
                    "\t1. U SHALL NOT PASS\n" +
                    "\t2. I M UR FATHER\n" +
                    "\t3. Cowabunga\n" +
                    "\t4. Shayonara Baby!!!");

            Scanner sc2 = new Scanner(System.in);
            userInput = sc2.nextInt();

            userInput =  userInput - 1;

            //Al usar un nº para saber la opcion del enumerado tenemos que usar esa sintaxis rara, de la que hablaremos en clase
            switch (MovieSentences.values()[userInput]) {
                case LORD_OF_THE_RINGS:
                    System.out.println("U shall not pass");
                    break;
                case STAR_WARS:
                    System.out.println("I m ur father");
                    break;
                case NINJA_TURTLES:
                    System.out.println("Cowabunga");
                    break;
                case TERMINATOR:
                    System.out.println("Shayonara Baby!!");
                    break;
            }
        }
    }
}







