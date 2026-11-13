package com.vorobey.spring.spring_course.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class ConfigWithAnnotation1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

//        Cat myCat = context.getBean("catBean", Cat.class);
//        myCat.say();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        // для работы с деньгами
        BigDecimal mani1 = new BigDecimal("0.1");
        BigDecimal mani2 = new BigDecimal("0.2");
        BigDecimal maniSum = mani1.add(mani2);
        System.out.println(maniSum);

        context.close();
    }
}

