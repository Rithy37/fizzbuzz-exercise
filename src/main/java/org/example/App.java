package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static List<String> fizz(int number) {
        List<String> numbers = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            boolean isDivisibleByThreeWithoutRest = i % 3 == 0;
            if (isDivisibleByThreeWithoutRest) {
                numbers.add("fizz");
            } else {
                numbers.add(String.valueOf(i));
            }
        }
        return numbers;
    }
}