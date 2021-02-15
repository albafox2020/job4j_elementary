package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int inRub = 140;
        int expectedRub = 2;
        int outRub = Converter.rubleToEuro(inRub);
        boolean passedRub = expectedRub == outRub;
        System.out.println("140 rubles are 2. Test result : " + passedRub);

        int inDollar = 180;
        int expectedDollar = 3;
        int outDollar = Converter.rubleToDollar(inDollar);
        boolean passedDolar = expectedDollar == outDollar;
        System.out.println("180 rubles are 3. Test result : " + passedDolar);
    }
}
