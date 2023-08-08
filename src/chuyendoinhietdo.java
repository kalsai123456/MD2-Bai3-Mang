import java.util.Scanner;

public class chuyendoinhietdo {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.println("Enter choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Nhap vao do F:");
                double F = sc.nextDouble();
                double C = (5.0 / 9) * (F - 32);
                System.out.println(F + "doF bang voi" + C + " doC");
            }
            case 2 -> {
                System.out.println("Nhap vao do C:");
                double C1 = sc.nextDouble();
                double F1 = (9.0 / 5) * C1 + 32;
                System.out.println(C1 + "doC bang voi" + F1 + "doF");
            }
            case 0 -> System.exit(0);
        }
    }
}
