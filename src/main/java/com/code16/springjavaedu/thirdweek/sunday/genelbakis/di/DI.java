package com.code16.springjavaedu.thirdweek.sunday.genelbakis.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DI {

    /**
     * Dependdency Injection: Bir sınıfın çalışması için başka bir sınıfa olan bağımlılıklarını ortadan kaldırmayı amaçlayan patterndir.
     * İhtiyacı olan sınıf kendisine ihtiyac olunan sınfıın nasıl türetildiği ile ilgilenmez.
     * Kendisine inject edilir.
     * Dependency Injection bağımlılıkları tamamen bitirmez özellikle soyutlama üzerinden yapılırsa loosely coupled sağlar.
     *
     *
     * IOC: Sınıfların ya da servislerin; bağımlılıklarının, yaşam döngüsünün (oluşturulmasının ve yok edilmesinin)
     * kontrollerinin framework ya da bir container içerisine verilmesi işlemidir.
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        context.getBean(DIYontemleri.class);
    }

}
