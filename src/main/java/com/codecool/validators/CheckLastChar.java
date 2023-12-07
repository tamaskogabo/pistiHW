package com.codecool.validators;

import java.util.Objects;

public class CheckLastChar implements Validator {
    @Override
    public boolean validate(String toValidate) {
        char toCompare = toValidate.charAt(toValidate.length() - 1);
        return toCompare == '!' || toCompare == '.' || toCompare == '?';
    }
}
