package com.asiczen.wm.deviceservice.service;

import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    long countCustomers();

    long countDevices();
}
