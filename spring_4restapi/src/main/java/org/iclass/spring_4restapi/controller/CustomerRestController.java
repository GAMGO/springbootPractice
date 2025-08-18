package org.iclass.spring_4restapi.controller;

import org.iclass.spring_4restapi.dto.CustomerDto;
import org.iclass.spring_4restapi.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import java.util.*;
import org.springframework.http.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@Slf4j
@RestController
@AllArgsConstructor
public class CustomerRestController {
    private CustomerService service;

    @GetMapping("/api/customers")
    public ResponseEntity<List<CustomerDto>> getCustomers() {
        return ResponseEntity.ok().body(service.allCustomer());
    }

    @GetMapping("/api/customers/{customerid}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable String customerid) {
        return ResponseEntity.ok().body(service.getCustomer(customerid));
    }

    @PostMapping("/api/customers")
    public ResponseEntity<?> signup(@Valid @RequestBody CustomerDto dto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            Map<String, String> er = new HashMap<>();
            bindingResult.getFieldErrors().forEach(err -> {
                er.put(err.getField(), err.getDefaultMessage());
            });
        }
        try {
            int r = service.join(dto);
            return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("success", r));
        } catch (Exception e) {
            log.info("Sing up Failed : {}", e.getMessage());
            return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
        }
    }

    @PatchMapping("/api/customers/{customerid}")
    public ResponseEntity<?> update(@PathVariable String customerid, @Valid @RequestBody CustomerDto dto,BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            Map<String, String> er = new HashMap<>();
            bindingResult.getFieldErrors().forEach(err -> {
                er.put(err.getField(), err.getDefaultMessage());
            });
        }
        try {
            int r = service.update(dto);
            if (r == 0) {
                throw new IllegalArgumentException("{customerid} 가 없음");
            }
            return ResponseEntity.ok().body(Map.of("success", service.update(dto)));
        } catch (Exception e) {
            log.info("Update Exception : {}", e.getMessage());
            return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
        }
    }

    @DeleteMapping("/api/customers/{customerid}")
    public ResponseEntity<Integer> delete(@PathVariable String customerid) {
        int r = service.delete(customerid);
        if (r == 0) {
            throw new IllegalArgumentException("{customerid} 가 없음");
        }
        return ResponseEntity.ok().body(service.delete(customerid));
    }
}
