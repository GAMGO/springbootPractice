package org.iclass.spring_4restapi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.iclass.spring_4restapi.dto.ProductDto;

@Mapper
public interface ProductMapper {
  ProductDto selectByPk(String pcode);
  List<ProductDto> selectAll();

  List<ProductDto> selectByKeyword(String keyword);

  int insert(ProductDto dto);

  int update(ProductDto dto);

  int delete(String pcode);
}
