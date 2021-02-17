package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static String numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> String.valueOf(1);
            case "Вторник", "Tuesday" -> String.valueOf(2);
            case "Среда", "Wednesday" -> String.valueOf(3);
            case "Четвер", "Thursday" -> String.valueOf(4);
            case "Пятница", "Friday" -> String.valueOf(5);
            case "Суббота", "Saturday" -> String.valueOf(6);
            case "Воскресенье", "Sunday" -> String.valueOf(7);
            default -> String.valueOf(-1);
        };
    }

    public static void main(String[] args) {
        System.out.println(numberOfDay("Пятница"));
    }
}
