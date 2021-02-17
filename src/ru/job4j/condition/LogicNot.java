package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        int a = 3;
        boolean result = LogicNot.notEven(a);
        System.out.println(a + " Not even " + result);
        boolean result2 = LogicNot.notPositive(a);
        System.out.println(a + " Not positive " + result2);
        boolean result3 = LogicNot.notEvenAndPositive(a);
        System.out.println(a + " Not even and positive " + result3);
        boolean result4 = LogicNot.evenOrNotPositive(a);
        System.out.println(a + " Even or not positive " + result4);
        boolean result5 = LogicNot.isEven(a);
        System.out.println(a + " Is even " + result5);
        boolean result6 = LogicNot.isPositive(a);
        System.out.println(a + " Is positive " + result6);
    }

}
