package ru.shopieva.hw1;

/* Задание 1. В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки и
   возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
   Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException.
   Не забудьте написать тесты для проверки этого поведения. */

public class Calculator {
    public static void main(String[] args) {
        System.out.println(Calculator.calculateDiscount(-2000, 15));
    }
    public static double calculateDiscount(double purchase, int discount){
        return purchase - ((purchase * discount) / 100);
    }
}
