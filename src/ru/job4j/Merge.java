package ru.job4j;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        for (int count = 0; count < rsl.length; count++) {
            if (i == left.length) {
                rsl[count] = right[j++];
            } else if (j == right.length) {
                rsl[count] = right[j++];
            } else if (left[i] <= right[j]) {
                rsl[count] = left[i++];
            } else if (left[i] > right[j]) {
                    rsl[count] = right[j++];
            }
        }
        return rsl;
    }
}