package leetcode.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Richard_Yi
 * @version 1.0 2020/5/12
 */
public class T509_Fibonacci {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
        System.out.println(fib2(n));
        System.out.println(fib3(n));
    }

    private static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    private static Map<Integer, Integer> map = new HashMap<>();

    private static int fib2(int N) {
        if (N == 0 || N == 1) {
            return N;
        }
        int a;
        if (map.containsKey(N - 1)) {
            a = map.get(N - 1);
        } else {
            a = fib2(N - 1);
            map.put(N - 1, a);
        }
        int b;
        if (map.containsKey(N - 2)) {
            b = map.get(N - 2);
        } else {
            b = fib2(N - 2);
            map.put(N - 2, b);
        }
        return a + b;
    }

    private static int fib3(int N) {
        if (N < 1) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>(N);
        return help(map, N);
    }

    private static int help(Map<Integer, Integer> map, int N) {

        if (N == 1 || N == 2) {
            return 1;
        }

        if (map.containsKey(N)) {
            return map.get(N);
        }

        return help(map, N - 1) + help(map, N - 2);
    }
}
