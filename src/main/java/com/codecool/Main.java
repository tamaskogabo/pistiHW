package com.codecool;

import com.codecool.utils.TextFileReader;
import com.codecool.validators.*;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String PATH = "src/main/resources/" + args[0];
        String[] linesArray = TextFileReader.readFileToLinesArr(PATH);
        PasswordValidator passwordValidator = new PasswordValidator(List.of(
                new CheckWordCount(),
                new CheckLastChar(),
                new CheckDuplicateWords(),
                new CheckCharSet()
        ));
        System.out.println("Helyes jelmondatok száma: " + passwordValidator.countValidPasswords(linesArray));
    }
}