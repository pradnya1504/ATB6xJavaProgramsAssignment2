package JavaPrograms;


import java.util.Scanner;

public class Lab015 {
    public static void main(String[] args) {
        int[] salary={30,50,60,90,10,100,99};
       int max=0;
       for(int i=0;i<salary.length;i++){
           if(salary[i]>max){
               max=salary[i];
           }
       }
        System.out.println("Max salary is " +max);
    }
}
