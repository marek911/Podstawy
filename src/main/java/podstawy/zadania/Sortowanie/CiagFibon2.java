package podstawy.zadania.Sortowanie;

import java.util.Scanner;

public class CiagFibon2 {

    public static void main(String[] args)
    {
        int n=10;
        for (int i = 0; i<=n-1; ++i)
        {
            System.out.print(fibonaccinumber(i) + " ");
        }
    }

    public static int fibonaccinumber(int n) {

        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fibonaccinumber(n-1) + fibonaccinumber(n-2);
    }
}

