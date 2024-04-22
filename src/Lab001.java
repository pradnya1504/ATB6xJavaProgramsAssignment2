public class Lab001 {
    public static void main(String[] args) {
        int a =12,b=15,c=999;
        int largest = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(largest);
    }
}
