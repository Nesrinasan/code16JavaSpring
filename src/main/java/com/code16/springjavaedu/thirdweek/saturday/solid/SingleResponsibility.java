package com.code16.springjavaedu.thirdweek.saturday.solid;

import com.code16.springjavaedu.thirdweek.saturday.designpatterns.nonfactory.SendMessageMail;
import com.code16.springjavaedu.thirdweek.saturday.designpatterns.nonfactory.SendMessageService;
import com.code16.springjavaedu.thirdweek.saturday.designpatterns.nonfactory.SendMessageSms;

public class SingleResponsibility {
    /**
     * Her method tek bir sorumlulukta olmalıdır.
     * bir methodun uzunluğu scroll edilmeye gerek kalmayacak şekilde olmalıdır.
     */
    public void sendMailCustomer(Customer customer) {
        SendMessageMail sendMessageMail = new SendMessageMail();

        Mail mail = new Mail();
        mail.setMailAdres("test@gmail.com");
        mail.setBody("Test emsajıdır");

        if (customer.isVip()) {
            vipReportMail();
        }

//        sendMessageMail.sendMessage(mail);

    }

    private static void vipReportMail() {
        SendMessageService sendMessageService = new SendMessageService();

        Mail mailReport = new Mail();
        mailReport.setMailAdres("test@gmail.com");
        mailReport.setBody("VIP kullancıya mail atıldı");
        mailReport.setHeader("VIP Mesaj");

//        sendMessageService.sendSms(mailReport);
    }


}
