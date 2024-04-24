package ConditionalStatements;

import java.util.Scanner;

public class Lab009 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number");
            int num = sc.nextInt();
            if(num==2) {
                System.out.println("The number is a prime number");
            }
            else if(num==1){
                System.out.println("The number is not a prime number");
            }else if(num%2!=0){
                System.out.println("The number is a prime number");
            }
            else {
                System.out.println("The number is not a prime number");
            }
        }
    }
}
