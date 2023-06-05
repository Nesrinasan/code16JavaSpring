package com.code16.springjavaedu.firstweek.sunday.memory;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {
        heapMemory();
    }


    public static void heapMemory() {
        int i = 0;
        //-Xmx20M
        List<String> list = new ArrayList<>();


        while (true) {
            int k = 0;
            String isim = new String("Nesrin");
            System.out.println(isim + "." + i);
            list.add(isim);
            i++;
        }


    }

}
