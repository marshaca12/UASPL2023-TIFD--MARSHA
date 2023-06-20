import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class no10 {
    public static List<Integer> cariKelipatanLima(int[] array) {
        List<Integer> kelipatan = new ArrayList<>();

        for (int number : array) {
            if (number % 5 == 0) {
                kelipatan.add(number);
            }
        }

        Collections.sort(kelipatan);

        return kelipatan;
    }

    public static void main(String[] args) {
        int[] angka = { 15, 7, 20, 10, 30, 18 };

        List<Integer> kelipatanLima = cariKelipatanLima(angka);

        if (kelipatanLima.isEmpty()) {
            System.out.println("Tidak ditemukan angka kelipatan 5 dalam array");
        } else {
            System.out.println("Angka kelipatan 5 yang terurut dari terkecil ke terbesar:");
            for (int angka1 : kelipatanLima) {
                System.out.println(angka1);
            }
        }
    }
}
