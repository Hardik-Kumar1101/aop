package com.aop.aop;

import com.aop.aop.dto.Account;
import com.aop.aop.dto.AccountDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner (AccountDAO accountDAO){
		return args ->{

			//call the business method
			demoTheBeforeAdvice(accountDAO);
		};
	}

	private void demoTheBeforeAdvice(AccountDAO accountDAO) {
		accountDAO.addAccount();
		System.out.println("\n let's call it again!\n");
		accountDAO.addAccount();
		accountDAO.addSillyMember();
		accountDAO.addAccount(new Account());
	}
}
