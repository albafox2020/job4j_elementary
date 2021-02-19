package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
        } else {
                result = 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = calc(5);
        System.out.println(result);
    }
}
