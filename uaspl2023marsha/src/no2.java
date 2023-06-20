import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inputkan teks: ");
        String teks = scanner.nextLine();

        if (isPanjangTeksLima(teks)) {
            System.out.println("teks memiliki panjang sebanyak 5 karakter.");
        } else {
            System.out.println("teks memiliki panjang bukan 5 karakter.");
        }

        scanner.close();
    }

    public static boolean isPanjangTeksLima(String teks) {
        return teks.length() == 5;
    }
}
