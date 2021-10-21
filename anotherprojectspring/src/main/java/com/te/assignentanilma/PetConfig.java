package com.te.assignentanilma;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PetConfig {
	@Bean(name="pa")
	public Pet getpet() {
		Pet pet=new Pet();
		pet.setPid(98);
		return pet;
	}
}
