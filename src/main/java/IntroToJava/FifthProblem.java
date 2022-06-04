package IntroToJava;

import java.util.Scanner;

public class FifthProblem {
    public static void main(String[] args) {

        // Request : Display all the prime numbers lower than a given number

        Scanner keybaord = new Scanner(System.in);

        System.out.println("Enter your number: "+ " :D");
        int n = keybaord.nextInt();
        int x;
        System.out.println("Your prime numbers are: ");
        System.out.println("2");
        System.out.println("3");

        for (int i = 2; i < n; i++) {


                System.out.println (i);

        }

        if (n == 0 || n == 1)
            System.out.println("Invalid number");
    }

            /*Stiu ca e penibil codul, dar altfel nu stiam cum sa-l fac =))
            At least he does what he is supposed to do.
             */

}





