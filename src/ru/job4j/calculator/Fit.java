package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short Mheight) {
        return (Mheight - 100) * 1.15;
    }

    public static double womanWeight(short Wheight) {
        return (Wheight - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight((short) 187);
        double woman = Fit.womanWeight((short) 157);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 157 is " + woman);
    }
}
