package org.iclass.spring_5webmvc.controller;

import java.util.List;

import org.iclass.spring_5webmvc.TestDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController_4Attribute {
    @GetMapping("customer/list")
    public String list(Model m){
        m.addAttribute("page", 1);
        m.addAttribute("dto", TestDto.builder().name("고길동").address("서울").build());
        m.addAttribute("list", List.of("twice","IVE","NewJeans","gg"));

        return "customer/list";
    }
}
