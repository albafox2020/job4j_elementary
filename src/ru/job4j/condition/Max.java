package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int result = Max.max(1, 2);
        System.out.println(result);
        int result2 = Max.max(2, 3);
        System.out.println(result2);
    }
}
