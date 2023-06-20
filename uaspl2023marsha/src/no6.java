import java.util.Arrays;

public class no6 {
    public static int[] cariText(String[] array, String targetText) {
        int count = 0;

        for (String text : array) {
            if (text.equals(targetText)) {
                count++;
            }
        }

        int[] indices = new int[count];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(targetText))
                indices[index] = i;
            index++;

        }

        return indices;
    }

    public static void main(String[] args) {
        String[] teks = { "merah", "jingga", "ungu", "kuning", "hijau", "tosca" };
        String target = "ungu";
        int[] searchResults = cariText(teks, target);

        if (searchResults.length == 0) {
            System.out.println("Teks tidak ditemukan dalam array.");
        } else {
            System.out.println("Teks '" + target + "' ditemukan pada indeks/indeks berikut:");
            System.out.println(Arrays.toString(searchResults));
        }
    }
}