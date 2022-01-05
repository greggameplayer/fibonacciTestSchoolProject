package com.epsi.b3a;

import com.epsi.b3a.interfaces.Fibonacci;

import java.util.Map;

public class RecursiveFibonacci implements Fibonacci {

    Map<Integer, Long> cache = new java.util.HashMap<>();

    @Override
    public long calculate(int n) {
        if(cache.containsKey(n)) {
            return cache.get(n);
        }
        if (n < 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        long result = calculate(n - 1) + calculate(n - 2);
        cache.put(n, result);
        return result;
    }
}
