package org.iclass.spring_3mybatis;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.iclass.spring_3mybatis.mapper.CustomerMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class TESTFTEST {
@Autowired
    private CustomerMapper customerMapper;
@Test
void mapper() {

    assertNotNull(customerMapper);
}
@Test
void select (){
    log.info("{}\n",customerMapper.selectAll());
    assertNotEquals(0, customerMapper.selectAll().size());
}
}
