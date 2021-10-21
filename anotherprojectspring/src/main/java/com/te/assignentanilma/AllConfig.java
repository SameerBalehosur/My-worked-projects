package com.te.assignentanilma;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AniConfig.class,PetConfig.class})
public class AllConfig {

}
