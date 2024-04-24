package ConditionalStatements;

import java.util.Scanner;
/*java program to print if a char is vowel or consonant*/

public class Lab007 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the character");
            char ch = sc.next().charAt(0);
            if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("The entered character is a vowel");
            } else {
                System.out.println("The entered character is a consonant");
            }
        }
    }
}
