import java.util.Scanner;

public class duongcheomatran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao dong");
        int rows = scanner.nextInt();
        System.out.println("Nhap vao cot");
        int colums = scanner.nextInt();
        int[][] arr = new int[rows][colums];
        System.out.println("Nhap vao so luong phan tu cua mang trong mang");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                System.out.println("Nhap vao dong: " + i + "cot" + j);
                arr[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println(sum);
    }
}