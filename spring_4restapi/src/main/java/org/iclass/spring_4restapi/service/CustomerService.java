package org.iclass.spring_4restapi.service;

import java.util.List;
import org.iclass.spring_4restapi.dto.CustomerDto;
import org.iclass.spring_4restapi.mapper.CustomerMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Transactional
@Service
public class CustomerService {
private CustomerMapper mapper;
public int join (CustomerDto dto){
return mapper.insert(dto);
}
public List<CustomerDto> allCustomer(){
    return mapper.selectAll();
} 
public CustomerDto getCustomer(String customerid){
    return mapper.selectByPk(customerid);
}
public int delete (String customerid){
return mapper.delete(customerid);
}
public int update(CustomerDto dto){
    return mapper.update(dto);
}

}
