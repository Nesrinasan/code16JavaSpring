package com.code16.springjavaedu.firstweek.saturday.primtivetypse;

import java.util.Arrays;
import java.util.List;

public class Wrapper {

    /**
     * Primitive tiplerin farklı bir kullanımını sağlıyor.
     * primitive tipler üzerinde çeşitli işlemler yapmak istediğimiz zaman kullanılabilirler.
     */

    public static void main(String[] args) {

        Integer sayi = 100;
        int sayi2 = 100;

        double doubleValue = 0.3;
        Double doubleValue2= 0.5;

        Boolean booleanValue = true;
        boolean booleanValue2 = false;

        String stringValue = "10000";
        String stringValue2 = "20000";

        String toplam = stringValue + stringValue2;
        System.out.println(toplam);

        Integer integerValue = Integer.valueOf(stringValue);
        int parseInt = Integer.parseInt(stringValue2);

        int sonuc = integerValue + parseInt;
        System.out.println("sonuc" + sonuc);

        int min = Integer.min(2, 3);
        System.out.println(min);

        /**
         * Autoboxing ve unboxing kavramları çıkar karşımıza.

         * Autoboxing: int tipinin Integer wrapper'ına çevrilmesidir.
         * Java static bir dil olmasına rağmen burada compile time hatası almaz.
         * çunku her bir i değeri için Integer olaacak şekilde bir obje üretilir.
         * Örnek:
         */
//        List<Integer> integerList = new ArrayList<>();
//        for (int i = 0; i <10; i++) {
//            integerList.add(i);
//        }

        /**
         * unboxing örnek: Wrapper classtan primitive tipine dönüşümüdür.
         */
       // sumEven();

        //sumEvenPrimitive();

        intCache();
    }



    private static void sumEvenPrimitive() {
        long diziBaslamaZamani = System.currentTimeMillis();

        int sum = 0;
        eee:
        for (Integer i = 0; i < 1000000000; i++) {
            sum += i;
        }
        System.out.println("sonuc:" + sum);
        long diziBitisZamani = System.currentTimeMillis() - diziBaslamaZamani;
        System.out.println("primitive veriyi listeye ekleme süresi: " + diziBitisZamani); //389 //1889 // 3492 //2024
    }

    public static int sumEven() {
        List<Integer> li2 = Arrays.asList(11,55,2,1);
        int sum = 0;
        for (int i : li2)
                sum += i;
        return sum;
    }


    private static void intCache() {
        //-128, 127

        Integer a = 100111;
        Integer b = 100;

//        Integer c = new Integer(100);
//        Integer d = new Integer(100);

        Integer integer = Integer.valueOf(5);

        System.out.println(a == b);

//        System.out.println(a == c);


    }

}
