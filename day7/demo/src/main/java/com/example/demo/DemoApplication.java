package com.example.demo;

import com.example.demo.models.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(DemoApplication.class, args);
		for(String beanName : ac.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}

		Person p = (Person) ac.getBean("person");
		System.out.println(p.getName());

		for(String name : ac.getBeanNamesForType(Person.class)) {
			System.out.println(name);
			Person p1 = (Person) ac.getBean(name);
			System.out.println(p1.getName());
		}
	}

}
