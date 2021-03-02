package ru.job4j.array;

public class Sequence {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int fill = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = fill;
                fill++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            } System.out.println();
        }

    }
}
