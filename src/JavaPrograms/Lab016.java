package JavaPrograms;

public class Lab016 {
    public static void main(String[] args) {
        /* 2d array to find max value */
        int[][] arr_num = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int max_num= Integer.MIN_VALUE;
        for (int i=0;i<arr_num.length;i++){
            for (int j=0;j<arr_num[i].length;j++){
                if (arr_num[i][j]>max_num){
                    max_num=arr_num[i][j];
                }
            }
        }
        System.out.println(max_num);
    }
}
