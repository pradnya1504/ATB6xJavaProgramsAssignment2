package JavaPrograms;

public class Lab018 {
    public static void main(String[] args) {
        int[][] arr_num3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr_num3[i][j] == arr_num3[j][j]) {
                }
                    System.out.print(arr_num3[j][i]);
            }
            System.out.println("");
        }
    }
}

