package org.iclass.spring_4restapi.controller;

import java.util.List;
import org.iclass.spring_4restapi.dto.CustomerDto;
import org.iclass.spring_4restapi.service.CustomerService;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Slf4j
@RestController
@AllArgsConstructor
public class CustomerRestController {
    private CustomerService service;

    @GetMapping("/api/customers")
    public ResponseEntity <List<CustomerDto>> getCustomers() {
        return ResponseEntity.ok().body(service.allCustomer());
    }
    @GetMapping("/api/customers/{customerid}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable String customerid) {
        return ResponseEntity.ok().body(service.getCustomer(customerid));
    }
    
}
