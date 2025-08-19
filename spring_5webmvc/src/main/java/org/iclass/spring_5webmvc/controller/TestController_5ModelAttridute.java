package org.iclass.spring_5webmvc.controller;

import java.util.List;

import org.iclass.spring_3mybatis.dto.ProductDto;
import org.iclass.spring_3mybatis.mapper.ProductMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@AllArgsConstructor
public class TestController_5ModelAttridute {
    private ProductMapper pMapper;
    @GetMapping("/product/list")
    public String plist(Model pm) {
        List<ProductDto> pl = pMapper.selectAll();
        pm.addAttribute("list", pl);
        return "product/list";
    }
    @GetMapping("/product/search")
    public String search(@ModelAttribute(name = "keyword") String keyword,@ModelAttribute(name="page") Integer page){
        log.info("papram : {} {}",keyword,page);
        return "product/search";
    }
    @GetMapping("/product/search2")
    public String search2(@ModelAttribute ProductDto dto){
        log.info("\t Param dto = {}",dto);
        return "product/search";
    }
    @PostMapping("/product/list")
    public String ps (@ModelAttribute(name ="keyword") String keyword, Model m){
        log.info("ModelAtrribute : {}",keyword);
        m.addAttribute("list", pMapper.searchByKeyword(keyword));
        return "product/list";
    }
}
