package org.iclass.spring_4restapi.controller;

import java.util.List;

import org.iclass.spring_4restapi.dto.CustomerDto;
import org.iclass.spring_4restapi.dto.ProductDto;
import org.iclass.spring_4restapi.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;



@Slf4j
@AllArgsConstructor
@RestController
public class ProductRestController {
private ProductService service;
@GetMapping("/api/product/{pcode}")
public ResponseEntity<ProductDto> selectPcode(@PathVariable String pcode){
    return ResponseEntity.ok().body(service.selectPcode(pcode));
}
@GetMapping("/api/product")
public ResponseEntity<List<ProductDto>> getAll() {
    return ResponseEntity.ok().body(service.selectAll());
}

@GetMapping("/api/product?{keyword}")
public ResponseEntity<List<ProductDto>> selectByKeyword(@PathVariable String keyword){
    return ResponseEntity.ok().body(service.selectKywd(keyword));
}
}
