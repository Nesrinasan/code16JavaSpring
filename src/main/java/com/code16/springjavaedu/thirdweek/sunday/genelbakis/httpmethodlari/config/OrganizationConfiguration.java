package com.code16.springjavaedu.thirdweek.sunday.genelbakis.httpmethodlari.config;

import com.code16.springjavaedu.thirdweek.sunday.genelbakis.httpmethodlari.model.Organization;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Configuration
public class OrganizationConfiguration {

    public static List<Organization> organizationList = new CopyOnWriteArrayList<>();

    @PostConstruct
    public void fillOrganizationRepo(){
        Organization organization = new Organization();
        organization.setId(8254);
        organization.setOrganizationName("Düğün");
        organization.setAddress("Ümraniye");

        Organization organization2 = new Organization();
        organization2.setId(535);
        organization2.setOrganizationName("Sünnet");
        organization2.setAddress("Kadıköy");

        Organization organization3 = new Organization();
        organization3.setId(78);
        organization3.setOrganizationName("Kına");
        organization3.setAddress("Ataşehir");

        Organization organization4 = new Organization();
        organization4.setId(751);
        organization4.setOrganizationName("Balo");
        organization4.setAddress("Tuzla");

        Organization organization5 = new Organization();
        organization5.setId(15464);
        organization5.setOrganizationName("Seminer");
        organization5.setAddress("Pendik");

        organizationList.add(organization);
        organizationList.add(organization2);
        organizationList.add(organization3);
        organizationList.add(organization4);
        organizationList.add(organization5);



    }




}
