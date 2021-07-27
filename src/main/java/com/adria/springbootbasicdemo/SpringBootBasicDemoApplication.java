package com.adria.springbootbasicdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBasicDemoApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootBasicDemoApplication.class, args);
		
		if((args != null) &&(args.length > 0)){
			System.out.println("Hello, " + args[0]);
		}
		
	}

}
