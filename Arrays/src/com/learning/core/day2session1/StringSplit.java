package com.learning.core.day2session1;

import java.util.HashSet;
import java.util.Set;

public class StringSplit {
    public static void canBeSplit(String input){
        if (input.length() % 4 != 0) {
            System.out.println("No");
            return;
        }
        Set<String> distinctStrings = new HashSet<>();
        for (int i = 0; i < input.length(); i += input.length() / 4) {
            String substring = input.substring(i, i + input.length() / 4);

            distinctStrings.add(substring);
        }
        System.out.println("Yes");
    }
}
