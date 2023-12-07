package com.codecool.utils;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;

public class TextFileReader {
    public TextFileReader() {
    }
    public static String[] readFileToLinesArr(String path) throws FileNotFoundException {
        try {
            FileInputStream inputStream = new FileInputStream(path);
            String result = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
            return result.split(System.lineSeparator());
        } catch (Exception e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }
}
