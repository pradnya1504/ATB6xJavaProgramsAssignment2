package ConditionalStatements;

import java.util.Scanner;
/*java program to print the largest number*/
public class Lab006 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println("Enter a number");
        int b=sc.nextInt();
        System.out.println("Enter a number");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("The largest number is "+a);
        }else if (b>a && b>c){
            System.out.println("The largest number is "+b);
        }else{
            System.out.println("The largest number is "+c);
        }
    }
}
