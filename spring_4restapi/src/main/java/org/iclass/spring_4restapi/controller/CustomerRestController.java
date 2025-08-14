package org.iclass.spring_4restapi.controller;

import org.iclass.spring_4restapi.dto.CustomerDto;
import org.iclass.spring_4restapi.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import java.util.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/api/customers")
    public ResponseEntity<?> signup(@RequestBody CustomerDto dto) {
    try {
         int r = service.join(dto);
         return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("success",r));
    } catch (Exception e) {
        log.info("Sing up Failed : {}",e.getMessage());
        return ResponseEntity.badRequest().body(Map.of("error",e.getMessage()));
    }         
    }
    @PutMapping("/api/customers/{customerid}")
    public ResponseEntity<?> update (@PathVariable String customerid,@RequestBody CustomerDto dto) {
        try {
            return ResponseEntity.ok().body(Map.of("success",service.update(dto)));
        } catch (Exception e) {
            log.info("Update Exception : {}",e.getMessage());
            return ResponseEntity.badRequest().body(Map.of("error",e.getMessage()));
        }
    }

    @DeleteMapping("/api/customers/{customerid}")
        public ResponseEntity<Integer> delete(@PathVariable String customerid) {
        return ResponseEntity.ok().body(service.delete(customerid));
    }
}
