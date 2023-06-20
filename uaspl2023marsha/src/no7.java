import java.util.ArrayList;
import java.util.List;

public class no7 {
    public static void main(String[] args) {
        String[] array = { "merah", "kuning", "tosca", "biru", "oren" };

        List<Integer> foundIndexes = menemukanTeksIndex(array, 5);

        if (foundIndexes.isEmpty()) {
            System.out.println("Tidak ada teks dengan panjang 5 karakter.");
        } else {
            System.out.println("Indeks teks dengan panjang 5 karakter:");

            for (int index : foundIndexes) {
                System.out.println(index);
            }
        }
    }

    public static List<Integer> menemukanTeksIndex(String[] array, int length) {
        List<Integer> indexe = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == length) {
                indexe.add(i);
            }
        }

        return indexe;
    }
}
