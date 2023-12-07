package com.codecool.validators;

import java.util.List;

public class CheckWordCount implements Validator {
    @Override
    public boolean validate(String toValidate) {
        String[] words = toValidate.split(" ");
        return words.length > 1;
    }
}
