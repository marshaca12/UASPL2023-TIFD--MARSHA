import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahbilangan = 10;
        int[] angka = new int[jumlahbilangan];

        System.out.println("inputkan 10 macam angka:");

        for (int i = 0; i < jumlahbilangan; i++) {
            System.out.print("angka ke-" + (i + 1) + ": ");
            angka[i] = scanner.nextInt();
        }

        int totalKelipatanLima = 0;
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] % 5 == 0) {
                totalKelipatanLima++;
            }
        }

        System.out.println("Banyak inputan angka yang merupakan kelipatan 5: " + totalKelipatanLima);

        scanner.close();
    }
}
