package com.asiczen.wm.deviceservice.seviceimpl;

import com.asiczen.wm.deviceservice.model.Customer;
import com.asiczen.wm.deviceservice.repository.CustomerRepository;
import com.asiczen.wm.deviceservice.repository.WMDetailRepository;
import com.asiczen.wm.deviceservice.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
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

    @Override
    public void updateCustomer(Customer customer) {

    }

    @Override
    public void deleteCustomer(String customerId) {
        Customer customer = customerRepository.findByCustomerId(customerId);
        try {
            customerRepository.delete(customer);
        }catch (Exception exception) {
            log.error("There is an exception in customer deletion");
        }
    }
}
