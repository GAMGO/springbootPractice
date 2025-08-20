package org.iclass.myboard.controller;

import java.util.List;

import org.iclass.myboard.dto.CommunityDto;
import org.iclass.myboard.mapper.CommunityMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Controller
public class CommuniyController {
    private CommunityMapper cm;

    @GetMapping("/community/list")
    public String list(Model m) {
        List<CommunityDto> cd = cm.selectAll();
        m.addAttribute("list", cd);
        log.info("cd : {}",cd);
        return "/community/list";
    }
}
