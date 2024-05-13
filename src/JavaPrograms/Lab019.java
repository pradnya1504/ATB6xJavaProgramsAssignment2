package JavaPrograms;


public class Lab019 {
    public static void main(String[] args) {

        Lab019 atb6x = new Lab019();
        Lab019 payment=new Lab019();
        atb6x.gd("Meena");
        atb6x.ag(20);
        atb6x.b1("walk");
        atb6x.b2("talk");
        Lab019 courses = new Lab019();
        courses.name1("Software testing");
        courses.fee(10000);
        courses.c1("online");
        courses.c2("videoCameraEnabled");
        payment.pm1("Cash");
        atb6x.gd1("Riya");
        atb6x.ag1(32);
        atb6x.d1("eat");
        atb6x.d2("dance");
        courses.cr3("API Testing");
        courses.fee1(20000);
        courses.e1("offline");
        courses.e2("Includes Theory and Practical Explanation");
        payment.pm2("Credit card");
    }
        static void gd (String name) {
            System.out.println("Name-> "+name);
        }
        static void ag (int age) {
            System.out.println("My age is" +20);
    }
    static void b1(String walk){
        System.out.println("I can walk");
    }
    static void b2(String talk){
        System.out.println("I can talk");
    }
    static void name1(String name1){
        System.out.println("Course name-> Software Testing");
    }
    static void fee (int fee) {
        System.out.println(10000);
    }
    static void c1(String online){
        System.out.println("Its an online class");
    }
    static void c2(String morningClass){
        System.out.println("Morning class");
    }
    static void pm1(String pm1){
        System.out.println("Payment method->Cash");
        System.out.println("---------------");
    }
    static void gd1(String name1){
        System.out.println("My name is Riya");
    }
    static void ag1(int ag1){
        System.out.println("Age is " +32);
    }
    static void d1(String d1){
        System.out.println("eat");
    }
    static void d2(String d2){
        System.out.println("dance");
    }
    static void cr3(String cr3){
        System.out.println("Course name->API Testing");
    }
    static void fee1 (int fee1) {
        System.out.println(20000);
    }
    static void e1(String online){
        System.out.println("Its an online class");
    }
    static void e2(String morningClass){
        System.out.println("Evening class");
    }
    static void pm2(String credit){
        System.out.println("Payment method->Credit");
    }
}
