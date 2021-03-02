package ru.job4j.condition;

public class SqArea {
    public static double square(int perim, int k) {
        double height = perim / (2 * (k + 1));
        double length = height * k;
        return length * height;
    }

    public static void main(String[] args) {
        double resultSq1 = SqArea.square(4, 1);
        System.out.println(" perim = 4, k = 1, sq = 1, real = " + resultSq1);

        double resultSq2 = SqArea.square(6, 2);
        System.out.println(" perim = 6, k = 2, sq = 2, real = " + resultSq2);
    }
}
