package podstawy.zadania.Sortowanie;



import java.util.Arrays;
import java.util.function.Supplier;

public class Babelkowe {
    public static void main(String[] args) {


        int[] tablica = {11, 50, 7, 4, 24, 1, 37};
        System.out.println("nieposortowna tablica :" + Arrays.toString(tablica));



        for (int i = 0; i < tablica.length - 1; i++) {
            for (int j = 0; j < tablica.length - 1; j++) {
                if (tablica[j] > tablica[j + 1]) {
                    swap(tablica, j, j + 1);
                }
            }
        }
        System.out.println("posortowana tablica :" + Arrays.toString(tablica));

    }

    private static void swap(int[] tablica, int i, int j) {
        int temp = tablica[i];
        tablica[i] = tablica[j];
        tablica[j] = temp;
    }


}


