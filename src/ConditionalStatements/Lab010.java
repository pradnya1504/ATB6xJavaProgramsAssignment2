package ConditionalStatements;

public class Lab010 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 100; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            } else if(i%5==0) {
                System.out.println("buzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}