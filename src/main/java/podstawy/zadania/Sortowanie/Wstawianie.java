package podstawy.zadania.Sortowanie;

import java.util.Arrays;

public class Wstawianie {
    public static void main(String[] args) {


        int arr[] = {8, 4, 2, 14, 3, 9};
        System.out.println("nieposortowana tablica:" + Arrays.toString(arr));
        sort(arr);
        System.out.println("posortowana tablica: " + Arrays.toString(arr));

    }
         public static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    }


