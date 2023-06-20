import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka");
        int angka = scanner.nextInt();

        if (isKelipatanLima(angka)) {
            System.out.println(angka + " adalah kelipatan 5.");
        } else {
            System.out.println(angka + " bukan kelipatan 5.");
        }

        scanner.close();
    }

    public static boolean isKelipatanLima(int angka) {
        if (angka < 5) {
            return false;
        } else if (angka == 5) {
            return true;
        } else {
            return isKelipatanLima(angka - 5);
        }
    }
}
