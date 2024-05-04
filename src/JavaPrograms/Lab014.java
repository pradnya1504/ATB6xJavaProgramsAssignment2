package JavaPrograms;

public class Lab014 {
    public static void main(String[] args) {
        /*Method 1 9+to double a number */
        int[] db = new int[3];
        db[0] = 12;
        db[1] = 15;
        db[2] = 22;
        System.out.println(db[0] * 2);
        System.out.println(db[1] * 2);
        System.out.println(db[2] * 2);
        /*Method 2 using for to double a number */
        int[] db1 = new int[3];
        db1[0] = 9;
        db1[1] = 7;
        db1[2] = 5;
        for (int i = 0; i < db1.length; i++) {
            System.out.println(db1[i] * 2);
        }
    }
}
