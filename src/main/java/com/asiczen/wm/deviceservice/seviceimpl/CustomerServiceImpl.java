package com.asiczen.wm.deviceservice.seviceimpl;

import com.asiczen.wm.deviceservice.repository.CustomerRepository;
import com.asiczen.wm.deviceservice.repository.WMDetailRepository;
import com.asiczen.wm.deviceservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    WMDetailRepository wmDetailRepository;


    @Override
    public long countCustomers() {
        return customerRepository.count();
    }

    @Override
    public long countDevices() {
        return wmDetailRepository.count();
    }
}
