package ru.job4j.converter;

public class Converter {
    public static int rubToEuro(int value) {
        return value / 70;
    }

    public static int rubToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int inRub = 140;
        int expectRub = 2;
        int outRub = Converter.rubToEuro(inRub);
        boolean passRub = expectRub == outRub;
        System.out.println("140 rubles are 2. Test result : " + passRub);

        int inDollar = 180;
        int expectDollar = 3;
        int outDollar = Converter.rubToDollar(inDollar);
        boolean passDolar = expectDollar == outDollar;
        System.out.println("180 rubles are 3. Test result : " + passDolar);
    }
}
