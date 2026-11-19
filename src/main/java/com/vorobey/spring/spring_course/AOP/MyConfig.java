package com.vorobey.spring.spring_course.AOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.vorobey.spring.spring_course.AOP")
@EnableAspectJAutoProxy
public class MyConfig {

}
