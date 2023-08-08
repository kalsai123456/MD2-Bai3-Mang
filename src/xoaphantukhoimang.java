import java.util.Scanner;

public class xoaphantukhoimang {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Nhap phan tu x can xoa: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] newArr = new int[arr.length -1];
        int index_del = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index_del = i;
            }
        }
        for (int i = 0; i < index_del; i++) {
            newArr[i] = arr[i];
            }
        for (int i = index_del; i < (arr.length - 1); i++) {
            newArr[i] = arr[i + 1];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + ",");
        }
    }
}

