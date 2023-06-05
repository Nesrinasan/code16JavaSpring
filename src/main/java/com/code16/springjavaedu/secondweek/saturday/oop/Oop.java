package com.code16.springjavaedu.secondweek.saturday.oop;

public class Oop {

    /**
     * Class'lar bizim için şablondur.
     * Bu classları ele alarak oluşturduğumuz örneklemelerden nesneleri oluştururuz.
     * Ogretmen classında adı, maası gibi alanları vardır. Bu tüm öğretmenler için geçerli bir şablondur
     * Ogretmen classından adı Ahmet olan 7000lira maaşı olan özel bir öğretmen oluşturabiliriz.
     * İşte bu şekilde Ogretmen classından bir örnekleme bir nesne oluşturmuş olduk.
     * Nesne olan somut olanı temsil eder.
     */
    public static void main(String[] args) {
        Ogretmen ogretmen = new Ogretmen();
        ogretmen.adi = "Nesrin";
        ogretmen.yasi = 25;
      //  ogretmen.getOgrenci();

    }

    /**
     * Nesneler state'lere ve behavior'a sahiptir.
     * Methodlar olarak bilinen behavior'ın yapısı
     */
    public int toplamaIslemi(int ilkSayi, int ikinciSayi){
        int toplam = ilkSayi + ikinciSayi;
        return toplam;
    }


}
