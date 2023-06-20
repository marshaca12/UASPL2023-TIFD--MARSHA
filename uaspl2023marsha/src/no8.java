import java.util.ArrayList;
import java.util.List;

public class no8 {
    public static void main(String[] args) {
        String[] teksArray = { "apel", "jeruk", "naga", "pisang", "anggur", "nanas" };
        int panjangMin = 5;
        int panjangMax = 7;

        List<Integer> indeksTotal = cariTeksDalamRange(teksArray, panjangMin, panjangMax);

        if (indeksTotal.isEmpty()) {
            System.out.println("Tidak ditemukan teks dengan panjang antara " + panjangMin + " dan " + panjangMax);
        } else {
            System.out.println("Teks dengan panjang antara " + panjangMin + " dan " + panjangMax
                    + " ditemukan pada indeks berikut:");
            for (int indeks : indeksTotal) {
                System.out.println(indeks);
            }
        }
    }

    public static List<Integer> cariTeksDalamRange(String[] teksArray, int panjangMin, int panjangMax) {
        List<Integer> indeksHasil = new ArrayList<>();

        for (int i = 0; i < teksArray.length; i++) {
            String teks = teksArray[i];
            int panjangTeks = teks.length();

            if (panjangTeks >= panjangMin && panjangTeks <= panjangMax) {
                indeksHasil.add(i);
            }
        }

        return indeksHasil;
    }
}
