package com.codecool.validators;

import java.util.HashMap;
import java.util.Map;

public class CheckDuplicateWords implements Validator {
    @Override
    public boolean validate(String toValidate) {
        String[] splitted = toValidate.substring(0, toValidate.length() - 1).split(" ");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String word : splitted) {
            wordsCount.put(word, 0);
        }
        for (String word : splitted) {
            int countSoFar = wordsCount.get(word);
            wordsCount.put(word, countSoFar + 1);
            if (wordsCount.get(word) > 1) {
                return false;
            }
        }
        return true;
    }
}
