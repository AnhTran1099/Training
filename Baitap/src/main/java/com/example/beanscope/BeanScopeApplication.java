package com.example.beanscope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

@SpringBootApplication
public class BeanScopeApplication {

    public static void main(String[] args) {

        AbstractApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);

        Student s1 = con.getBean("studentBean", Student.class);
        s1.st = "Hello";

        System.out.println(s1.st);

        Student s2 = con.getBean("studentBean", Student.class);
        System.out.println(s2.st);
    }
//        ApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("bean.xml");
//
//        Student st1 = (Student) applicationContext.getBean("studentScopes");
//        Student st2 = (Student) applicationContext.getBean("studentScopes");
//
//        st1.setName(NAME);
//        Assert.assertEquals(NAME, st2.getName());
//
//        ((AbstractApplicationContext) applicationContext).close();


}
