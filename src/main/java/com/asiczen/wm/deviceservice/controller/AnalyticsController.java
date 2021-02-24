package com.asiczen.wm.deviceservice.controller;

import com.asiczen.wm.deviceservice.dto.CustomerCountDTO;
import com.asiczen.wm.deviceservice.model.Customer;
import com.asiczen.wm.deviceservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping(value = "/customer")
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

    @PutMapping("/update")
    public ResponseEntity<?> updateVehicle(@Valid @RequestBody Customer updateCustomerRequest) {
        customerService.updateCustomer(updateCustomerRequest);
        return new ResponseEntity<>("Consumer information updated successfully.", HttpStatus.OK);
    }

    @DeleteMapping("/{customerId}")
    public ResponseEntity<?> deleteVehicle(@Valid @PathVariable String customerId) {
        customerService.deleteCustomer(customerId);
        return new ResponseEntity<>("Consumer deleted successfully", HttpStatus.OK);
    }
}
