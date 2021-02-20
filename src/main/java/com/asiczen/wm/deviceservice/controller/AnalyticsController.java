package com.asiczen.wm.deviceservice.controller;

import com.asiczen.wm.deviceservice.dto.CustomerCountDTO;
import com.asiczen.wm.deviceservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/customer")
public class AnalyticsController {

    @Autowired
    CustomerService customerService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/countCustomer")
    public CustomerCountDTO getCustomerCount(){
        return new CustomerCountDTO(customerService.countCustomers());
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/countMeters")
    public CustomerCountDTO getWMrCount(){
        return new CustomerCountDTO(customerService.countDevices());
    }
}
