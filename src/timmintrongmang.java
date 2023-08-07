import java.util.Scanner;

public class timmintrongmang {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Nhap vao so thu" + (i+1)+ ":");
//            arr[i] = sc.nextInt();
//        }
//        int min = arr[0];
//        for (int a : arr) {
//            if (a < min){
//                min = a;
//            }
//        }
//        System.out.println("Gia tri nho nhat cua mang la: " + min);
        int[] arr = {4,12,7,8,1,6,9};
        int index = minValue(arr);
        System.out.println("So nho nhat cua day la:"+ arr[index]);
    }
    public static int minValue(int[] array){
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]){
                index = i;
            }
        }
        return index;
    }
}

