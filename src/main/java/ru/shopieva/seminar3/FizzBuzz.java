package ru.shopieva.seminar3;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {

    /*
Создайте набор тестов, полностью покрывающих все ветви кода функции fizzBuzz. Эта
функция принимает на вход число и возвращает "Fizz", если число делится на 3, "Buzz",
если число делится на 5, и "FizzBuzz", если число делится на 15. Если число не делится ни
на 3, ни на 5, ни на 15, функция возвращает входное число в виде строки.
    */
    //Solution1
    public String FizzBuzz(int num){
        if (num % 15 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else return String.valueOf(num);
    }

    //Solution2
    /*
    public String FizzBuzz(int num){
        StringBuilder sb = new StringBuilder();
        if(num % 15 == 0) {
            sb.append("FizzBuzz");
        } else if (num % 3 == 0) {
            sb.append("Fizz");
        } else if (num % 5 == 0) {
            sb.append("Buzz");
        } else sb.append(num);
        return String.valueOf(sb);
    }
     */

    //Solution3 (array of numbers from 1 to 100)
//    public void FizzBuzz(){
//        int end = 100;
//        IntStream.rangeClosed(1, end)
//                .mapToObj(
//                        i -> i % 5 == 0 ?
//                        (i % 7 == 0 ? "FizzBuzz" : "Fizz") :
//                        (i % 7 == 0 ? "Buzz" : i))
//                .forEach(System.out::println);
//    }
}

