package JavaPrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab013 {
    public static void main(String[] args) {
        /* Method 1 to print marks using arrays */
        int[] marks = {12, 15, 9, 7, 19};
        System.out.print(marks[0]);
        System.out.print(" " +marks[1]);
        System.out.print(" " +marks[2]);
        System.out.print(" " +marks[3]);
        System.out.println(" " +marks[4]);
        /* Method 2 to print marks using arrays */
        int[] marks1 = new int[5];
        marks1[0]=10;
        marks1[1]=15;
        marks1[2]=8;
        marks1[3]=11;
        marks1[4]=19;
        System.out.print(marks1[0]);
        System.out.print(" " +marks1[1]);
        System.out.print(" " +marks1[2]);
        System.out.print(" " +marks1[3]);
        System.out.println(" " +marks1[4]);
        /*Method 3 to print marks using array and for loop */
        int marks3[] = {13,17,2,6,20};
        System.out.println(marks3.length);
        for (int i = 0;i<marks3.length;i++) {
            System.out.println(marks3[i]);
        }
            /* Method 4 to print marks using Scanner array and for loop */
            Scanner sc = new Scanner(System.in);
            int[] marks4 = new int[5];
            System.out.println("Enter Maths marks");
            marks4[0] = sc.nextInt();
            System.out.println("Enter English marks");
            marks4[1] = sc.nextInt();
            System.out.println("Enter Science marks");
            marks4[2] = sc.nextInt();
            System.out.println("Enter History marks");
            marks4[3] = sc.nextInt();
            System.out.println("Enter Geography marks");
            marks4[4] = sc.nextInt();
            for(int j=0;j< marks4.length;j++){
                System.out.println(marks4[j]);
                sc.close();
            }

        }
        }