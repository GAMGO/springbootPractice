package org.iclass.spring_1demo;

import org.iclass.spring_1demo.old.DemoController;
import org.iclass.spring_1demo.spring.NewDemoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class Spring1demoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring1demoApplication.class, args);
		NewDemoController c = new NewDemoController();
		log.info("\n dbc334ad9b3cd9bf938ae8938fd9839e9 - {} \n", c.getClass().toString());
	}

}
