package ru.shopieva.hw6;

import java.util.ArrayList;
import java.util.List;

/*
Задание 1. Создайте программу на Python или Java, которая принимает два списка чисел и выполняет следующие действия:
a. Рассчитывает среднее значение каждого списка.
b. Сравнивает эти средние значения и выводит соответствующее сообщение:
- ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
- ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
- ""Средние значения равны"", если средние значения списков равны.
 */
public class Numbers {
    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();
        list1.add(15);
        list1.add(25);
        list1.add(35);

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);

        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        compareAverages(average1, average2);

    }

    public static double calculateAverage(List<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return (double) sum / list.size();
    }
    public static void compareAverages(double inputAverage1, double inputAverage2){
        if (inputAverage1 > inputAverage2) {
            System.out.println ("Первый список имеет большее среднее значение");
        } else if (inputAverage1 < inputAverage2) {
            System.out.println ("Второй список имеет большее среднее значение");
        } else {
            System.out.println ("Средние значения равны");
        }
    }
}
