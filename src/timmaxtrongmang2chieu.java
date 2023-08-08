public class timmaxtrongmang2chieu {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{2,3},{3,4},{5,6},{6,7}};
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat trong mang 2 chieu la:" + max);
    }
}
