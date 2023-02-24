package tech.strategio;

import java.util.*;

public class E01 {
    static int  series[];
    public int getNthFib(int n) {
        series = new int[n];

        if (n > 1) series[1] = 1;
        return fibMem(n-1);
    }
    //Fibonacci calculate with Recursion and Memoization
    private  int fibMem(int n){
        if (n == 0 || n == 1)
            return series[n];
        else
        {
            int f = series[n];
            if (f == 0) {  // number wasn't calculated yet.

                f = fibMem(n-1) + fibMem(n-2);
                series[n] = f;
            }
            return f;
        }
    }


}
