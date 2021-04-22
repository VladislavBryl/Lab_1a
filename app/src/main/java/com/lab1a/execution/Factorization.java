package com.lab1a.execution;

import java.util.ArrayList;
import java.util.List;


// Факторизація числа методом Ферма
public class Factorization {

    public static Long[] factorize(long n) {

        List<Long> multipliers = new ArrayList<>();

        while (n % 2 == 0) {
            multipliers.add(2L);
            n /= 2;
        }

        long[] sqrts = Factorization.getSumOfSquares(n);
        multipliers.add(Math.abs(sqrts[0] + sqrts[1]));
        multipliers.add(Math.abs(sqrts[0] - sqrts[1]));

        return multipliers.toArray(new Long[0]);

    }

    private static long[] getSumOfSquares(long n) {

        double x, y;

        x = Math.ceil(Math.sqrt(n));
        y = Math.pow(x, 2) - n;

        while (Math.sqrt(y) != Math.ceil(Math.sqrt(y))) {
            x++;
            y = Math.pow(x, 2) - n;
        }

        return new long[]{(long) x, (long) Math.sqrt(y)};

    }

}
