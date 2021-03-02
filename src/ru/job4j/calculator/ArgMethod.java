package ru.job4j.calculator;

public class ArgMethod {

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void hello1(String name, int age) {
        System.out.println("Hello, " + name + " , you are " + age + " age ");
    }

    public static void hello2(int age) {
        System.out.println("You are " + age + " ");
    }

    public static void hello3(String name, String name1, String name2) {
        System.out.println("Hello, " + name);
        System.out.println("Hello, " + name1);
        System.out.println("Hello, " + name2);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        String name1 = "Petr Andreev";
        String name2 = "Artem Arsentev";
        int age = 33;
        ArgMethod.hello(name);
        ArgMethod.hello1(name, age);
        ArgMethod.hello2(age);
        ArgMethod.hello3(name, name1, name2);
    }
}
