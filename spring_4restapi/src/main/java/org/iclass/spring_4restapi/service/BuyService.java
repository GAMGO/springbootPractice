package org.iclass.spring_4restapi.service;

import java.util.List;
import org.iclass.spring_4restapi.dto.BuyDto;
import org.iclass.spring_4restapi.mapper.BuyMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.AllArgsConstructor;


@AllArgsConstructor
@Transactional
@Service
public class BuyService {
private BuyMapper mapper;

public List<BuyDto> all(){
    return mapper.selectAll();
}
public List<BuyDto> byUser(String customer_id){
    return mapper.selectByUser(customer_id);
} 
public List<BuyDto> byStuff(String pcode){
    return mapper.selectByStuff(pcode);
} 
public List<BuyDto> byYears(String buy_date){
    return mapper.selectByYears(buy_date);
} 
}
