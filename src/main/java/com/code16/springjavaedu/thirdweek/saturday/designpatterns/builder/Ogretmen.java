package com.code16.springjavaedu.thirdweek.saturday.designpatterns.builder;

import com.code16.springjavaedu.thirdweek.sunday.genelbakis.annotations.Ogrenci;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
public class Ogretmen {
    private String adi;
    private int yas;
    private int tckn;
    private Ogrenci ogrenci;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ogretmen ogretmen = (Ogretmen) o;
        return yas == ogretmen.yas && tckn == ogretmen.tckn && Objects.equals(adi, ogretmen.adi) && Objects.equals(ogrenci, ogretmen.ogrenci);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tckn);
    }
}
