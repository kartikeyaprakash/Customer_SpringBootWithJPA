package com.cg.customerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cg.customerapp.ui.ProjectUi;

@EnableTransactionManagement
@SpringBootApplication
public class CustomerSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CustomerSpringApplication.class, args);
		ProjectUi projectui = context.getBean(ProjectUi.class);
		projectui.run();
		context.close();
	}

}
