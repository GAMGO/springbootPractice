package org.iclass.sping3maybatis.mapper;

import java.util.List;
import java.util.Map;

import org.iclass.sping3maybatis.dto.BuyDto;


public interface BuyMapper {

    List<BuyDto> selectAll();

    List<BuyDto> selectByUser(String customer_id);

    List<BuyDto> selectByStuff(String pcode);

    List<BuyDto> selectByYears(String buy_date);

    int selectSum(String pcode);

    List<CustomerBuyDto> selectSaleByCustomer(String customer_id);

    // count 집계 함수
    Map<String, Integer> selectCountByYear(String year);

    List<Map<String, Object>> selectAllCountByYear();

}
