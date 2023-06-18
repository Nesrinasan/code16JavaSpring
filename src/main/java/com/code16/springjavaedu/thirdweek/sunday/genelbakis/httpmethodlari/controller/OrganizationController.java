package com.code16.springjavaedu.thirdweek.sunday.genelbakis.httpmethodlari.controller;

import com.code16.springjavaedu.thirdweek.sunday.genelbakis.httpmethodlari.model.Organization;
import com.code16.springjavaedu.thirdweek.sunday.genelbakis.httpmethodlari.model.OrganizationSaveRequestDto;
import com.code16.springjavaedu.thirdweek.sunday.genelbakis.httpmethodlari.model.OrganizationUpdateRequestDto;
import com.code16.springjavaedu.thirdweek.sunday.genelbakis.httpmethodlari.servis.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/organization")
public class OrganizationController {

    @Autowired
    OrganizationService organizationService;

    @GetMapping("/getOrganization")
    public Organization getOrganization(@RequestParam(value = "org_Id", required = false) Integer organizationId){
        return organizationService.getOrganization(organizationId);

    }

    @PostMapping("/saveOrganization")
    public boolean saveOrganization(@RequestBody OrganizationSaveRequestDto organizationSaveRequestBody){
        return organizationService.saveOrganization(organizationSaveRequestBody);

    }

    @PutMapping("/updateOrganization")
    public boolean updateOrganization(@RequestBody OrganizationUpdateRequestDto organizationUpdateRequestBody){
        return organizationService.updateOrganization(organizationUpdateRequestBody);

    }

    @DeleteMapping("/deleteOrganization")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateOrganization(@RequestParam int organizationId){
         organizationService.deleteOrganization(organizationId);

    }

}
