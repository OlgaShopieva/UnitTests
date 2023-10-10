package ru.shopieva.seminar5.number;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumberModule {
    public List<Integer> generateRandomNumber (){
        Random random = new Random();
        List<Integer> rndNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            rndNumbers.add(i);
        }
        return rndNumbers;
    }

}
