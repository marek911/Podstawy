package podstawy.zadania.Sortowanie;

import java.util.Arrays;

public class Wybieranie {

    public static void main(String[] args) {
        int tablica [] = {8,2,14,20,7,45};
        System.out.println("nieposortowana tablica: " + Arrays.toString(tablica));
        selectionsort(tablica);
        System.out.println("posortowana tablica :" + Arrays.toString(tablica));

    }

        public static void selectionsort(int[]tablica){

        for (int i=0; i<tablica.length; i++){
            int indeks =i;
            for (int j=i; j<tablica.length;j++) {
                if (tablica[j] < tablica[i]) {
                    indeks = j;

                    int temp = tablica[i];
                    tablica[i] = tablica[indeks];
                    tablica[indeks] = temp;
                }
            }

        }
    }
}
