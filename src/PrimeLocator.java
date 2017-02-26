import java.util.Scanner;

/**
 * Created by james on 2/23/17.
 */
public class PrimeLocator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "";
        System.out.println("Let's locate some primes!");
        System.out.println();


        System.out.println("This application will find you any prime, " +
                "in order, from first prime number on.");

        int[] num = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
                53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        do {
            int i;

            System.out.print("Which prime number are you looking for? ");
            i = scan.nextInt();

            System.out.println("The number " + i + " prime is " + num[i - 1] + ". ");

            System.out.print("Do you want to find another number? (y/n) ");

            answer = scan.next().toLowerCase();

        } while (answer.equals("y"));

        scan.close();
        System.out.println("\nGoodbye");
    }

    public static int[] primeNum(int[] num) {

        for (int i = 0; i < num.length; i++) {

        }
        return num;
    }
}
