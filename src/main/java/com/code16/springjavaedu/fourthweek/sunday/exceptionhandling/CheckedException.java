package com.code16.springjavaedu.fourthweek.sunday.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

    public static void main(String[] args) {
        /**
         * Checked Exception
         */
        try {
            FileReader fileReader = new FileReader("C:\\test\\a.txt");
            //code
        } catch (Exception e) {
            System.out.println("Dosya bulunamadı");
        }
    }
}
