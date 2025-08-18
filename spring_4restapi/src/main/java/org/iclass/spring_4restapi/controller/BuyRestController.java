package org.iclass.spring_4restapi.controller;
import org.iclass.spring_4restapi.dto.BuyDto;
import org.iclass.spring_4restapi.service.BuyService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import java.util.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;



@Slf4j
@RestController
@AllArgsConstructor
public class BuyRestController {
    private BuyService service;
    @GetMapping("/api/buy")
    public ResponseEntity <List<BuyDto>>getAll() {
        return ResponseEntity.ok().body(service.all());
    }
    @GetMapping("/api/buy/{customer_id}")
    public ResponseEntity <List<BuyDto>> getUser(@PathVariable String customer_id){
    return ResponseEntity.ok().body(service.byUser(customer_id));
    }
    
    
    
}
