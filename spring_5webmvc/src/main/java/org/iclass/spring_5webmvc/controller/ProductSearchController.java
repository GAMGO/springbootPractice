package org.iclass.spring_5webmvc.controller;

import org.iclass.spring_3mybatis.mapper.ProductMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@AllArgsConstructor
public class ProductSearchController {
private ProductMapper pm;

@PostMapping("product/searchAll")
public String searchAll(Model m){
    m.addAttribute("list",pm.selectAll());
    return "product/searchAll";
}
}
