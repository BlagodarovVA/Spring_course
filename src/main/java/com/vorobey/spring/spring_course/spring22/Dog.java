package com.vorobey.spring.spring_course.spring22;

import com.vorobey.spring.spring_course.spring_introduction.Pet;
import org.springframework.stereotype.Component;

//@Component
//@Scope("prototype")
// beanID - dog
public class Dog implements Pet {
    private String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say(){
        System.out.println("Ауффф!");
    }

}
