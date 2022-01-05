package com.epsi.b3a;

import com.epsi.b3a.interfaces.Fibonacci;

public class RecursiveFibonacci implements Fibonacci {

    @Override
    public long calculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return calculate(n - 1) + calculate(n - 2);
    }
}
