package com.code16.springjavaedu.thirdweek.saturday.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListAndArrayPerformance {
    public static void main(String[] args) {
        /**
         * diziye eleman ekleme
         */
        long diziBaslamaZamani = System.currentTimeMillis();

        int[] sayiDizi = new int[100_000_000];
        for (int i = 0; i < 100_000_000; i++) {
            sayiDizi[i] = i;
        }

        long diziBitisZamani = System.currentTimeMillis() - diziBaslamaZamani;
        System.out.println("diziye eleman ekleme süresi: " +diziBitisZamani);


        long diziBaslamaZamaniList = System.currentTimeMillis();

        List<Integer> integerList = new ArrayList<>();
        for (Integer i = 0; i < 100_000_000; i++) {
            integerList.add(i);
        }

        long diziBitisZamaniList = System.currentTimeMillis() - diziBaslamaZamaniList;
        System.out.println("listeye eleman ekleme süresi: " +diziBitisZamaniList);


        /**
         * listeye eleman ekleme
         */

        /**
         * dizinin belirli indexine eleman ekleme
         */
        long diziBaslamaZamaniEkleme = System.currentTimeMillis();

        System.out.println("eleman eklenmeden önce dizinin size'ı" + sayiDizi.length);
        int[] insertElementArray = insertX(sayiDizi.length, sayiDizi, 22323323, 555555);
        System.out.println("dizinin yeni size'ı" + insertElementArray.length);

        long diziBitisZamaniekleme = System.currentTimeMillis() - diziBaslamaZamaniEkleme;
        System.out.println("diziye araya  eleman ekleme süresi: " +diziBitisZamaniekleme);

        /**
         * listenin belirli indexine eleman ekleme
         */
        long listBaslamaZamaniEkleme = System.currentTimeMillis();

        integerList.add(555555, 22323323);
        long listBitisZamaniekleme = System.currentTimeMillis() - listBaslamaZamaniEkleme;
        System.out.println("listeye araya  eleman ekleme süresi: " +listBitisZamaniekleme);

        long diziElemanSilmeZamaniBaslangic = System.currentTimeMillis();
        int[] ints = howIsIt(sayiDizi, 5465);
        System.out.println("array new size: " + ints.length);
        long diziElemanSilmeZamaniBitis = System.currentTimeMillis() - diziElemanSilmeZamaniBaslangic;
        System.out.println("diziden bir elemanın silinme süresi: " + diziElemanSilmeZamaniBitis);

        long listElemanSilmeZamaniBaslangic = System.currentTimeMillis();
        integerList.remove(1111);
        System.out.println("list new size: " + integerList.size());
        long listElemanSilmeZamaniBitis = System.currentTimeMillis() - listElemanSilmeZamaniBaslangic;
        System.out.println("listeden bir elemanın silinme süresi: " + listElemanSilmeZamaniBitis);


        /**
         * get method
         */
        long diziElemanGetirBaslangicZamani = System.currentTimeMillis();
        Integer integer = sayiDizi[4555];
        System.out.println("dizinin elemanı: " + integer);
        long diziElemanGetirBitisZamani = System.currentTimeMillis() - diziElemanGetirBaslangicZamani;
        System.out.println("diziden eleman getirme süresi: "+ diziElemanGetirBitisZamani);

        long listElemanGetirBaslangicZamani = System.currentTimeMillis();
        Integer integer1 = integerList.get(1111);
        System.out.println("list elemanı: " + integer1);
        long listElemanGetirBitisZamani = System.currentTimeMillis() - listElemanGetirBaslangicZamani;
        System.out.println("listten eleman getirme süresi: "+ listElemanGetirBitisZamani);


    }


    public static int[] howIsIt(int[] arr, int index) {

        int[] newArray = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {

            if (i == index) {
                continue;
            }

            newArray[j++] = arr[i];
        }

        return newArray;
    }

    public static int[] insertX(int arraySize, int arr[], int valueOfNewIndex, int index)
    {

        int i;

        int newarr[] = new int[arraySize + 1];

        for (i = 0; i < arraySize + 1; i++) {
            if (i < index - 1)
                newarr[i] = arr[i];
            else if (i == index - 1)
                newarr[i] = valueOfNewIndex;
            else
                newarr[i] = arr[i - 1];
        }
        return newarr;
    }



}
