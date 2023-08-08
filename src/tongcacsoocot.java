import java.util.Scanner;

public class tongcacsoocot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dong: ");
        int row = sc.nextInt();
        System.out.print("Nhap so cot: ");
        int cols  = sc.nextInt();
        int[][] arr = new int[row][cols];
        System.out.println("Nhap vao so luong phan tu trong mang: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Nhap vao so dong" + i + "cot" + j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Nhap vao so cot tinh tong: ");
        int a = sc.nextInt();
        int sumCols = 0;
        for (int i = 0; i < row; i++) {
            sumCols += arr[a][i];
        }
        System.out.println("Tong cua cot" + a + "la" + sumCols);
    }
}
