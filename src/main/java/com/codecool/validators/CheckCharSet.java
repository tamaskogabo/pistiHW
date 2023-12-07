package com.codecool.validators;

public class CheckCharSet implements Validator {
    @Override
    public boolean validate(String toValidate) {
        String[] splitted = toValidate.substring(0, toValidate.length() - 1).split("");
        for (String letter : splitted) {
            int charCode = letter.charAt(0);
            if ((charCode < 97 || charCode > 122) && letter.charAt(0) != ' ') {
                return false;
            }
        }
        return true;
    }
}
