package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int lost = money - price;
        for (int i = 0; i < coins.length; i++) {
            if (lost == 0) {
                break;
            }
            while (lost >= coins[i]) {
                lost = lost - coins[i];
                rsl[size++] = coins[i];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
