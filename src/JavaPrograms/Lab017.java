package JavaPrograms;

public class Lab017 {
    public static void main(String[] args) {
        int[][] arr_num1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        boolean present = false;
        for (int i=0;i<arr_num1.length;i++) {
            for (int j = 0; j < arr_num1[i].length; j++) {
                if (arr_num1[i][j] == 9) {
                    present = true;
                    break;
                }
            }
            if (present) {
                break;
            }
        }
            System.out.println(present);
                }
            }
