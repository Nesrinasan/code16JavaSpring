package com.code16.springjavaedu.secondweek.saturday.oop.constructur;

import java.util.List;

public class MusteriService {

    private String calisanType;
    private String companyName;

    {
        System.out.println("static blok");
    }

    public MusteriService(String calisanType){
        this();
        this.calisanType = calisanType;
    }

    public MusteriService(String calisanType, String companyName){
        this(calisanType);
        this.companyName = companyName;

    }
    public MusteriService(){
        System.out.println("Musteri servisi çağrıldı.");
    }

    public List<String> getMusteriListesi(){

        MusteriRepo musteriRepo = new MusteriRepo();
        if(calisanType.equals("admin")){
            return musteriRepo.getMusteriIsimListesishowAdmin();

        }else{
            return  musteriRepo.getMusteriIsimListesi();

        }
    }

    public String getCalisanType() {
        return calisanType;
    }

    public void setCalisanType(String calisanType) {
        this.calisanType = calisanType;
    }
}
