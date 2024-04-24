package ConditionalStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab008 {
    public static void main(String[] args) {
        {
            int year=2024;
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                /*
                /*(2024%4==0 && 2024%100!=0)||2024%400==0)
            true||false    ans is true its a leap year*/
            {
                System.out.println("The year is leap  year");
            } else {
                System.out.println("The year is not a leap year");
            }
        }
    }
}
