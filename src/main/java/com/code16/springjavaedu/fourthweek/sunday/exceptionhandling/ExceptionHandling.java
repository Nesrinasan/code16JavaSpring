package com.code16.springjavaedu.fourthweek.sunday.exceptionhandling;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) throws IOException {

        FileReader file = null;
        BufferedReader fileInput = null;
        try {
            file = new FileReader("C:\\test\\a.txt");
            fileInput = new BufferedReader(file);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                file.close();
            }
            if (fileInput != null) {
                fileInput.close();
            }
        }

        try (FileReader fileReader = new FileReader("Path")) {
            fileInput = new BufferedReader(fileReader);
        }

        // try-finally blogu

        try {

        } finally {

        }


    }

}
