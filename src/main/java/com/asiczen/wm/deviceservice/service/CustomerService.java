package com.asiczen.wm.deviceservice.service;

import com.asiczen.wm.deviceservice.model.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    long countCustomers();

    long countDevices();

    void updateCustomer(Customer customer);

    void deleteCustomer(String customerId);
}
