
public class no9 {
    public static int cariKelipatanLimaTerbesar(int[] array) {
        int maxAngka = Integer.MIN_VALUE;
        int maxIndexs = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                if (array[i] > maxAngka) {
                    maxAngka = array[i];
                    maxIndexs = i;
                }
            }
        }

        return maxIndexs;
    }

    public static void main(String[] args) {
        int[] numbers = { 15, 7, 20, 10, 30, 18 };

        int maxIndexs = cariKelipatanLimaTerbesar(numbers);

        if (maxIndexs == -1) {
            System.out.println("Tidak ada bagian angka kelipatan 5 dalam array.");
        } else {
            System.out.println("Angka terbesar dan kelipatan 5 ditemukan pada indeks: " + maxIndexs);
        }
    }
}
