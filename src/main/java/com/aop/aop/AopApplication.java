package com.aop.aop;

import com.aop.aop.dao.Account;
import com.aop.aop.dao.AccountDAO;
import com.aop.aop.dao.Student;
import com.aop.aop.services.StudentDAO;
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
	public CommandLineRunner commandLineRunner (AccountDAO accountDAO, StudentDAO studentDAO){
		return args ->{

			//call the business method
//			demoTheBeforeAdvice(accountDAO);
			demoTheStudentAdvice(studentDAO);
		};
	}

	private void demoTheStudentAdvice(StudentDAO studentDAO) {
		Student student = studentDAO.addStudent("sanjay", "varsh");
		System.out.println(student);
	}

	private void demoTheBeforeAdvice(AccountDAO accountDAO) {
		accountDAO.addAccount();
		System.out.println("\n let's call it again!\n");
		accountDAO.addAccount();
		accountDAO.addSillyMember();
		accountDAO.addAccount(new Account());
	}
}
