package com.codecool.validators;

import java.util.List;

public class PasswordValidator {
    private final List<Validator> validators;

    public PasswordValidator(List<Validator> validators) {
        this.validators = validators;
    }

    public int countValidPasswords(String[] passwords) {
        int result = 0;
        for (String password : passwords) {
            if (validatePassword(password)) {
                result++;
            }
        }
        return result;
    }

    private boolean validatePassword(String toValidate) {
        for (Validator validator : validators) {
            if (!validator.validate(toValidate)) {
                return false;
            }
        }
        return true;
    }
}
