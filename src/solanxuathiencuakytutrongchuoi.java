import java.util.Scanner;

public class solanxuathiencuakytutrongchuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi bat ky");
        String str = sc.nextLine();
        System.out.println("Nhap vap 1 ky tu bat ky");
        String word = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (word.charAt(0) == str.charAt(i)){
                count++;
            }
        }
        System.out.println("Phan tu" + word + "xuat hien" + count + "lan trong day" + str);
    }
}
