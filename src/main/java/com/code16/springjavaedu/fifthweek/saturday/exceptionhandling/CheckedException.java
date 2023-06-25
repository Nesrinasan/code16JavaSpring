package com.code16.springjavaedu.fifthweek.saturday.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

    public static void main(String[] args) {
        /**
         * Checked Exception
         */
        FileReader fileReader = null;
        try {
            System.out.println("hata ile karşılaşıldı.");
            fileReader = new FileReader("C:\\test\\a.txt");
            System.out.println("Hata ile karşılaşırsa... ");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("bir hata oluştur" + e.getMessage(), e);
        } catch (IOException e) {
            System.out.println("IOS exception ile karşılaşıldı.");
        }finally {
            if (fileReader != null) {
             //   fileReader.close();

            }

        }
    }
}
