package com.te.assignentanilma;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AniConfig {

	@Bean(name="dog")
	@Primary
	public Animal getDOg() {
		Dog dog=new Dog();
//		dog.eat();
//		dog.hunt();
//		dog.sleep();
		return dog;
	}
	@Bean(name="lio")
	
	public Animal getLion() {
		Lion lion=new Lion();
//		lion.eat();
//		lion.sleep();
//		lion.hunt();
		return lion;
		
	}
}
