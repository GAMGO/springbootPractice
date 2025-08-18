package org.iclass.spring_4restapi.service;

import java.util.*;

import org.iclass.spring_4restapi.dto.ProductDto;
import org.iclass.spring_4restapi.mapper.ProductMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.AllArgsConstructor;


@AllArgsConstructor
@Transactional
@Service
public class ProductService {
private ProductMapper mapper;

public List<ProductDto>selectAll(){
    return mapper.selectAll();
}
public ProductDto selectPcode(String pcode){
    return mapper.selectByPk(pcode);
}
public List<ProductDto> selectKywd(String keyword){
    return mapper.selectByKeyword(keyword);
}
public int insert(ProductDto dto){
 return mapper.insert(dto);
}

public int update(ProductDto dto){
return mapper.update(dto);
}

public int delete(String pcode){
return mapper.delete(pcode);
}
}
