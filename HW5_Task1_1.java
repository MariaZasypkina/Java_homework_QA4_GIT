public class HW5_Task1_1 {
    /**
     * Задача №1
     * Необходимо написать 4 метода:
     * сложение 2х чисел
     * вычитание 2х чисел
     * умножение 2х чисел
     * деление 2х чисел
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(div(34583, 623));
        System.out.println(sum(34583, 623));
        System.out.println(minus(34583, 623));
        System.out.println(mul(34583, 623));
    }
}