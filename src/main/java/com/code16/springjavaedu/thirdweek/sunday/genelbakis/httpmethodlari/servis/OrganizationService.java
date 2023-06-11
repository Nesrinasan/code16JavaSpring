package com.code16.springjavaedu.thirdweek.sunday.genelbakis.httpmethodlari.servis;

import com.code16.springjavaedu.thirdweek.sunday.genelbakis.httpmethodlari.config.OrganizationConfiguration;
import com.code16.springjavaedu.thirdweek.sunday.genelbakis.httpmethodlari.model.Organization;
import com.code16.springjavaedu.thirdweek.sunday.genelbakis.httpmethodlari.model.OrganizationSaveRequestDto;
import com.code16.springjavaedu.thirdweek.sunday.genelbakis.httpmethodlari.model.OrganizationUpdateRequestDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class OrganizationService {

    public Organization getOrganization(int organizationId) {
        List<Organization> organizationList = OrganizationConfiguration.organizationList;
        for (Organization organization : organizationList) {
            if (organization.getId() == organizationId) {
                return organization;
            }
        }
        return null;
    }

    public boolean saveOrganization(OrganizationSaveRequestDto requestBody) {
        String organizationName = requestBody.getOrganizationName();
        String address = requestBody.getAddress();

        Organization organization = new Organization();
        organization.setOrganizationName(organizationName);
        organization.setAddress(address);
        int id = getId();
        organization.setId(id);

        List<Organization> organizationList = OrganizationConfiguration.organizationList;
        organizationList.add(organization);

        return true;
    }

    private int getId() {
        Random random = new Random();
        int id = random.nextInt(1000);
        return id;
    }


    public boolean updateOrganization(OrganizationUpdateRequestDto updateRequestBody) {
        int id = updateRequestBody.getId();
        List<Organization> organizationList = OrganizationConfiguration.organizationList;
        for (Organization org : organizationList) {
            if (org.getId() == id) {
                org.setOrganizationName(updateRequestBody.getOrganizationName());
                org.setAddress(updateRequestBody.getAddress());
            }
        }

        return true;

    }

    public boolean deleteOrganization(int organizationId) {
        List<Organization> organizationList = OrganizationConfiguration.organizationList;
        for (Organization organization : organizationList) {
            if (organization.getId() == organizationId) {
                organizationList.remove(organization);
            }
        }
        return true;
    }
}
