package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double perim = (a + b + c) / 2;
        return Math.sqrt(perim * (perim - a) * (perim - b) * (perim - c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
