import java.util.Scanner;

public class themphantuvaomang {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Nhap phan tu x can them: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Nhap vi tri muon them: ");
        int index_add = sc.nextInt();
        int[] newArr = new int[arr.length+1];
        newArr[index_add] = x;
        for (int i = 0; i < index_add; i++) {
            newArr[i] = arr[i];
        }
        for (int i = (index_add + 1); i < newArr.length; i++) {
            newArr[i] = arr [i - 1];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + ",");
        }
    }
}
