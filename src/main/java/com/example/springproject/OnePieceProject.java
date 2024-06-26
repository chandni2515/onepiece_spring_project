package com.example.springproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnePieceProject {

//	@Bean
//	ConnectionFactoryInitializer initializer(ConnectionFactory connectionFactory){
//		ConnectionFactoryInitializer initializer=new ConnectionFactoryInitializer();
//		initializer.setConnectionFactory(connectionFactory);
//		initializer.setDatabasePopulator(new ResourceDatabasePopulator(new ClassPathResource("V1__schema.sql")));
//		return initializer;
//	}

	public static void main(String[] args) {
		 SpringApplication.run(OnePieceProject.class, args);
	}

}
