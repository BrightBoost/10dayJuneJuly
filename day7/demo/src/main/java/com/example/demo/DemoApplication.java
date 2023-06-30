package com.example.demo;

import com.example.demo.beansoup.GreenBean;
import com.example.demo.beansoup.Ingredient;
import com.example.demo.beansoup.Lentil;
import com.example.demo.beansoup.Tomato;
import com.example.demo.models.Person;
import com.example.demo.scopedemo.Gaia;
import com.example.demo.scopedemo.Jonas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	private static ApplicationContext ac;
	public static void main(String[] args) {
		ac = SpringApplication.run(DemoApplication.class, args);
		for(String beanName : ac.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}


		for(String name : ac.getBeanNamesForType(Person.class)) {
			System.out.println(name);
			Person p1 = (Person) ac.getBean(name);
			System.out.println(p1.getName());
		}

		// bean soup exercise

		Scanner scanner = new Scanner(System.in);
		System.out.println("Which soup would you like: tomato (1), lentil (2) or green bean (3)?");
		String choice = scanner.nextLine();

		switch(choice){
			case "1":
				printBeanChoice(Tomato.class);
				break;
			case "2":
				printBeanChoice(Lentil.class);
				break;
			case "3":
				printBeanChoice(GreenBean.class);
				break;
		}

		// scope demo
		Gaia g = (Gaia) ac.getBean("gaia");
		System.out.println(g.getGoToValue());

		Jonas j = (Jonas) ac.getBean("jonas");
		System.out.println(j.getGoToValue());
	}


	// bean exercise
	public static void printBeanChoice(Class choiceClass) {
		for(String name : ac.getBeanNamesForType(choiceClass)) {
			Ingredient ingredient = (Ingredient) ac.getBean(name);
			System.out.println(ingredient.getName() + ": " + ingredient.getDescription());
		}
	}

}
