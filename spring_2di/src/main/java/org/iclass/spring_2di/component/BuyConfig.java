package org.iclass.spring_2di.component;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class BuyConfig {
  @Primary
  @Bean(name = "foodBean")
  public List<String> list() {
    return List.of("라면", "과자", "탄산음료", "과일");
  }

  @Bean(name = "shopBean")
  public List<String> list2() {
    return List.of("이마트", "홈플러스", "GS25", "CU");
  }
}
