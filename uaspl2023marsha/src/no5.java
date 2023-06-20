import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTeks = 10;
        int totalTeksPanjangLima = 0;

        System.out.println("Inputkan 10 teks:");

        for (int i = 0; i < totalTeks; i++) {
            System.out.print("Teks ke-" + (i + 1) + ": ");
            String teks = scanner.nextLine();

            if (teks.length() == 5) {
                totalTeksPanjangLima++;
            }
        }

        System.out.println("Jumlah teks dengan panjang 5 karakter: " + totalTeksPanjangLima);

        scanner.close();
    }
}
