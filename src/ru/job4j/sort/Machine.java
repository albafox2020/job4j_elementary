package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int lost = money - price;
        for (int i = 0; i < coins.length; i++) {
            if (lost < coins[size]) {
                break;
            } else {
                while (lost >= coins[size]) {
                    lost = lost - coins[size];
                    rsl[size] = coins[size];
                }
            }
            size++;
        }
        return Arrays.copyOf(rsl, size);
    }
}
