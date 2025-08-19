package org.iclass.spring_5webmvc;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;
@ComponentScan(basePackages ="org.iclass")
@Slf4j
@SpringBootTest
class Spring5webmvcApplicationTests {

	@Test
	void contextLoads() {

	}

}
