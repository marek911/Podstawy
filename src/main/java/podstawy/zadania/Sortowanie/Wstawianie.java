package podstawy.zadania.Sortowanie;

import java.util.Arrays;

public class Wstawianie {
    public static void main(String[] args) {
        int tablica [] = {8,1,14,20,7,45};
        System.out.println("nieposortowana tablica: " + Arrays.toString(tablica));
        selectionsort(tablica);
        System.out.println("posortowana tablica :" + Arrays.toString(tablica));

    }
    
        public static void selectionsort(int[]tablica){

        for (int i=0; i<tablica.length; i++){
            int min = tablica[i];
            int indeks =i;
            for (int j=i; j<tablica.length;j++){
                if(tablica[j]<min){
                    min= tablica[j];
                    indeks =j;
                }
            }
            tablica[indeks]=tablica[i];
            tablica[i]=min;

        }
    }
}
