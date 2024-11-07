package com.MavenIntro;

import com.SpringBeans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String location = "ApplicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(location);

        Student stuObj1 = (Student) context.getBean("student1");
        System.out.println(stuObj1.toString());
    }
}
