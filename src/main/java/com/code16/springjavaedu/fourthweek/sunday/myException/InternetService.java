package com.code16.springjavaedu.fourthweek.sunday.myException;

import java.util.Objects;

public class InternetService {
    //Servis Katmanı

    TurkcellService turkcellService = new TurkcellService();

    public void activatedPackage(String telno) throws BusinessException {
        String code = turkcellService.activatedPackageControl(telno);
        if (!Objects.equals(code, "200")) {
            throw new BusinessException("Bu kullanıcıya bu ay içerisinde paket aktiflemesi yapıldı.");
        }
    }

    public void activatedPackageV2(String telno) throws BusinessException {
        try {
            String code = turkcellService.activatedPackageControl(telno);
            if (!Objects.equals(code, "200")) {
                throw new BusinessException("Bu kullanıcıya bu ay içerisinde paket aktiflemesi yapıldı.");
            }
        } catch (Exception e) {
            throw new BusinessException("Turkcell servisinden veriçekerken bir hata ile karşılaşıldı.", e);

        }
    }
}
