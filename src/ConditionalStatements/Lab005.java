package ConditionalStatements;

import java.net.SocketOption;
import java.util.Scanner;

/*Java program to check number is positive or negative or zero */

public class Lab005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) /*input in loop*/ {
            System.out.println("Enter the number");
            int in = sc.nextInt(); /*take input from user*/

            if (in == 0) {
                System.out.println("The number is" + in);
            } else if (in >= 1) {
                System.out.println("The number is positive number");
            } else {
                System.out.println("The number is negative number");
            }
        }
    }
}
