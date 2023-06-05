package com.code16.springjavaedu.firstweek.sunday.memory;

public class Ogrenci {

    private String adi;
    public int yas;
    protected String okulAdi;
    protected String soyadi;
    protected int no;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getOkulAdi() {
        return okulAdi;
    }

    public void setOkulAdi(String okulAdi) {
        this.okulAdi = okulAdi;
    }

    public String getSoyadi() {
        return soyadi;
    }


    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "adi='" + adi + '\'' +
                ", yas=" + yas +
                ", okulAdi='" + okulAdi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Ogrenci ogrenci = (Ogrenci) obj;
        if(ogrenci == null){
            return false;
        }else if(ogrenci.no == this.no){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return no;
    }
}
