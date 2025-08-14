package org.iclass.spring_4restapi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.iclass.spring_4restapi.dto.CustomerDto;

@Mapper
public interface CustomerMapper {
  CustomerDto selectByPk(String customerid);

  List<CustomerDto> selectAll();

  int insert(CustomerDto dto);

  int update(CustomerDto dto);

  int delete(String customerid);
}
