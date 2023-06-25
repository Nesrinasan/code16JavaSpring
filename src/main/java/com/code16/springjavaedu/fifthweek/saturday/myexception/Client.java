package com.code16.springjavaedu.fifthweek.saturday.myexception;

public class Client {

	public static void main(String[] args) {

		TurkcellService turkcellService = new TurkcellService();
		InternetService internetService = new InternetService(turkcellService);
		try {
			internetService.activatedPackageWithMyException2("536656565");
		} catch (BusinessException e) {
			e.printStackTrace();
			System.out.println("");
			//tabloya kayıt at.
		}

		VodafoneService vodafoneService = new VodafoneService();
		InternetService internetService2 = new InternetService(turkcellService);
		try {
			internetService2.activatedPackageWithMyException2("536676767");
		} catch (BusinessException e) {
			System.out.println("Log yazdır");
		}


	}
}
