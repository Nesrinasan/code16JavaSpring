package com.code16.springjavaedu.secondweek.saturday.oop.constructur;

import java.util.ArrayList;
import java.util.List;

public class MusteriRepo {
    List<String> musteriIsimListesi = new ArrayList<>();
    List<String> musteriIsimListesishowAdmin = new ArrayList<>();


    public List<String> getMusteriIsimListesi() {
        return musteriIsimListesi;
    }

    public void setMusteriIsimListesi(List<String> musteriIsimListesi) {
        this.musteriIsimListesi = musteriIsimListesi;
    }

    public List<String> getMusteriIsimListesishowAdmin() {
        return musteriIsimListesishowAdmin;
    }

    public void setMusteriIsimListesishowAdmin(List<String> musteriIsimListesishowAdmin) {
        this.musteriIsimListesishowAdmin = musteriIsimListesishowAdmin;
    }
}
