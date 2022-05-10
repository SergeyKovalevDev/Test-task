package ru.sf.Testtask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import ru.sf.Testtask.entity.Employee;
import ru.sf.Testtask.repository.EmployeeRepository;

import java.io.*;
import java.sql.Date;
import java.util.List;

@SpringBootApplication
@Configuration
//@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) throws IOException {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class);
		EmployeeRepository repository = context.getBean(EmployeeRepository.class);
		TaskStarter taskStarter = new TaskStarter();
		taskStarter.taskStart(repository);
//		Employee employee = new Employee("employee", "Ivan", "Ivanov", "Ivanovich", Date.valueOf("2022-05-10"));
//		repository.save(employee);

//		SpringApplication.run(Application.class, args);
	}

}
