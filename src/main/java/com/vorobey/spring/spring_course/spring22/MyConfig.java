package com.vorobey.spring.spring_course.spring22;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("com.vorobey.spring.spring_course.spring22")
public class MyConfig {

    @Bean
    public Dog dogBean() {
        return new Dog();
    }

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean(){
        return new Person(catBean());
    }

}
