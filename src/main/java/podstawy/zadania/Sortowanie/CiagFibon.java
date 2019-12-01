package podstawy.zadania.Sortowanie;

import java.util.Scanner;

public class CiagFibon {
    public static void main(String[] args) {

        int n=10;
        int first = 0;
        int next = 1;

            System.out.print("The first " + n + " Fibonacci numbers are: ");
            System.out.print(first + " " + next);

            for (int i = 1; i<=n-2; ++i) {
                int sum = first + next;
                first = next;
                next = sum;
                System.out.print(" " + sum);
            }
        }
    }



