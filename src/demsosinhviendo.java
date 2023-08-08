import java.util.Scanner;

public class demsosinhviendo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong diem");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap vao diem cua thi sinh thu" + (i+1)+ ":");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5 && arr[i] <= 10){
                count++;
            }
        }
        System.out.println("So sinh vien do la: " + count);
    }
}
