package ConditionalStatements;
import java.util.Scanner;

public class Lab011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("What do you want to do");
        char ch = sc.next().charAt(0);
        int result;
        switch (ch) {
            case '*':
               result =num1*num2;
                System.out.println("The result is "+result);
                break;
            case '+':
              result  =num1+num2;
                System.out.println("The result is "+result);
                break;
            case '-' :
                result = num1-num2;
                System.out.println("The result is "+result);
                break;
            case '/' :
                result  =num1/num2;
                System.out.println("The result is "+result);
                break;
            case '%' :
                result  =num1%num2;
                System.out.println("The result is "+result);
                break;
            default:
                System.out.println("Invalid input");
        }

    }
}
