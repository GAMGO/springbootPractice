package org.iclass.spring_4restapi.dto;

import lombok.Builder;
// import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
// @AllArgsConstructor // 모든 프로퍼티값 초기화하는 생성자 코드
@RequiredArgsConstructor
public class ProductDto {
    private final String pcode;
    private final String pcategory;
    private final String pname;
    private final int price;
}
