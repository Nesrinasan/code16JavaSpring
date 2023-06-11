package com.code16.springjavaedu.thirdweek.sunday.genelbakis.json;

import java.util.List;
import java.util.Map;

public class SiparisSaveRequestBody {

    private List<Address> listAddress;
    private Musteri musteri;
    private Map<String, String> sorumluKisi;

    public List<Address> getListAddress() {
        return listAddress;
    }

    public void setListAddress(List<Address> listAddress) {
        this.listAddress = listAddress;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public Map<String, String> getSorumluKisi() {
        return sorumluKisi;
    }

    public void setSorumluKisi(Map<String, String> sorumluKisi) {
        this.sorumluKisi = sorumluKisi;
    }
}
