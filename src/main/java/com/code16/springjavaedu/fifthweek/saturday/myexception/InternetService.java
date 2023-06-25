package com.code16.springjavaedu.fifthweek.saturday.myexception;

import com.code16.springjavaedu.fifthweek.saturday.exceptionhandling.NameStore;

public class InternetService {

	TurkcellService turkcellService;
	VodafoneService vodafoneService;

	public InternetService(TurkcellService turkcellService){
		this.turkcellService = turkcellService;
	}

	public InternetService(VodafoneService vodafoneService){
		this.vodafoneService = vodafoneService;
	}

	public void activatedPackage(String telno) {
		try{
			boolean activated = turkcellService.activatedPackagecontrol(telno);
			if(activated) {
				throw new RuntimeException("bu kullanıcının aktivasyonu vardır.");
			}
			System.out.println("testtt");
			String name = NameStore.nameList.get(0);
			System.out.println(name);

		} catch (NullPointerException e){
			System.out.println("kullanıcınn karşılaştığı hata:" + e.getMessage());
		} catch (Exception e){
			System.out.println("Bir hata ile karşılaşıldı. ");
		} finally {
			System.out.println("");
		}
		System.out.println();

	}

	public void activatedPackageWithMyException(String telno) throws BusinessException{
		boolean activated = turkcellService.activatedPackagecontrol(telno);
		if (activated) {
			throw new BusinessException("bu kullanıcının aktivasyonu vardır.");
		}
		System.out.println("testtt");
		String name = NameStore.nameList.get(0);
		System.out.println(name);


	}

	public void activatedPackageWithMyException2(String telno) throws BusinessException {
		try {
			boolean activated = turkcellService.activatedPackagecontrol(telno);

			System.out.println("testtt");
			String name = NameStore.nameList.get(0);
			System.out.println(name);

		}catch (Exception e){
			System.out.println("paket aktifleme işlemi sırasında bir hata olultur");
		//	throw new BusinessException("paket aktifleme işlemi sırasında bir hata olultur");
		}

	}


	public void activatedPackageWithMyExceptionruntimeException(String telno){
		boolean hasUser = turkcellService.findUserByTelno(telno);
		if (!hasUser) {
			throw new UserException("bu kullanıcının aktivasyonu vardır.");
		}
		System.out.println("testtt");
		String name = NameStore.nameList.get(0);
		System.out.println(name);
	}
}
